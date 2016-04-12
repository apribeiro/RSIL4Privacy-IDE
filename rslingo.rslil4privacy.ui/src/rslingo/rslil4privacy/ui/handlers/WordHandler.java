package rslingo.rslil4privacy.ui.handlers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.xmlbeans.XmlCursor;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

import com.google.common.collect.Lists;
import com.google.inject.Inject;

import rslingo.rslil4privacy.rSLIL4Privacy.Attribute;
import rslingo.rslil4privacy.rSLIL4Privacy.Collection;
import rslingo.rslil4privacy.rSLIL4Privacy.Date;
import rslingo.rslil4privacy.rSLIL4Privacy.Disclosure;
import rslingo.rslil4privacy.rSLIL4Privacy.Enforcement;
import rslingo.rslil4privacy.rSLIL4Privacy.Informative;
import rslingo.rslil4privacy.rSLIL4Privacy.Metadata;
import rslingo.rslil4privacy.rSLIL4Privacy.Policy;
import rslingo.rslil4privacy.rSLIL4Privacy.PrivateData;
import rslingo.rslil4privacy.rSLIL4Privacy.Recipient;
import rslingo.rslil4privacy.rSLIL4Privacy.RecipientPart;
import rslingo.rslil4privacy.rSLIL4Privacy.RefEnforcement;
import rslingo.rslil4privacy.rSLIL4Privacy.RefPrivateData;
import rslingo.rslil4privacy.rSLIL4Privacy.RefRecipient;
import rslingo.rslil4privacy.rSLIL4Privacy.RefService;
import rslingo.rslil4privacy.rSLIL4Privacy.Retention;
import rslingo.rslil4privacy.rSLIL4Privacy.Service;
import rslingo.rslil4privacy.rSLIL4Privacy.ServicePart;
import rslingo.rslil4privacy.rSLIL4Privacy.Usage;
import rslingo.rslil4privacy.ui.windows.MenuCommand;
import rslingo.rslil4privacy.ui.windows.MenuCommandWindow;

public class WordHandler extends AbstractHandler {

	private static final String GEN_FOLDER = "src-gen";
	private static final String DOCS_FOLDER = "docs";
	private static final String FILE_EXT = ".rslil";
	private static final String DEF_WORD_PATH = "RSL-IL4Privacy-WordTemplate.docx";

	private final String PLUGIN_PATH = Platform.getInstallLocation()
			.getURL().getPath().substring(1)
			+ "plugins/RSLingo4Privacy/";
     
    @Inject
    IResourceSetProvider resourceSetProvider;
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow workbenchWindow = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		Shell shell = workbenchWindow.getShell();
		ISelection selection = HandlerUtil.getActiveMenuSelection(event);

		// Check if the command was triggered using the ContextMenu
		if (selection != null) {
			if (selection instanceof IStructuredSelection) {
				IStructuredSelection structuredSelection = (IStructuredSelection) selection;
				IFile file = (IFile) structuredSelection.getFirstElement();
				generateWordFile(file, shell);
			} else {
				IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
				IFile file = (IFile) activeEditor.getEditorInput().getAdapter(IFile.class);
				generateWordFile(file, shell);
			}
		} else {
			MenuCommand cmd = new MenuCommand() {
				@Override
				public void execute(IProject project, IFile file) {
					generateWordFile(file, shell);
				}
			};
			MenuCommandWindow window = new MenuCommandWindow(shell, cmd, false, FILE_EXT);
			window.open();
		}

		return null;
	}

	private void generateWordFile(IFile file, Shell shell) {
		IProject project = file.getProject();
		IFolder srcGenFolder = project.getFolder(GEN_FOLDER);

		try {
			if (!srcGenFolder.exists()) {
				srcGenFolder.create(true, true, new NullProgressMonitor());
			}

			IFolder docsFolder = srcGenFolder.getFolder(DOCS_FOLDER);

			if (!docsFolder.exists()) {
				docsFolder.create(true, true, new NullProgressMonitor());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Start a new Thread to avoid blocking the UI
		Job job = new Job("Exporting to Word...") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
				//URI.createURI("platform:/resource/rslingo.rslil/src/example.rslil"), true);
		        ResourceSet resourceSet = resourceSetProvider.get(project);
		        Resource resource = resourceSet.getResource(uri, true);
				Policy policy = (Policy) resource.getContents().get(0);

				// Deal with the Main file mode
				if (policy.getMetadata() != null && policy.getImportelements().size() > 0) {
					policy = DocumentHelper.getFullPolicy(project, resourceSet, policy);
				} else if (policy.getMetadata() == null) {
					shell.getDisplay().asyncExec(new Runnable() {
						@Override
						public void run() {
							String message = "You should run this command using the Main file associated to this file!";
							MessageDialog errorDialog = new MessageDialog(shell, "RSLingo4Privacy Studio",
						    		null, message, MessageDialog.ERROR, new String[] { "OK" }, 0);
						    errorDialog.open();
						}
					});
				    return Status.OK_STATUS;
				}
				
				try {
					InputStream from = new FileInputStream(PLUGIN_PATH + DEF_WORD_PATH);
					XWPFDocument document = new XWPFDocument(from);

					writePolicyMetadata(policy.getMetadata(), document);
					writePrivateData(policy, document);
					writeServices(policy, document);
					writeRecipients(policy, document);
					writeEnforcements(policy, document);
					writeStatements(policy, document);
					
					// Write the Document in file system
					String fileName = file.getName().split(FILE_EXT)[0];
					File to = new File(project.getLocation().toOSString()
							+ "/" + GEN_FOLDER + "/" + DOCS_FOLDER 
							+ "/" + fileName + ".docx");
					FileOutputStream out = new FileOutputStream(to);
					document.write(out);
					out.close();
					document.close();

					project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());

					System.out.println(fileName + ".docx written successfully");
				} catch (Exception e) {
					e.printStackTrace();
				}
				return Status.OK_STATUS;
			}
		};
		job.setUser(true);
	    job.schedule();
	}
	

	private void writePolicyMetadata(Metadata metadata, XWPFDocument document) {
		if (metadata != null) {
			XWPFParagraph tName = DocumentHelper.getParagraph(document, "@PolicyName");
			DocumentHelper.replaceText(tName, "@PolicyName", metadata.getName());
			
			XWPFParagraph tAuthor = DocumentHelper.getParagraph(document, "@Author");
			DocumentHelper.replaceText(tAuthor, "@Author", metadata.getAuthors());

			XWPFParagraph tOrg = DocumentHelper.getParagraph(document, "@Organization");
			DocumentHelper.replaceText(tOrg, "@Organization", metadata.getOrganizations());

			XWPFParagraph tDate = DocumentHelper.getParagraph(document, "@Date");
			Date date = metadata.getDate();
			DocumentHelper.replaceText(tDate, "@Date",
				date.getDay() + "-"
				+ DocumentHelper.getNumberOfRSLILMonth(date.getMonth().getName())
				+ "-" + date.getYear());

			XWPFParagraph tVersion = DocumentHelper.getParagraph(document, "@Version");
			DocumentHelper.replaceText(tVersion, "@Version", metadata.getVersion());
			
			XWPFParagraph tIntro = DocumentHelper.getParagraph(document, "@Description");
			DocumentHelper.replaceText(tIntro, "@Description", metadata.getDescription());
		}
	}

	private void writePrivateData(Policy policy, XWPFDocument document) {
		for (PrivateData data : Lists.reverse(policy.getPrivateData())) {
			XWPFParagraph tEnd = DocumentHelper.getParagraph(document, "@PDEnd");
			// Get the position of the paragraph after the end tag
			int endPos = document.getParagraphPos(document.getPosOfParagraph(tEnd)) + 1;
			tEnd = document.getParagraphArray(endPos);
			XmlCursor cursor = tEnd.getCTP().newCursor();

			XWPFParagraph tName = DocumentHelper.getParagraph(document, "@PDName");
			XWPFParagraph nName = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nName, tName);
			DocumentHelper.replaceText(nName, "@PDName", data.getDescription()
					+ " (" + data.getName() + ")");

			XWPFParagraph tType = DocumentHelper.getParagraph(document, "@PDType");
			cursor = tEnd.getCTP().newCursor();
			XWPFParagraph nType = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nType, tType);
			DocumentHelper.replaceText(nType, "@PDType", data.getType());

			XWPFParagraph tDesc = DocumentHelper.getParagraph(document, "@PDDescription");
			cursor = tEnd.getCTP().newCursor();
			XWPFParagraph nDesc = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nDesc, tDesc);
			DocumentHelper.replaceText(nDesc, "@PDDescription", data.getDescription());

			// Copy Attributes Section
			XWPFParagraph tAttrSection = DocumentHelper.getParagraph(document, "@PDAttrName");
			int attrSecPos = document.getParagraphPos(document.getPosOfParagraph(tAttrSection) - 1);
			tAttrSection = document.getParagraphArray(attrSecPos);
			cursor = tEnd.getCTP().newCursor();
			XWPFParagraph nAttrSection = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nAttrSection, tAttrSection);
			
			XWPFParagraph nAttr = null;
			
			for (Attribute attr : data.getAttribute()) {
				XWPFParagraph tAttr = DocumentHelper.getParagraph(document, "@PDAttrName");
				cursor = tEnd.getCTP().newCursor();
				nAttr = document.insertNewParagraph(cursor);
				DocumentHelper.cloneParagraph(nAttr, tAttr);
				DocumentHelper.replaceText(nAttr, "@PDAttrName", attr.getName());
				DocumentHelper.replaceText(nAttr, "@PDAttrDescription", attr.getDescription());
			}

			// Add a newline to the last paragraph
			if (nAttr != null) {
				DocumentHelper.addLineBreakToParagraph(nAttr);
			}
		}

		// Delete Private Data Tags paragraphs
		XWPFParagraph tStart = DocumentHelper.getParagraph(document, "@PDStart");
		int posStart = document.getParagraphPos(document.getPosOfParagraph(tStart));
		XWPFParagraph tEnd = DocumentHelper.getParagraph(document, "@PDEnd");
		int posEnd = document.getParagraphPos(document.getPosOfParagraph(tEnd));
		List<XWPFParagraph> tParagraphs = new ArrayList<XWPFParagraph>(document.getParagraphs().subList(posStart, posEnd + 1));

		for (XWPFParagraph tp : tParagraphs) {
			document.removeBodyElement(document.getPosOfParagraph(tp));
		}
	}

	private void writeServices(Policy policy, XWPFDocument document) {
		HashMap<Service, ArrayList<Service>> servicesMap = new HashMap<Service, ArrayList<Service>>();
		
		for (Service service : Lists.reverse(policy.getService())) {
			if (service.getServicePart().size() > 0) {
				for (ServicePart sub : service.getServicePart()) {
					Service subService = sub.getServicePart();
					
					if (!servicesMap.containsKey(subService)) {
						servicesMap.put(subService, new ArrayList<Service>());
						servicesMap.get(subService).add(service);
					} else {
						servicesMap.get(subService).add(service);
					}
					
					for (Service refService : sub.getRefs()) {
						if (!servicesMap.containsKey(refService)) {
							servicesMap.put(refService, new ArrayList<Service>());
							servicesMap.get(refService).add(service);
						} else {
							servicesMap.get(refService).add(service);
						}
					}
				}
			} else {
				if (!servicesMap.containsKey(service)) {
					servicesMap.put(service, new ArrayList<Service>());
				}
			}
		}
			
		for (Service service : servicesMap.keySet()) {
			XWPFParagraph tEnd = DocumentHelper.getParagraph(document, "@SEnd");
			// Get the position of the paragraph after the end tag
			int endPos = document.getParagraphPos(document.getPosOfParagraph(tEnd)) + 1;
			tEnd = document.getParagraphArray(endPos);
			XmlCursor cursor = tEnd.getCTP().newCursor();

			XWPFParagraph tName = DocumentHelper.getParagraph(document, "@SName");
			XWPFParagraph nName = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nName, tName);
			DocumentHelper.replaceText(nName, "@SName", service.getServiceName()
					+ " (" + service.getName() + ")");

			XWPFParagraph tDesc = DocumentHelper.getParagraph(document, "@SDescription");
			cursor = tEnd.getCTP().newCursor();
			XWPFParagraph nDesc = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nDesc, tDesc);
			DocumentHelper.replaceText(nDesc, "@SDescription", service.getDescription());

			List<Service> subservices = Lists.reverse(servicesMap.get(service));
			
			if (subservices.size() > 0) {
				// Copy Sub-Services Section
				XWPFParagraph tSubSection = DocumentHelper.getParagraph(document, "@SSName");
				int attrSubPos = document.getParagraphPos(document.getPosOfParagraph(tSubSection) - 1);
				tSubSection = document.getParagraphArray(attrSubPos);
				cursor = tEnd.getCTP().newCursor();
				XWPFParagraph nSubSection = document.insertNewParagraph(cursor);
				DocumentHelper.cloneParagraph(nSubSection, tSubSection);
				
				for (Service subService : subservices) {
					XWPFParagraph tSSName = DocumentHelper.getParagraph(document, "@SSName");
					cursor = tEnd.getCTP().newCursor();
					XWPFParagraph nSSName = document.insertNewParagraph(cursor);
					DocumentHelper.cloneParagraph(nSSName, tSSName);
					DocumentHelper.replaceText(nSSName, "@SSName", subService.getServiceName()
							+ " (" + subService.getName() + ")");
					
					XWPFParagraph tSSDescription = DocumentHelper.getParagraph(document, "@SSDescription");
					cursor = tEnd.getCTP().newCursor();
					XWPFParagraph nSSDescription = document.insertNewParagraph(cursor);
					DocumentHelper.cloneParagraph(nSSDescription, tSSDescription);
					DocumentHelper.replaceText(nSSDescription, "@SSDescription", subService.getDescription());
				}
			}

			// Copy Private Data Section
			XWPFParagraph tPDSection = DocumentHelper.getParagraph(document, "@SPDName");
			int attrSubPos = document.getParagraphPos(document.getPosOfParagraph(tPDSection) - 1);
			tPDSection = document.getParagraphArray(attrSubPos);
			cursor = tEnd.getCTP().newCursor();
			XWPFParagraph nPDSection = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nPDSection, tPDSection);
			
			XWPFParagraph nSPDName = null;

			for (RefPrivateData refPD : service.getRefPrivateData()) {
				PrivateData data = refPD.getRefPrivateData();
				XWPFParagraph tSPDName = DocumentHelper.getParagraph(document, "@SPDName");
				cursor = tEnd.getCTP().newCursor();
				nSPDName = document.insertNewParagraph(cursor);
				DocumentHelper.cloneParagraph(nSPDName, tSPDName);
				DocumentHelper.replaceText(nSPDName, "@SPDName", data.getDescription()
						+ " (" + data.getName() + ")");
			}

			// Add a newline to the last paragraph
			if (nSPDName != null) {
				DocumentHelper.addLineBreakToParagraph(nSPDName);
			}
		}

		// Delete Services Tags paragraphs
		XWPFParagraph tStart = DocumentHelper.getParagraph(document, "@SStart");
		int posStart = document.getParagraphPos(document.getPosOfParagraph(tStart));
		XWPFParagraph tEnd = DocumentHelper.getParagraph(document, "@SEnd");
		int posEnd = document.getParagraphPos(document.getPosOfParagraph(tEnd));
		List<XWPFParagraph> tParagraphs = new ArrayList<XWPFParagraph>(document.getParagraphs().subList(posStart, posEnd + 1));

		for (XWPFParagraph tp : tParagraphs) {
			document.removeBodyElement(document.getPosOfParagraph(tp));
		}
	}

	private void writeRecipients(Policy policy, XWPFDocument document) {
		HashMap<Recipient, ArrayList<Recipient>> recipientsMap = new HashMap<Recipient, ArrayList<Recipient>>();
		
		for (Recipient recipient : Lists.reverse(policy.getRecipient())) {
			if (recipient.getRecipientPart().size() > 0) {
				for (RecipientPart sub : recipient.getRecipientPart()) {
					Recipient subRecipient = sub.getRecipientPart();
					
					if (!recipientsMap.containsKey(subRecipient)) {
						recipientsMap.put(subRecipient, new ArrayList<Recipient>());
						recipientsMap.get(subRecipient).add(recipient);
					} else {
						recipientsMap.get(subRecipient).add(recipient);
					}
					
					for (Recipient refRecipient : sub.getRefs()) {
						if (!recipientsMap.containsKey(refRecipient)) {
							recipientsMap.put(refRecipient, new ArrayList<Recipient>());
							recipientsMap.get(refRecipient).add(recipient);
						} else {
							recipientsMap.get(refRecipient).add(recipient);
						}
					}
				}
			} else {
				if (!recipientsMap.containsKey(recipient)) {
					recipientsMap.put(recipient, new ArrayList<Recipient>());
				}
			}
		}
		
		for (Recipient recipient : recipientsMap.keySet()) {
			XWPFParagraph tEnd = DocumentHelper.getParagraph(document, "@REnd");
			// Get the position of the paragraph after the end tag
			int endPos = document.getParagraphPos(document.getPosOfParagraph(tEnd)) + 1;
			tEnd = document.getParagraphArray(endPos);
			XmlCursor cursor = tEnd.getCTP().newCursor();

			XWPFParagraph tName = DocumentHelper.getParagraph(document, "@RName");
			XWPFParagraph nName = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nName, tName);
			DocumentHelper.replaceText(nName, "@RName", recipient.getRecipientName()
					+ " (" + recipient.getName() + ")");

			XWPFParagraph tDesc = DocumentHelper.getParagraph(document, "@RDescription");
			cursor = tEnd.getCTP().newCursor();
			XWPFParagraph nDesc = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nDesc, tDesc);
			DocumentHelper.replaceText(nDesc, "@RDescription", recipient.getDescription());
			
			XWPFParagraph tScope = DocumentHelper.getParagraph(document, "@RScope");
			cursor = tEnd.getCTP().newCursor();
			XWPFParagraph nScope = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nScope, tScope);
			DocumentHelper.replaceText(nScope, "@RScope", recipient.getScope());
			
			XWPFParagraph tType = DocumentHelper.getParagraph(document, "@RType");
			cursor = tEnd.getCTP().newCursor();
			XWPFParagraph nType = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nType, tType);
			DocumentHelper.replaceText(nType, "@RType", recipient.getType());

			List<Recipient> subRecipients = Lists.reverse(recipientsMap.get(recipient));
			
			if (subRecipients.size() > 0) {
				// Copy Sub-Recipients Section
				XWPFParagraph tSubSection = DocumentHelper.getParagraph(document, "@SRName");
				int attrSubPos = document.getParagraphPos(document.getPosOfParagraph(tSubSection) - 1);
				tSubSection = document.getParagraphArray(attrSubPos);
				cursor = tEnd.getCTP().newCursor();
				XWPFParagraph nSubSection = document.insertNewParagraph(cursor);
				DocumentHelper.cloneParagraph(nSubSection, tSubSection);
				
				XWPFParagraph nSRDescription = null;
				
				for (Recipient subRecipient : subRecipients) {
					XWPFParagraph tSRName = DocumentHelper.getParagraph(document, "@SRName");
					cursor = tEnd.getCTP().newCursor();
					XWPFParagraph nSRName = document.insertNewParagraph(cursor);
					DocumentHelper.cloneParagraph(nSRName, tSRName);
					DocumentHelper.replaceText(nSRName, "@SRName", subRecipient.getRecipientName()
							+ " (" + subRecipient.getName() + ")");
					
					XWPFParagraph tSRDescription = DocumentHelper.getParagraph(document, "@SRDescription");
					cursor = tEnd.getCTP().newCursor();
					nSRDescription = document.insertNewParagraph(cursor);
					DocumentHelper.cloneParagraph(nSRDescription, tSRDescription);
					DocumentHelper.replaceText(nSRDescription, "@SRDescription", subRecipient.getDescription());
				}

				// Add a newline to the last paragraph
				if (nSRDescription != null) {
					DocumentHelper.addLineBreakToParagraph(nSRDescription);
				}
			} else {
				DocumentHelper.addLineBreakToParagraph(nType);
			}
		}

		// Delete Services Tags paragraphs
		XWPFParagraph tStart = DocumentHelper.getParagraph(document, "@RStart");
		int posStart = document.getParagraphPos(document.getPosOfParagraph(tStart));
		XWPFParagraph tEnd = DocumentHelper.getParagraph(document, "@REnd");
		int posEnd = document.getParagraphPos(document.getPosOfParagraph(tEnd));
		List<XWPFParagraph> tParagraphs = new ArrayList<XWPFParagraph>(document.getParagraphs().subList(posStart, posEnd + 1));

		for (XWPFParagraph tp : tParagraphs) {
			document.removeBodyElement(document.getPosOfParagraph(tp));
		}
	}

	private void writeEnforcements(Policy policy, XWPFDocument document) {
		for (Enforcement enforcement : Lists.reverse(policy.getEnforcement())) {
			XWPFParagraph tEnd = DocumentHelper.getParagraph(document, "@EEnd");
			// Get the position of the paragraph after the end tag
			int endPos = document.getParagraphPos(document.getPosOfParagraph(tEnd)) + 1;
			tEnd = document.getParagraphArray(endPos);
			XmlCursor cursor = tEnd.getCTP().newCursor();

			XWPFParagraph tName = DocumentHelper.getParagraph(document, "@EName");
			XWPFParagraph nName = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nName, tName);
			DocumentHelper.replaceText(nName, "@EName", enforcement.getEnforcementName()
					+ " (" + enforcement.getName() + ")");

			XWPFParagraph tDesc = DocumentHelper.getParagraph(document, "@EDescription");
			cursor = tEnd.getCTP().newCursor();
			XWPFParagraph nDesc = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nDesc, tDesc);
			DocumentHelper.replaceText(nDesc, "@EDescription", enforcement.getDescription());
			
			XWPFParagraph tType = DocumentHelper.getParagraph(document, "@EType");
			cursor = tEnd.getCTP().newCursor();
			XWPFParagraph nType = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nType, tType);
			DocumentHelper.replaceText(nType, "@EType", enforcement.getType());

			// Add a newline to the last paragraph
			DocumentHelper.addLineBreakToParagraph(nType);
		}

		// Delete Services Tags paragraphs
		XWPFParagraph tStart = DocumentHelper.getParagraph(document, "@EStart");
		int posStart = document.getParagraphPos(document.getPosOfParagraph(tStart));
		XWPFParagraph tEnd = DocumentHelper.getParagraph(document, "@EEnd");
		int posEnd = document.getParagraphPos(document.getPosOfParagraph(tEnd));
		List<XWPFParagraph> tParagraphs = new ArrayList<XWPFParagraph>(document.getParagraphs().subList(posStart, posEnd + 1));

		for (XWPFParagraph tp : tParagraphs) {
			document.removeBodyElement(document.getPosOfParagraph(tp));
		}
	}
	
	private void writeStatements(Policy policy, XWPFDocument document) {
		writeInformativeStatements(document, policy);
		writeUsageStatements(document, policy);
		writeRetentionStatements(document, policy);
		writeDisclosureStatements(document, policy);
		writeCollectionStatements(document, policy);
		
		// Delete Services Tags paragraphs
		XWPFParagraph tStart = DocumentHelper.getParagraph(document, "@StStart");
		int posStart = document.getParagraphPos(document.getPosOfParagraph(tStart));
		XWPFParagraph tEnd = DocumentHelper.getParagraph(document, "@StEnd");
		int posEnd = document.getParagraphPos(document.getPosOfParagraph(tEnd));
		List<XWPFParagraph> tParagraphs = new ArrayList<XWPFParagraph>(document.getParagraphs().subList(posStart, posEnd + 1));

		for (XWPFParagraph tp : tParagraphs) {
			document.removeBodyElement(document.getPosOfParagraph(tp));
		}
	}
	
	private void writeInformativeStatements(XWPFDocument document, Policy policy) {
		for (Informative informative : Lists.reverse(policy.getInformative())) {
			XWPFParagraph tEnd = DocumentHelper.getParagraph(document, "@StEnd");
			// Get the position of the paragraph after the end tag
			int endPos = document.getParagraphPos(document.getPosOfParagraph(tEnd)) + 1;
			tEnd = document.getParagraphArray(endPos);
			XmlCursor cursor = tEnd.getCTP().newCursor();

			XWPFParagraph tName = DocumentHelper.getParagraph(document, "@StId");
			XWPFParagraph nName = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nName, tName);
			DocumentHelper.replaceText(nName, "@StId", informative.getName());

			XWPFParagraph tDesc = DocumentHelper.getParagraph(document, "@StDescription");
			cursor = tEnd.getCTP().newCursor();
			XWPFParagraph nDesc = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nDesc, tDesc);
			DocumentHelper.replaceText(nDesc, "@StDescription", informative.getDescription());
			
			XWPFParagraph tType = DocumentHelper.getParagraph(document, "@StType");
			cursor = tEnd.getCTP().newCursor();
			XWPFParagraph nType = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nType, tType);
			DocumentHelper.replaceText(nType, "@StType", "Informative");

			XWPFParagraph tModality = DocumentHelper.getParagraph(document, "@StModality");
			cursor = tEnd.getCTP().newCursor();
			XWPFParagraph nModality = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nModality, tModality);
			DocumentHelper.replaceText(nModality, "@StModality", informative.getModality());
			
			XWPFParagraph last = nModality;
			
			// Add Private Data Section
			EList<RefPrivateData> refPrivateData = informative.getRefPrivateData();
			
			if (refPrivateData.size() > 0) {
				XWPFParagraph tPDSection = DocumentHelper.getParagraph(document, "@StPDName");
				int attrSubPos = document.getParagraphPos(document.getPosOfParagraph(tPDSection) - 1);
				tPDSection = document.getParagraphArray(attrSubPos);
				cursor = tEnd.getCTP().newCursor();
				XWPFParagraph nPDSection = document.insertNewParagraph(cursor);
				DocumentHelper.cloneParagraph(nPDSection, tPDSection);

				for (RefPrivateData refPD : refPrivateData) {
					PrivateData data = refPD.getRefPrivateData();
					XWPFParagraph tStPDName = DocumentHelper.getParagraph(document, "@StPDName");
					cursor = tEnd.getCTP().newCursor();
					XWPFParagraph nStPDName = document.insertNewParagraph(cursor);
					DocumentHelper.cloneParagraph(nStPDName, tStPDName);
					DocumentHelper.replaceText(nStPDName, "@StPDName", data.getDescription()
							+ " (" + data.getName() + ")");
					last = nStPDName;
					
					for (PrivateData refMulData : refPD.getRefs()) {
						tStPDName = DocumentHelper.getParagraph(document, "@StPDName");
						cursor = tEnd.getCTP().newCursor();
						nStPDName = document.insertNewParagraph(cursor);
						DocumentHelper.cloneParagraph(nStPDName, tStPDName);
						DocumentHelper.replaceText(nStPDName, "@StPDName", refMulData.getDescription()
								+ " (" + refMulData.getName() + ")");
						last = nStPDName;
					}
				}
			}
			
			// Add Services Section
			EList<RefService> referToService = informative.getRefService();
			
			if (referToService.size() > 0) {
				XWPFParagraph tSSection = DocumentHelper.getParagraph(document, "@StSName");
				int attrSubPos = document.getParagraphPos(document.getPosOfParagraph(tSSection) - 1);
				tSSection = document.getParagraphArray(attrSubPos);
				cursor = tEnd.getCTP().newCursor();
				XWPFParagraph nSSection = document.insertNewParagraph(cursor);
				DocumentHelper.cloneParagraph(nSSection, tSSection);

				for (RefService refService : referToService) {
					Service service = refService.getRefService();
					XWPFParagraph tStSName = DocumentHelper.getParagraph(document, "@StSName");
					cursor = tEnd.getCTP().newCursor();
					XWPFParagraph nStSName = document.insertNewParagraph(cursor);
					DocumentHelper.cloneParagraph(nStSName, tStSName);
					DocumentHelper.replaceText(nStSName, "@StSName", service.getServiceName()
							+ " (" + service.getName() + ")");
					last = nStSName;
					
					for (Service refMulService : refService.getRefs()) {
						tStSName = DocumentHelper.getParagraph(document, "@StSName");
						cursor = tEnd.getCTP().newCursor();
						nStSName = document.insertNewParagraph(cursor);
						DocumentHelper.cloneParagraph(nStSName, tStSName);
						DocumentHelper.replaceText(nStSName, "@StSName", refMulService.getServiceName()
								+ " (" + refMulService.getName() + ")");
						last = nStSName;
					}
				}
			}
			
			// Add Enforcements Section
			EList<RefEnforcement> referToEnf = informative.getRefEnforcement();
			
			if (referToEnf.size() > 0) {
				XWPFParagraph tESection = DocumentHelper.getParagraph(document, "@StEName");
				int attrSubPos = document.getParagraphPos(document.getPosOfParagraph(tESection) - 1);
				tESection = document.getParagraphArray(attrSubPos);
				cursor = tEnd.getCTP().newCursor();
				XWPFParagraph nESection = document.insertNewParagraph(cursor);
				DocumentHelper.cloneParagraph(nESection, tESection);

				for (RefEnforcement refEnf : referToEnf) {
					Enforcement enforcement = refEnf.getRefEnforcement();
					XWPFParagraph tStEName = DocumentHelper.getParagraph(document, "@StEName");
					cursor = tEnd.getCTP().newCursor();
					XWPFParagraph nStEName = document.insertNewParagraph(cursor);
					DocumentHelper.cloneParagraph(nStEName, tStEName);
					DocumentHelper.replaceText(nStEName, "@StEName", enforcement.getEnforcementName()
							+ " (" + enforcement.getName() + ")");
					last = nStEName;
					
					for (Enforcement refMulEnf : refEnf.getRefs()) {
						tStEName = DocumentHelper.getParagraph(document, "@StEName");
						cursor = tEnd.getCTP().newCursor();
						nStEName = document.insertNewParagraph(cursor);
						DocumentHelper.cloneParagraph(nStEName, tStEName);
						DocumentHelper.replaceText(nStEName, "@StEName", refMulEnf.getEnforcementName()
								+ " (" + refMulEnf.getName() + ")");
						last = nStEName;
					}
				}
			}
			
			// Add a newline to the last paragraph
			DocumentHelper.addLineBreakToParagraph(last);
		}
	}
	
	private void writeUsageStatements(XWPFDocument document, Policy policy) {
		for (Usage usage : Lists.reverse(policy.getUsage())) {
			XWPFParagraph tEnd = DocumentHelper.getParagraph(document, "@StEnd");
			// Get the position of the paragraph after the end tag
			int endPos = document.getParagraphPos(document.getPosOfParagraph(tEnd)) + 1;
			tEnd = document.getParagraphArray(endPos);
			XmlCursor cursor = tEnd.getCTP().newCursor();

			XWPFParagraph tName = DocumentHelper.getParagraph(document, "@StId");
			XWPFParagraph nName = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nName, tName);
			DocumentHelper.replaceText(nName, "@StId", usage.getName());

			XWPFParagraph tDesc = DocumentHelper.getParagraph(document, "@StDescription");
			cursor = tEnd.getCTP().newCursor();
			XWPFParagraph nDesc = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nDesc, tDesc);
			DocumentHelper.replaceText(nDesc, "@StDescription", usage.getDescription());
			
			XWPFParagraph tType = DocumentHelper.getParagraph(document, "@StType");
			cursor = tEnd.getCTP().newCursor();
			XWPFParagraph nType = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nType, tType);
			DocumentHelper.replaceText(nType, "@StType", "Usage");

			XWPFParagraph tModality = DocumentHelper.getParagraph(document, "@StModality");
			cursor = tEnd.getCTP().newCursor();
			XWPFParagraph nModality = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nModality, tModality);
			DocumentHelper.replaceText(nModality, "@StModality", usage.getModality());
			
			XWPFParagraph last = nModality;
			
			// Add Private Data Section
			EList<RefPrivateData> refPrivateData = usage.getRefPrivateData();
			
			if (refPrivateData.size() > 0) {
				XWPFParagraph tPDSection = DocumentHelper.getParagraph(document, "@StPDName");
				int attrSubPos = document.getParagraphPos(document.getPosOfParagraph(tPDSection) - 1);
				tPDSection = document.getParagraphArray(attrSubPos);
				cursor = tEnd.getCTP().newCursor();
				XWPFParagraph nPDSection = document.insertNewParagraph(cursor);
				DocumentHelper.cloneParagraph(nPDSection, tPDSection);

				for (RefPrivateData refPD : refPrivateData) {
					PrivateData data = refPD.getRefPrivateData();
					XWPFParagraph tStPDName = DocumentHelper.getParagraph(document, "@StPDName");
					cursor = tEnd.getCTP().newCursor();
					XWPFParagraph nStPDName = document.insertNewParagraph(cursor);
					DocumentHelper.cloneParagraph(nStPDName, tStPDName);
					DocumentHelper.replaceText(nStPDName, "@StPDName", data.getDescription()
							+ " (" + data.getName() + ")");
					last = nStPDName;
					
					for (PrivateData refMulData : refPD.getRefs()) {
						tStPDName = DocumentHelper.getParagraph(document, "@StPDName");
						cursor = tEnd.getCTP().newCursor();
						nStPDName = document.insertNewParagraph(cursor);
						DocumentHelper.cloneParagraph(nStPDName, tStPDName);
						DocumentHelper.replaceText(nStPDName, "@StPDName", refMulData.getDescription()
								+ " (" + refMulData.getName() + ")");
						last = nStPDName;
					}
				}
			}
			
			// Add Services Section
			EList<RefService> referToService = usage.getRefService();
			
			if (referToService.size() > 0) {
				XWPFParagraph tSSection = DocumentHelper.getParagraph(document, "@StSName");
				int attrSubPos = document.getParagraphPos(document.getPosOfParagraph(tSSection) - 1);
				tSSection = document.getParagraphArray(attrSubPos);
				cursor = tEnd.getCTP().newCursor();
				XWPFParagraph nSSection = document.insertNewParagraph(cursor);
				DocumentHelper.cloneParagraph(nSSection, tSSection);

				for (RefService refService : referToService) {
					Service service = refService.getRefService();
					XWPFParagraph tStSName = DocumentHelper.getParagraph(document, "@StSName");
					cursor = tEnd.getCTP().newCursor();
					XWPFParagraph nStSName = document.insertNewParagraph(cursor);
					DocumentHelper.cloneParagraph(nStSName, tStSName);
					DocumentHelper.replaceText(nStSName, "@StSName", service.getServiceName()
							+ " (" + service.getName() + ")");
					last = nStSName;
					
					for (Service refMulService : refService.getRefs()) {
						tStSName = DocumentHelper.getParagraph(document, "@StSName");
						cursor = tEnd.getCTP().newCursor();
						nStSName = document.insertNewParagraph(cursor);
						DocumentHelper.cloneParagraph(nStSName, tStSName);
						DocumentHelper.replaceText(nStSName, "@StSName", refMulService.getServiceName()
								+ " (" + refMulService.getName() + ")");
						last = nStSName;
					}
				}
			}
			
			// Add Enforcements Section
			EList<RefEnforcement> referToEnf = usage.getRefEnforcement();
			
			if (referToEnf.size() > 0) {
				XWPFParagraph tESection = DocumentHelper.getParagraph(document, "@StEName");
				int attrSubPos = document.getParagraphPos(document.getPosOfParagraph(tESection) - 1);
				tESection = document.getParagraphArray(attrSubPos);
				cursor = tEnd.getCTP().newCursor();
				XWPFParagraph nESection = document.insertNewParagraph(cursor);
				DocumentHelper.cloneParagraph(nESection, tESection);

				for (RefEnforcement refEnf : referToEnf) {
					Enforcement enforcement = refEnf.getRefEnforcement();
					XWPFParagraph tStEName = DocumentHelper.getParagraph(document, "@StEName");
					cursor = tEnd.getCTP().newCursor();
					XWPFParagraph nStEName = document.insertNewParagraph(cursor);
					DocumentHelper.cloneParagraph(nStEName, tStEName);
					DocumentHelper.replaceText(nStEName, "@StEName", enforcement.getEnforcementName()
							+ " (" + enforcement.getName() + ")");
					last = nStEName;
					
					for (Enforcement refMulEnf : refEnf.getRefs()) {
						tStEName = DocumentHelper.getParagraph(document, "@StEName");
						cursor = tEnd.getCTP().newCursor();
						nStEName = document.insertNewParagraph(cursor);
						DocumentHelper.cloneParagraph(nStEName, tStEName);
						DocumentHelper.replaceText(nStEName, "@StEName", refMulEnf.getEnforcementName()
								+ " (" + refMulEnf.getName() + ")");
						last = nStEName;
					}
				}
			}
			
			// Add a newline to the last paragraph
			DocumentHelper.addLineBreakToParagraph(last);
		}
	}
	
	private void writeRetentionStatements(XWPFDocument document, Policy policy) {
		for (Retention retention : Lists.reverse(policy.getRetention())) {
			XWPFParagraph tEnd = DocumentHelper.getParagraph(document, "@StEnd");
			// Get the position of the paragraph after the end tag
			int endPos = document.getParagraphPos(document.getPosOfParagraph(tEnd)) + 1;
			tEnd = document.getParagraphArray(endPos);
			XmlCursor cursor = tEnd.getCTP().newCursor();

			XWPFParagraph tName = DocumentHelper.getParagraph(document, "@StId");
			XWPFParagraph nName = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nName, tName);
			DocumentHelper.replaceText(nName, "@StId", retention.getName());

			XWPFParagraph tDesc = DocumentHelper.getParagraph(document, "@StDescription");
			cursor = tEnd.getCTP().newCursor();
			XWPFParagraph nDesc = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nDesc, tDesc);
			DocumentHelper.replaceText(nDesc, "@StDescription", retention.getDescription());
			
			XWPFParagraph tType = DocumentHelper.getParagraph(document, "@StType");
			cursor = tEnd.getCTP().newCursor();
			XWPFParagraph nType = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nType, tType);
			DocumentHelper.replaceText(nType, "@StType", "Retention");

			XWPFParagraph tModality = DocumentHelper.getParagraph(document, "@StModality");
			cursor = tEnd.getCTP().newCursor();
			XWPFParagraph nModality = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nModality, tModality);
			DocumentHelper.replaceText(nModality, "@StModality", retention.getModality());
			
			// Add Private Data Section
			EList<RefPrivateData> refPrivateData = retention.getRefPrivateData();
			
			if (refPrivateData.size() > 0) {
				XWPFParagraph tPDSection = DocumentHelper.getParagraph(document, "@StPDName");
				int attrSubPos = document.getParagraphPos(document.getPosOfParagraph(tPDSection) - 1);
				tPDSection = document.getParagraphArray(attrSubPos);
				cursor = tEnd.getCTP().newCursor();
				XWPFParagraph nPDSection = document.insertNewParagraph(cursor);
				DocumentHelper.cloneParagraph(nPDSection, tPDSection);

				for (RefPrivateData refPD : refPrivateData) {
					PrivateData data = refPD.getRefPrivateData();
					XWPFParagraph tStPDName = DocumentHelper.getParagraph(document, "@StPDName");
					cursor = tEnd.getCTP().newCursor();
					XWPFParagraph nStPDName = document.insertNewParagraph(cursor);
					DocumentHelper.cloneParagraph(nStPDName, tStPDName);
					DocumentHelper.replaceText(nStPDName, "@StPDName", data.getDescription()
							+ " (" + data.getName() + ")");
					
					for (PrivateData refMulData : refPD.getRefs()) {
						tStPDName = DocumentHelper.getParagraph(document, "@StPDName");
						cursor = tEnd.getCTP().newCursor();
						nStPDName = document.insertNewParagraph(cursor);
						DocumentHelper.cloneParagraph(nStPDName, tStPDName);
						DocumentHelper.replaceText(nStPDName, "@StPDName", refMulData.getDescription()
								+ " (" + refMulData.getName() + ")");
					}
				}
			}
			
			// Add Services Section
			EList<RefService> referToService = retention.getRefService();
			
			if (referToService.size() > 0) {
				XWPFParagraph tSSection = DocumentHelper.getParagraph(document, "@StSName");
				int attrSubPos = document.getParagraphPos(document.getPosOfParagraph(tSSection) - 1);
				tSSection = document.getParagraphArray(attrSubPos);
				cursor = tEnd.getCTP().newCursor();
				XWPFParagraph nSSection = document.insertNewParagraph(cursor);
				DocumentHelper.cloneParagraph(nSSection, tSSection);

				for (RefService refService : referToService) {
					Service service = refService.getRefService();
					XWPFParagraph tStSName = DocumentHelper.getParagraph(document, "@StSName");
					cursor = tEnd.getCTP().newCursor();
					XWPFParagraph nStSName = document.insertNewParagraph(cursor);
					DocumentHelper.cloneParagraph(nStSName, tStSName);
					DocumentHelper.replaceText(nStSName, "@StSName", service.getServiceName()
							+ " (" + service.getName() + ")");
					
					for (Service refMulService : refService.getRefs()) {
						tStSName = DocumentHelper.getParagraph(document, "@StSName");
						cursor = tEnd.getCTP().newCursor();
						nStSName = document.insertNewParagraph(cursor);
						DocumentHelper.cloneParagraph(nStSName, tStSName);
						DocumentHelper.replaceText(nStSName, "@StSName", refMulService.getServiceName()
								+ " (" + refMulService.getName() + ")");
					}
				}
			}
			
			// Add Enforcements Section
			EList<RefEnforcement> referToEnf = retention.getRefEnforcement();
			
			if (referToEnf.size() > 0) {
				XWPFParagraph tESection = DocumentHelper.getParagraph(document, "@StEName");
				int attrSubPos = document.getParagraphPos(document.getPosOfParagraph(tESection) - 1);
				tESection = document.getParagraphArray(attrSubPos);
				cursor = tEnd.getCTP().newCursor();
				XWPFParagraph nESection = document.insertNewParagraph(cursor);
				DocumentHelper.cloneParagraph(nESection, tESection);

				for (RefEnforcement refEnf : referToEnf) {
					Enforcement enforcement = refEnf.getRefEnforcement();
					XWPFParagraph tStEName = DocumentHelper.getParagraph(document, "@StEName");
					cursor = tEnd.getCTP().newCursor();
					XWPFParagraph nStEName = document.insertNewParagraph(cursor);
					DocumentHelper.cloneParagraph(nStEName, tStEName);
					DocumentHelper.replaceText(nStEName, "@StEName", enforcement.getEnforcementName()
							+ " (" + enforcement.getName() + ")");
					
					for (Enforcement refMulEnf : refEnf.getRefs()) {
						tStEName = DocumentHelper.getParagraph(document, "@StEName");
						cursor = tEnd.getCTP().newCursor();
						nStEName = document.insertNewParagraph(cursor);
						DocumentHelper.cloneParagraph(nStEName, tStEName);
						DocumentHelper.replaceText(nStEName, "@StEName", refMulEnf.getEnforcementName()
								+ " (" + refMulEnf.getName() + ")");
					}
				}
			}
			
			XWPFParagraph tPeriod = DocumentHelper.getParagraph(document, "@StPeriod");
			cursor = tEnd.getCTP().newCursor();
			XWPFParagraph nPeriod = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nPeriod, tPeriod);
			DocumentHelper.replaceText(nPeriod, "@StPeriod", retention.getPeriod());
			
			// Add a newline to the last paragraph
			DocumentHelper.addLineBreakToParagraph(nPeriod);
		}
	}
	
	private void writeDisclosureStatements(XWPFDocument document, Policy policy) {
		for (Disclosure disclosure : Lists.reverse(policy.getDisclosure())) {
			XWPFParagraph tEnd = DocumentHelper.getParagraph(document, "@StEnd");
			// Get the position of the paragraph after the end tag
			int endPos = document.getParagraphPos(document.getPosOfParagraph(tEnd)) + 1;
			tEnd = document.getParagraphArray(endPos);
			XmlCursor cursor = tEnd.getCTP().newCursor();

			XWPFParagraph tName = DocumentHelper.getParagraph(document, "@StId");
			XWPFParagraph nName = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nName, tName);
			DocumentHelper.replaceText(nName, "@StId", disclosure.getName());

			XWPFParagraph tDesc = DocumentHelper.getParagraph(document, "@StDescription");
			cursor = tEnd.getCTP().newCursor();
			XWPFParagraph nDesc = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nDesc, tDesc);
			DocumentHelper.replaceText(nDesc, "@StDescription", disclosure.getDescription());
			
			XWPFParagraph tType = DocumentHelper.getParagraph(document, "@StType");
			cursor = tEnd.getCTP().newCursor();
			XWPFParagraph nType = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nType, tType);
			DocumentHelper.replaceText(nType, "@StType", "Disclosure");

			XWPFParagraph tModality = DocumentHelper.getParagraph(document, "@StModality");
			cursor = tEnd.getCTP().newCursor();
			XWPFParagraph nModality = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nModality, tModality);
			DocumentHelper.replaceText(nModality, "@StModality", disclosure.getModality());
			
			XWPFParagraph last = nModality;
			
			// Add Private Data Section
			EList<RefPrivateData> refPrivateData = disclosure.getRefPrivateData();
			
			if (refPrivateData.size() > 0) {
				XWPFParagraph tPDSection = DocumentHelper.getParagraph(document, "@StPDName");
				int attrSubPos = document.getParagraphPos(document.getPosOfParagraph(tPDSection) - 1);
				tPDSection = document.getParagraphArray(attrSubPos);
				cursor = tEnd.getCTP().newCursor();
				XWPFParagraph nPDSection = document.insertNewParagraph(cursor);
				DocumentHelper.cloneParagraph(nPDSection, tPDSection);

				for (RefPrivateData refPD : refPrivateData) {
					PrivateData data = refPD.getRefPrivateData();
					XWPFParagraph tStPDName = DocumentHelper.getParagraph(document, "@StPDName");
					cursor = tEnd.getCTP().newCursor();
					XWPFParagraph nStPDName = document.insertNewParagraph(cursor);
					DocumentHelper.cloneParagraph(nStPDName, tStPDName);
					DocumentHelper.replaceText(nStPDName, "@StPDName", data.getDescription()
							+ " (" + data.getName() + ")");
					last = nStPDName;
					
					for (PrivateData refMulData : refPD.getRefs()) {
						tStPDName = DocumentHelper.getParagraph(document, "@StPDName");
						cursor = tEnd.getCTP().newCursor();
						nStPDName = document.insertNewParagraph(cursor);
						DocumentHelper.cloneParagraph(nStPDName, tStPDName);
						DocumentHelper.replaceText(nStPDName, "@StPDName", refMulData.getDescription()
								+ " (" + refMulData.getName() + ")");
						last = nStPDName;
					}
				}
			}
			
			// Add Recipients Section
			EList<RefRecipient> refToRecipient =  disclosure.getRefRecipient();
			
			if (refToRecipient.size() > 0) {
				XWPFParagraph tRSection = DocumentHelper.getParagraph(document, "@StRName");
				int attrSubPos = document.getParagraphPos(document.getPosOfParagraph(tRSection) - 1);
				tRSection = document.getParagraphArray(attrSubPos);
				cursor = tEnd.getCTP().newCursor();
				XWPFParagraph nRSection = document.insertNewParagraph(cursor);
				DocumentHelper.cloneParagraph(nRSection, tRSection);

				for (RefRecipient refRec : refToRecipient) {
					Recipient recipient = refRec.getRefRecipient();
					XWPFParagraph tStRName = DocumentHelper.getParagraph(document, "@StRName");
					cursor = tEnd.getCTP().newCursor();
					XWPFParagraph nStRName = document.insertNewParagraph(cursor);
					DocumentHelper.cloneParagraph(nStRName, tStRName);
					DocumentHelper.replaceText(nStRName, "@StRName", recipient.getRecipientName()
							+ " (" + recipient.getName() + ")");
					last = nStRName;
					
					for (Recipient refMulRec : refRec.getRefs()) {
						tStRName = DocumentHelper.getParagraph(document, "@StRName");
						cursor = tEnd.getCTP().newCursor();
						nStRName = document.insertNewParagraph(cursor);
						DocumentHelper.cloneParagraph(nStRName, tStRName);
						DocumentHelper.replaceText(nStRName, "@StRName", refMulRec.getRecipientName()
								+ " (" + refMulRec.getName() + ")");
						last = nStRName;
					}
				}
			}
			
			// Add Services Section
			EList<RefService> referToService = disclosure.getRefService();
			
			if (referToService.size() > 0) {
				XWPFParagraph tSSection = DocumentHelper.getParagraph(document, "@StSName");
				int attrSubPos = document.getParagraphPos(document.getPosOfParagraph(tSSection) - 1);
				tSSection = document.getParagraphArray(attrSubPos);
				cursor = tEnd.getCTP().newCursor();
				XWPFParagraph nSSection = document.insertNewParagraph(cursor);
				DocumentHelper.cloneParagraph(nSSection, tSSection);

				for (RefService refService : referToService) {
					Service service = refService.getRefService();
					XWPFParagraph tStSName = DocumentHelper.getParagraph(document, "@StSName");
					cursor = tEnd.getCTP().newCursor();
					XWPFParagraph nStSName = document.insertNewParagraph(cursor);
					DocumentHelper.cloneParagraph(nStSName, tStSName);
					DocumentHelper.replaceText(nStSName, "@StSName", service.getServiceName()
							+ " (" + service.getName() + ")");
					last = nStSName;
					
					for (Service refMulService : refService.getRefs()) {
						tStSName = DocumentHelper.getParagraph(document, "@StSName");
						cursor = tEnd.getCTP().newCursor();
						nStSName = document.insertNewParagraph(cursor);
						DocumentHelper.cloneParagraph(nStSName, tStSName);
						DocumentHelper.replaceText(nStSName, "@StSName", refMulService.getServiceName()
								+ " (" + refMulService.getName() + ")");
						last = nStSName;
					}
				}
			}
			
			// Add Enforcements Section
			EList<RefEnforcement> referToEnf = disclosure.getRefEnforcement();
			
			if (referToEnf.size() > 0) {
				XWPFParagraph tESection = DocumentHelper.getParagraph(document, "@StEName");
				int attrSubPos = document.getParagraphPos(document.getPosOfParagraph(tESection) - 1);
				tESection = document.getParagraphArray(attrSubPos);
				cursor = tEnd.getCTP().newCursor();
				XWPFParagraph nESection = document.insertNewParagraph(cursor);
				DocumentHelper.cloneParagraph(nESection, tESection);

				for (RefEnforcement refEnf : referToEnf) {
					Enforcement enforcement = refEnf.getRefEnforcement();
					XWPFParagraph tStEName = DocumentHelper.getParagraph(document, "@StEName");
					cursor = tEnd.getCTP().newCursor();
					XWPFParagraph nStEName = document.insertNewParagraph(cursor);
					DocumentHelper.cloneParagraph(nStEName, tStEName);
					DocumentHelper.replaceText(nStEName, "@StEName", enforcement.getEnforcementName()
							+ " (" + enforcement.getName() + ")");
					last = nStEName;
					
					for (Enforcement refMulEnf : refEnf.getRefs()) {
						tStEName = DocumentHelper.getParagraph(document, "@StEName");
						cursor = tEnd.getCTP().newCursor();
						nStEName = document.insertNewParagraph(cursor);
						DocumentHelper.cloneParagraph(nStEName, tStEName);
						DocumentHelper.replaceText(nStEName, "@StEName", refMulEnf.getEnforcementName()
								+ " (" + refMulEnf.getName() + ")");
						last = nStEName;
					}
				}
			}
			
			// Add a newline to the last paragraph
			DocumentHelper.addLineBreakToParagraph(last);
		}
	}
	
	private void writeCollectionStatements(XWPFDocument document, Policy policy) {
		for (Collection collection : Lists.reverse(policy.getCollection())) {
			XWPFParagraph tEnd = DocumentHelper.getParagraph(document, "@StEnd");
			// Get the position of the paragraph after the end tag
			int endPos = document.getParagraphPos(document.getPosOfParagraph(tEnd)) + 1;
			tEnd = document.getParagraphArray(endPos);
			XmlCursor cursor = tEnd.getCTP().newCursor();

			XWPFParagraph tName = DocumentHelper.getParagraph(document, "@StId");
			XWPFParagraph nName = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nName, tName);
			DocumentHelper.replaceText(nName, "@StId", collection.getName());

			XWPFParagraph tDesc = DocumentHelper.getParagraph(document, "@StDescription");
			cursor = tEnd.getCTP().newCursor();
			XWPFParagraph nDesc = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nDesc, tDesc);
			DocumentHelper.replaceText(nDesc, "@StDescription", collection.getDescription());
			
			XWPFParagraph tType = DocumentHelper.getParagraph(document, "@StType");
			cursor = tEnd.getCTP().newCursor();
			XWPFParagraph nType = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nType, tType);
			DocumentHelper.replaceText(nType, "@StType", "Collection");

			XWPFParagraph tModality = DocumentHelper.getParagraph(document, "@StModality");
			cursor = tEnd.getCTP().newCursor();
			XWPFParagraph nModality = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nModality, tModality);
			DocumentHelper.replaceText(nModality, "@StModality", collection.getModality());
			
			XWPFParagraph last = nModality;
			
			// Add Private Data Section
			EList<RefPrivateData> refPrivateData = collection.getRefPrivateData();
			
			if (refPrivateData.size() > 0) {
				XWPFParagraph tPDSection = DocumentHelper.getParagraph(document, "@StPDName");
				int attrSubPos = document.getParagraphPos(document.getPosOfParagraph(tPDSection) - 1);
				tPDSection = document.getParagraphArray(attrSubPos);
				cursor = tEnd.getCTP().newCursor();
				XWPFParagraph nPDSection = document.insertNewParagraph(cursor);
				DocumentHelper.cloneParagraph(nPDSection, tPDSection);

				for (RefPrivateData refPD : refPrivateData) {
					PrivateData data = refPD.getRefPrivateData();
					XWPFParagraph tStPDName = DocumentHelper.getParagraph(document, "@StPDName");
					cursor = tEnd.getCTP().newCursor();
					XWPFParagraph nStPDName = document.insertNewParagraph(cursor);
					DocumentHelper.cloneParagraph(nStPDName, tStPDName);
					DocumentHelper.replaceText(nStPDName, "@StPDName", data.getDescription()
							+ " (" + data.getName() + ")");
					last = nStPDName;
					
					for (PrivateData refMulData : refPD.getRefs()) {
						tStPDName = DocumentHelper.getParagraph(document, "@StPDName");
						cursor = tEnd.getCTP().newCursor();
						nStPDName = document.insertNewParagraph(cursor);
						DocumentHelper.cloneParagraph(nStPDName, tStPDName);
						DocumentHelper.replaceText(nStPDName, "@StPDName", refMulData.getDescription()
								+ " (" + refMulData.getName() + ")");
						last = nStPDName;
					}
				}
			}
			
			// Add Services Section
			EList<RefService> referToService = collection.getRefService();
			
			if (referToService.size() > 0) {
				XWPFParagraph tSSection = DocumentHelper.getParagraph(document, "@StSName");
				int attrSubPos = document.getParagraphPos(document.getPosOfParagraph(tSSection) - 1);
				tSSection = document.getParagraphArray(attrSubPos);
				cursor = tEnd.getCTP().newCursor();
				XWPFParagraph nSSection = document.insertNewParagraph(cursor);
				DocumentHelper.cloneParagraph(nSSection, tSSection);

				for (RefService refService : referToService) {
					Service service = refService.getRefService();
					XWPFParagraph tStSName = DocumentHelper.getParagraph(document, "@StSName");
					cursor = tEnd.getCTP().newCursor();
					XWPFParagraph nStSName = document.insertNewParagraph(cursor);
					DocumentHelper.cloneParagraph(nStSName, tStSName);
					DocumentHelper.replaceText(nStSName, "@StSName", service.getServiceName()
							+ " (" + service.getName() + ")");
					last = nStSName;
					
					for (Service refMulService : refService.getRefs()) {
						tStSName = DocumentHelper.getParagraph(document, "@StSName");
						cursor = tEnd.getCTP().newCursor();
						nStSName = document.insertNewParagraph(cursor);
						DocumentHelper.cloneParagraph(nStSName, tStSName);
						DocumentHelper.replaceText(nStSName, "@StSName", refMulService.getServiceName()
								+ " (" + refMulService.getName() + ")");
						last = nStSName;
					}
				}
			}
			
			// Add Enforcements Section
			EList<RefEnforcement> referToEnf = collection.getRefEnforcement();
			
			if (referToEnf.size() > 0) {
				XWPFParagraph tESection = DocumentHelper.getParagraph(document, "@StEName");
				int attrSubPos = document.getParagraphPos(document.getPosOfParagraph(tESection) - 1);
				tESection = document.getParagraphArray(attrSubPos);
				cursor = tEnd.getCTP().newCursor();
				XWPFParagraph nESection = document.insertNewParagraph(cursor);
				DocumentHelper.cloneParagraph(nESection, tESection);

				for (RefEnforcement refEnf : referToEnf) {
					Enforcement enforcement = refEnf.getRefEnforcement();
					XWPFParagraph tStEName = DocumentHelper.getParagraph(document, "@StEName");
					cursor = tEnd.getCTP().newCursor();
					XWPFParagraph nStEName = document.insertNewParagraph(cursor);
					DocumentHelper.cloneParagraph(nStEName, tStEName);
					DocumentHelper.replaceText(nStEName, "@StEName", enforcement.getEnforcementName()
							+ " (" + enforcement.getName() + ")");
					last = nStEName;
					
					for (Enforcement refMulEnf : refEnf.getRefs()) {
						tStEName = DocumentHelper.getParagraph(document, "@StEName");
						cursor = tEnd.getCTP().newCursor();
						nStEName = document.insertNewParagraph(cursor);
						DocumentHelper.cloneParagraph(nStEName, tStEName);
						DocumentHelper.replaceText(nStEName, "@StEName", refMulEnf.getEnforcementName()
								+ " (" + refMulEnf.getName() + ")");
						last = nStEName;
					}
				}
			}
			
			// Add a newline to the last paragraph
			DocumentHelper.addLineBreakToParagraph(last);
		}
	}
}
