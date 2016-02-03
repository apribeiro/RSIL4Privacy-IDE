package org.xtext.example.mydsl.ui.handlers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
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
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.xtext.example.mydsl.MyDslStandaloneSetup;
import org.xtext.example.mydsl.myDsl.Attribute;
import org.xtext.example.mydsl.myDsl.Enforcement;
import org.xtext.example.mydsl.myDsl.Partof;
import org.xtext.example.mydsl.myDsl.PrivateData;
import org.xtext.example.mydsl.myDsl.Recipient;
import org.xtext.example.mydsl.myDsl.RefPrivateData;
import org.xtext.example.mydsl.myDsl.Service;
import org.xtext.example.mydsl.myDsl.ServicePartof;
import org.xtext.example.mydsl.myDsl.impl.PolicyImpl;
import org.xtext.example.mydsl.ui.windows.MenuCommand;
import org.xtext.example.mydsl.ui.windows.MenuCommandWindow;

import com.google.common.collect.Lists;
import com.google.inject.Injector;

public class WordHandler extends AbstractHandler {

	private static final String GEN_FOLDER = "src-gen";
	private static final String DOCS_FOLDER = "docs";
	private static final String FILE_EXT = ".mydsl";
	private static final String DEF_WORD_PATH = "RSL-IL4Privacy-WordTemplate.docx";

	private final String PLUGIN_PATH = Platform.getInstallLocation()
			.getURL().getPath().substring(1)
			+ "plugins/RSLingo4Privacy/";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getActiveMenuSelection(event);

		// Check if the command was triggered using the ContextMenu
		if (selection != null) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			IFile file = (IFile) structuredSelection.getFirstElement();
			generateWordFile(file);
		} else {
			IWorkbenchWindow workbenchWindow = HandlerUtil.getActiveWorkbenchWindowChecked(event);
			MenuCommand cmd = new MenuCommand() {
				@Override
				public void execute(IProject project, IFile file) {
					generateWordFile(file);
				}
			};
			MenuCommandWindow window = new MenuCommandWindow(workbenchWindow.getShell(),
					cmd, false, FILE_EXT);
			window.open();
		}

		return null;
	}

	private void generateWordFile(IFile file) {
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
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
				Injector injector = new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
				XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
				resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
				Resource resource = resourceSet.getResource(
						URI.createURI("platform:/resource/" + file.getFullPath().toString()), true);
				//URI.createURI("platform:/resource/org.xtext.example.mydsl/src/example.mydsl"), true);
				PolicyImpl policy = (PolicyImpl) resource.getContents().get(0);

				// TODO Generate Word file
				try {
					InputStream from = new FileInputStream(PLUGIN_PATH + DEF_WORD_PATH);
					XWPFDocument document = new XWPFDocument(from);

					writePrivateData(policy, document);
					writeServices(policy, document);
					writeRecipients(policy, document);
					writeEnforcements(policy, document);

					// Write the Document in file system
					File to = new File(project.getLocation().toOSString()
							+ "/" + GEN_FOLDER + "/" + DOCS_FOLDER 
							+ "/" + file.getName() + ".docx");
					FileOutputStream out = new FileOutputStream(to);
					document.write(out);
					out.close();
					document.close();

					project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());

					System.out.println(file.getName() + ".docx written successfully");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		new Thread(runnable).start();
	}

	private void writePrivateData(PolicyImpl policy, XWPFDocument document) {
		for (PrivateData data : Lists.reverse(policy.getPrivateData())) {
			XWPFParagraph tEnd = DocumentHelper.getParagraph(document, "@PDEnd");
			// Get the position of the paragraph after the end tag
			int endPos = document.getParagraphPos(document.getPosOfParagraph(tEnd)) + 1;
			tEnd = document.getParagraphArray(endPos);
			XmlCursor cursor = tEnd.getCTP().newCursor();

			XWPFParagraph tName = DocumentHelper.getParagraph(document, "@PDName");
			XWPFParagraph nName = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nName, tName);
			DocumentHelper.replaceText(nName, "@PDName", data.getPrivatedata()
					+ " (" + data.getName() + ")");

			XWPFParagraph tType = DocumentHelper.getParagraph(document, "@PDType");
			cursor = tEnd.getCTP().newCursor();
			XWPFParagraph nType = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nType, tType);
			DocumentHelper.replaceText(nType, "@PDType", data.getPrivateDataKind());

			XWPFParagraph tDesc = DocumentHelper.getParagraph(document, "@PDDescription");
			cursor = tEnd.getCTP().newCursor();
			XWPFParagraph nDesc = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nDesc, tDesc);
			DocumentHelper.replaceText(nDesc, "@PDDescription", data.getPrivatedata());

			XWPFParagraph nAttr = null;

			for (Attribute attr : data.getAttribute()) {
				XWPFParagraph tAttr = DocumentHelper.getParagraph(document, "@PDAttrName");
				cursor = tEnd.getCTP().newCursor();
				nAttr = document.insertNewParagraph(cursor);
				DocumentHelper.cloneParagraph(nAttr, tAttr);
				DocumentHelper.replaceText(nAttr, "@PDAttrName", attr.getName());
				DocumentHelper.replaceText(nAttr, "@PDAttrDescription", attr.getAttributeName());
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

	private void writeServices(PolicyImpl policy, XWPFDocument document) {
		for (Service service : Lists.reverse(policy.getService())) {
			XWPFParagraph tEnd = DocumentHelper.getParagraph(document, "@SEnd");
			// Get the position of the paragraph after the end tag
			int endPos = document.getParagraphPos(document.getPosOfParagraph(tEnd)) + 1;
			tEnd = document.getParagraphArray(endPos);
			XmlCursor cursor = tEnd.getCTP().newCursor();

			XWPFParagraph tName = DocumentHelper.getParagraph(document, "@SName");
			XWPFParagraph nName = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nName, tName);
			DocumentHelper.replaceText(nName, "@SName", service.getServicename()
					+ " (" + service.getName() + ")");

			XWPFParagraph tDesc = DocumentHelper.getParagraph(document, "@SDescription");
			cursor = tEnd.getCTP().newCursor();
			XWPFParagraph nDesc = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nDesc, tDesc);
			DocumentHelper.replaceText(nDesc, "@SDescription", service.getDescription());

			for (ServicePartof sub : service.getServicepartof()) {
				Service subService = sub.getRefertoservice();
				XWPFParagraph tSSName = DocumentHelper.getParagraph(document, "@SSName");
				cursor = tEnd.getCTP().newCursor();
				XWPFParagraph nSSName = document.insertNewParagraph(cursor);
				DocumentHelper.cloneParagraph(nSSName, tSSName);
				DocumentHelper.replaceText(nSSName, "@SSName", subService.getServicename()
						+ " (" + subService.getName() + ")");
				DocumentHelper.replaceText(nSSName, "@SSDescription", subService.getDescription());
			}

			XWPFParagraph nSPDName = null;

			for (RefPrivateData refPD : service.getRefprivatedata()) {
				PrivateData data = refPD.getRefpr();
				XWPFParagraph tSPDName = DocumentHelper.getParagraph(document, "@SPDName");
				cursor = tEnd.getCTP().newCursor();
				nSPDName = document.insertNewParagraph(cursor);
				DocumentHelper.cloneParagraph(nSPDName, tSPDName);
				DocumentHelper.replaceText(nSPDName, "@SPDName", data.getPrivatedata()
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

	private void writeRecipients(PolicyImpl policy, XWPFDocument document) {
		for (Recipient recipient : Lists.reverse(policy.getRecipient())) {
			XWPFParagraph tEnd = DocumentHelper.getParagraph(document, "@REnd");
			// Get the position of the paragraph after the end tag
			int endPos = document.getParagraphPos(document.getPosOfParagraph(tEnd)) + 1;
			tEnd = document.getParagraphArray(endPos);
			XmlCursor cursor = tEnd.getCTP().newCursor();

			XWPFParagraph tName = DocumentHelper.getParagraph(document, "@RName");
			XWPFParagraph nName = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nName, tName);
			DocumentHelper.replaceText(nName, "@RName", recipient.getRecipientname()
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
			DocumentHelper.replaceText(nScope, "@RScope", recipient.getRecipientScopeKind());
			
			XWPFParagraph tType = DocumentHelper.getParagraph(document, "@RType");
			cursor = tEnd.getCTP().newCursor();
			XWPFParagraph nType = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nType, tType);
			DocumentHelper.replaceText(nType, "@RType", recipient.getRecipientTypeKind());

			if (recipient.getPartof().size() > 0) {
				XWPFParagraph nSRName = null;
				
				for (Partof sub : recipient.getPartof()) {
					Recipient subRecipient = sub.getPartof();
					XWPFParagraph tSRName = DocumentHelper.getParagraph(document, "@SRName");
					cursor = tEnd.getCTP().newCursor();
					nSRName = document.insertNewParagraph(cursor);
					DocumentHelper.cloneParagraph(nSRName, tSRName);
					DocumentHelper.replaceText(nSRName, "@SRName", subRecipient.getRecipientname()
							+ " (" + subRecipient.getName() + ")");
					DocumentHelper.replaceText(nSRName, "@SRDescription", subRecipient.getDescription());
				}

				// Add a newline to the last paragraph
				if (nSRName != null) {
					DocumentHelper.addLineBreakToParagraph(nSRName);
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

	private void writeEnforcements(PolicyImpl policy, XWPFDocument document) {
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
			DocumentHelper.replaceText(nDesc, "@EDescription", enforcement.getEnforcementDescription());
			
			XWPFParagraph tType = DocumentHelper.getParagraph(document, "@EType");
			cursor = tEnd.getCTP().newCursor();
			XWPFParagraph nType = document.insertNewParagraph(cursor);
			DocumentHelper.cloneParagraph(nType, tType);
			DocumentHelper.replaceText(nType, "@EType", enforcement.getEnforcementKind());

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
	
	// TODO Write Statements 
}
