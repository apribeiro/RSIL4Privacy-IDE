package rslingo.rslil4privacy.ui.handlers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import rslingo.rslil4privacy.RSLIL4PrivacyStandaloneSetup;
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
import rslingo.rslil4privacy.rSLIL4Privacy.RefEnforcement;
import rslingo.rslil4privacy.rSLIL4Privacy.RefPrivateData;
import rslingo.rslil4privacy.rSLIL4Privacy.RefRecipient;
import rslingo.rslil4privacy.rSLIL4Privacy.RefService;
import rslingo.rslil4privacy.rSLIL4Privacy.Retention;
import rslingo.rslil4privacy.rSLIL4Privacy.Service;
import rslingo.rslil4privacy.rSLIL4Privacy.Usage;
import rslingo.rslil4privacy.ui.windows.MenuCommand;
import rslingo.rslil4privacy.ui.windows.MenuCommandWindow;

public class ExportExcelHandler extends AbstractHandler {

	private static final String GEN_FOLDER = "src-gen";
	private static final String DOCS_FOLDER = "docs";
	private static final String FILE_EXT = ".rslil";
	private static final String DEF_WORD_PATH = "RSL-IL4Privacy-ExcelTemplate.xlsx";

	private final String PLUGIN_PATH = Platform.getInstallLocation()
			.getURL().getPath().substring(1)
			+ "plugins/RSLingo4Privacy/";
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getActiveMenuSelection(event);
		
		// Check if the command was triggered using the ContextMenu
		if (selection != null) {
			if (selection instanceof IStructuredSelection) {
				IStructuredSelection structuredSelection = (IStructuredSelection) selection;
				IFile file = (IFile) structuredSelection.getFirstElement();
				generateExcel(file);
			} else {
				IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
				IFile file = (IFile) activeEditor.getEditorInput().getAdapter(IFile.class);
				generateExcel(file);
			}
		} else {
			IWorkbenchWindow workbenchWindow = HandlerUtil.getActiveWorkbenchWindowChecked(event);
			MenuCommand cmd = new MenuCommand() {
				@Override
				public void execute(IProject project, IFile file) {
					generateExcel(file);
				}
			};
			MenuCommandWindow window = new MenuCommandWindow(workbenchWindow.getShell(),
					cmd, false, FILE_EXT);
			window.open();
		}
		
		return null;
	}

	private void generateExcel(IFile file) {
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
				Injector injector = new RSLIL4PrivacyStandaloneSetup().createInjectorAndDoEMFRegistration();
				XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
				resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
				Resource resource = resourceSet.getResource(
						URI.createURI("platform:/resource/" + file.getFullPath().toString()), true);
				//URI.createURI("platform:/resource/rslingo.rslil4privacy/src/example.rslil"), true);
				Policy policy = (Policy) resource.getContents().get(0);

				try {
					InputStream from = new FileInputStream(PLUGIN_PATH + DEF_WORD_PATH);
					XSSFWorkbook workbook = new XSSFWorkbook(from);

					writeMetadata(policy.getMetadata(), workbook);
					writeStatements(policy, workbook);
					writePrivateData(policy, workbook);
					writeServices(policy, workbook);
					writeRecipients(policy, workbook);
					writeEnforcements(policy, workbook);

					// Write the Document in file system
					String fileName = file.getName().split(FILE_EXT)[0];
					File to = new File(project.getLocation().toOSString()
							+ "/" + GEN_FOLDER + "/" + DOCS_FOLDER 
							+ "/" + fileName + ".xlsx");
					FileOutputStream out = new FileOutputStream(to);
					workbook.write(out);
					out.close();
					workbook.close();

					project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());

					System.out.println(fileName + ".xlsx generated!");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		new Thread(runnable).start();
	}
	
	private void writeMetadata(Metadata metadata, XSSFWorkbook workbook) {
		if (metadata != null) {
			XSSFSheet sheet = workbook.getSheet("Home");
			XSSFRow rowAuthors = (XSSFRow) DocumentHelper.getCell(sheet, "HAuthors").getRow();
			DocumentHelper.replaceText(rowAuthors, "HAuthors", metadata.getAuthors());
			XSSFRow rowOrgs = (XSSFRow) DocumentHelper.getCell(sheet, "HOrganizations").getRow();
			DocumentHelper.replaceText(rowOrgs, "HOrganizations", metadata.getOrganizations());
			XSSFRow rowDate = (XSSFRow) DocumentHelper.getCell(sheet, "HDate").getRow();
			Date date = metadata.getDate();
			DocumentHelper.replaceText(rowDate, "HDate", date.getDay() + "-"
				+ date.getMonth().getName() + "-" + date.getYear());
			XSSFRow rowVersion = (XSSFRow) DocumentHelper.getCell(sheet, "HVersion").getRow();
			DocumentHelper.replaceText(rowVersion, "HVersion", metadata.getVersion());
		}
	}
	
	private void writeStatements(Policy policy, XSSFWorkbook workbook) {
		writeCollectionStatements(policy, workbook);
		writeDisclosureStatements(policy, workbook);
		writeRetentionStatements(policy, workbook);
		writeUsageStatements(policy, workbook);
		writeInformativeStatements(policy, workbook);
		
		// Delete the Template Row
		XSSFSheet sheet = workbook.getSheet("Statements");
		XSSFRow tRow = (XSSFRow) DocumentHelper.getCell(sheet, "StId").getRow();
		sheet.shiftRows(tRow.getRowNum() + 1, sheet.getLastRowNum(), -1);
	}
	
	private void writeCollectionStatements(Policy policy, XSSFWorkbook workbook) {
		XSSFSheet sheet = workbook.getSheet("Statements");
		XSSFRow tRow = (XSSFRow) DocumentHelper.getCell(sheet, "StId").getRow();
		
		for (Collection collection : policy.getCollection()) {
			XSSFRow nRow = sheet.createRow(sheet.getLastRowNum() + 1);
			DocumentHelper.cloneRow(workbook, sheet, nRow, tRow);
			
			DocumentHelper.replaceText(nRow, "StId", collection.getName());
			DocumentHelper.replaceText(nRow, "StDescription", collection.getDescription());
			DocumentHelper.replaceText(nRow, "StCondition", collection.getCondition());
			String modality = collection.getModality().toLowerCase();
			DocumentHelper.replaceText(nRow, "StModality", modality);
			DocumentHelper.replaceText(nRow, "StType", "Collection");
			
			if (collection.getRefPrivateData().size() > 0) {
				StringBuilder pdIds = new StringBuilder();
				
				for (RefPrivateData ref : collection.getRefPrivateData()) {
					PrivateData pd = ref.getRefPrivateData();
					pdIds.append(pd.getName());
					pdIds.append(", ");
				}
				pdIds.delete(pdIds.length() - 2, pdIds.length());
				
				DocumentHelper.replaceText(nRow, "StPDId", pdIds.toString());
			} else {
				DocumentHelper.replaceText(nRow, "StPDId", "");
			}
			
			DocumentHelper.replaceText(nRow, "StRId", "");
			
			if (collection.getRefService().size() > 0) {
				StringBuilder sIds = new StringBuilder();
				
				for (RefService ref : collection.getRefService()) {
					Service s = ref.getRefService();
					sIds.append(s.getName());
					sIds.append(", ");
				}
				sIds.delete(sIds.length() - 2, sIds.length());
				
				DocumentHelper.replaceText(nRow, "StSId", sIds.toString());
			} else {
				DocumentHelper.replaceText(nRow, "StSId", "");
			}
			
			if (collection.getRefEnforcement().size() > 0) {
				StringBuilder eIds = new StringBuilder();
				
				for (RefEnforcement ref : collection.getRefEnforcement()) {
					Enforcement e = ref.getRefEnforcement();
					eIds.append(e.getName());
					eIds.append(", ");
				}
				eIds.delete(eIds.length() - 2, eIds.length());
				
				DocumentHelper.replaceText(nRow, "StEId", eIds.toString());
			} else {
				DocumentHelper.replaceText(nRow, "StEId", "");
			}
			
			DocumentHelper.replaceText(nRow, "StPeriod", "");
		}
	}
	
	private void writeDisclosureStatements(Policy policy, XSSFWorkbook workbook) {
		XSSFSheet sheet = workbook.getSheet("Statements");
		XSSFRow tRow = (XSSFRow) DocumentHelper.getCell(sheet, "StId").getRow();
		
		for (Disclosure disclosure : policy.getDisclosure()) {
			XSSFRow nRow = sheet.createRow(sheet.getLastRowNum() + 1);
			DocumentHelper.cloneRow(workbook, sheet, nRow, tRow);
			
			DocumentHelper.replaceText(nRow, "StId", disclosure.getName());
			DocumentHelper.replaceText(nRow, "StDescription", disclosure.getDescription());
			DocumentHelper.replaceText(nRow, "StCondition", disclosure.getCondition());
			String modality = disclosure.getModality().toLowerCase();
			DocumentHelper.replaceText(nRow, "StModality", modality);
			DocumentHelper.replaceText(nRow, "StType", "Disclosure");
			
			if (disclosure.getRefPrivateData().size() > 0) {
				StringBuilder pdIds = new StringBuilder();
				
				for (RefPrivateData ref : disclosure.getRefPrivateData()) {
					PrivateData pd = ref.getRefPrivateData();
					pdIds.append(pd.getName());
					pdIds.append(", ");
				}
				pdIds.delete(pdIds.length() - 2, pdIds.length());
				
				DocumentHelper.replaceText(nRow, "StPDId", pdIds.toString());
			} else {
				DocumentHelper.replaceText(nRow, "StPDId", "");
			}
			
			if (disclosure.getRefRecipient().size() > 0) {
				StringBuilder rIds = new StringBuilder();
				
				for (RefRecipient ref : disclosure.getRefRecipient()) {
					Recipient r = ref.getRefRecipient();
					rIds.append(r.getName());
					rIds.append(", ");
				}
				rIds.delete(rIds.length() - 2, rIds.length());
				
				DocumentHelper.replaceText(nRow, "StRId", rIds.toString());
			} else {
				DocumentHelper.replaceText(nRow, "StRId", "");
			}
			
			if (disclosure.getRefService().size() > 0) {
				StringBuilder sIds = new StringBuilder();
				
				for (RefService ref : disclosure.getRefService()) {
					Service s = ref.getRefService();
					sIds.append(s.getName());
					sIds.append(", ");
				}
				sIds.delete(sIds.length() - 2, sIds.length());
				
				DocumentHelper.replaceText(nRow, "StSId", sIds.toString());
			} else {
				DocumentHelper.replaceText(nRow, "StSId", "");
			}
			
			if (disclosure.getRefEnforcement().size() > 0) {
				StringBuilder eIds = new StringBuilder();
				
				for (RefEnforcement ref : disclosure.getRefEnforcement()) {
					Enforcement e = ref.getRefEnforcement();
					eIds.append(e.getName());
					eIds.append(", ");
				}
				eIds.delete(eIds.length() - 2, eIds.length());
				
				DocumentHelper.replaceText(nRow, "StEId", eIds.toString());
			} else {
				DocumentHelper.replaceText(nRow, "StEId", "");
			}
			
			DocumentHelper.replaceText(nRow, "StPeriod", "");
		}
	}
	
	private void writeRetentionStatements(Policy policy, XSSFWorkbook workbook) {
		XSSFSheet sheet = workbook.getSheet("Statements");
		XSSFRow tRow = (XSSFRow) DocumentHelper.getCell(sheet, "StId").getRow();
		
		for (Retention retention : policy.getRetention()) {
			XSSFRow nRow = sheet.createRow(sheet.getLastRowNum() + 1);
			DocumentHelper.cloneRow(workbook, sheet, nRow, tRow);
			
			DocumentHelper.replaceText(nRow, "StId", retention.getName());
			DocumentHelper.replaceText(nRow, "StDescription", retention.getDescription());
			DocumentHelper.replaceText(nRow, "StCondition", retention.getCondition());
			String modality = retention.getModality().toLowerCase();
			DocumentHelper.replaceText(nRow, "StModality", modality);
			DocumentHelper.replaceText(nRow, "StType", "Retention");
			
			if (retention.getRefPrivateData().size() > 0) {
				StringBuilder pdIds = new StringBuilder();
				
				for (RefPrivateData ref : retention.getRefPrivateData()) {
					PrivateData pd = ref.getRefPrivateData();
					pdIds.append(pd.getName());
					pdIds.append(", ");
				}
				pdIds.delete(pdIds.length() - 2, pdIds.length());
				
				DocumentHelper.replaceText(nRow, "StPDId", pdIds.toString());
			} else {
				DocumentHelper.replaceText(nRow, "StPDId", "");
			}
			
			DocumentHelper.replaceText(nRow, "StRId", "");
			
			if (retention.getRefService().size() > 0) {
				StringBuilder sIds = new StringBuilder();
				
				for (RefService ref : retention.getRefService()) {
					Service s = ref.getRefService();
					sIds.append(s.getName());
					sIds.append(", ");
				}
				sIds.delete(sIds.length() - 2, sIds.length());
				
				DocumentHelper.replaceText(nRow, "StSId", sIds.toString());
			} else {
				DocumentHelper.replaceText(nRow, "StSId", "");
			}
			
			if (retention.getRefEnforcement().size() > 0) {
				StringBuilder eIds = new StringBuilder();
				
				for (RefEnforcement ref : retention.getRefEnforcement()) {
					Enforcement e = ref.getRefEnforcement();
					eIds.append(e.getName());
					eIds.append(", ");
				}
				eIds.delete(eIds.length() - 2, eIds.length());
				
				DocumentHelper.replaceText(nRow, "StEId", eIds.toString());
			} else {
				DocumentHelper.replaceText(nRow, "StEId", "");
			}
			
			DocumentHelper.replaceText(nRow, "StPeriod", retention.getPeriod());
		}
	}
	
	private void writeUsageStatements(Policy policy, XSSFWorkbook workbook) {
		XSSFSheet sheet = workbook.getSheet("Statements");
		XSSFRow tRow = (XSSFRow) DocumentHelper.getCell(sheet, "StId").getRow();
		
		for (Usage usage : policy.getUsage()) {
			XSSFRow nRow = sheet.createRow(sheet.getLastRowNum() + 1);
			DocumentHelper.cloneRow(workbook, sheet, nRow, tRow);
			
			DocumentHelper.replaceText(nRow, "StId", usage.getName());
			DocumentHelper.replaceText(nRow, "StDescription", usage.getDescription());
			DocumentHelper.replaceText(nRow, "StCondition", usage.getCondition());
			String modality = usage.getModality().toLowerCase();
			DocumentHelper.replaceText(nRow, "StModality", modality);
			DocumentHelper.replaceText(nRow, "StType", "Usage");
			
			if (usage.getRefPrivateData().size() > 0) {
				StringBuilder pdIds = new StringBuilder();
				
				for (RefPrivateData ref : usage.getRefPrivateData()) {
					PrivateData pd = ref.getRefPrivateData();
					pdIds.append(pd.getName());
					pdIds.append(", ");
				}
				pdIds.delete(pdIds.length() - 2, pdIds.length());
				
				DocumentHelper.replaceText(nRow, "StPDId", pdIds.toString());
			} else {
				DocumentHelper.replaceText(nRow, "StPDId", "");
			}
			
			DocumentHelper.replaceText(nRow, "StRId", "");
			
			if (usage.getRefService().size() > 0) {
				StringBuilder sIds = new StringBuilder();
				
				for (RefService ref : usage.getRefService()) {
					Service s = ref.getRefService();
					sIds.append(s.getName());
					sIds.append(", ");
				}
				sIds.delete(sIds.length() - 2, sIds.length());
				
				DocumentHelper.replaceText(nRow, "StSId", sIds.toString());
			} else {
				DocumentHelper.replaceText(nRow, "StSId", "");
			}
			
			if (usage.getRefEnforcement().size() > 0) {
				StringBuilder eIds = new StringBuilder();
				
				for (RefEnforcement ref : usage.getRefEnforcement()) {
					Enforcement e = ref.getRefEnforcement();
					eIds.append(e.getName());
					eIds.append(", ");
				}
				eIds.delete(eIds.length() - 2, eIds.length());
				
				DocumentHelper.replaceText(nRow, "StEId", eIds.toString());
			} else {
				DocumentHelper.replaceText(nRow, "StEId", "");
			}
			
			DocumentHelper.replaceText(nRow, "StPeriod", "");
		}
	}
	
	private void writeInformativeStatements(Policy policy, XSSFWorkbook workbook) {
		XSSFSheet sheet = workbook.getSheet("Statements");
		XSSFRow tRow = (XSSFRow) DocumentHelper.getCell(sheet, "StId").getRow();
		
		for (Informative informative : policy.getInformative()) {
			XSSFRow nRow = sheet.createRow(sheet.getLastRowNum() + 1);
			DocumentHelper.cloneRow(workbook, sheet, nRow, tRow);
			
			DocumentHelper.replaceText(nRow, "StId", informative.getName());
			DocumentHelper.replaceText(nRow, "StDescription", informative.getDescription());
			DocumentHelper.replaceText(nRow, "StCondition", informative.getCondition());
			String modality = informative.getModality().toLowerCase();
			DocumentHelper.replaceText(nRow, "StModality", modality);
			DocumentHelper.replaceText(nRow, "StType", "Informative");
			
			if (informative.getRefPrivateData().size() > 0) {
				StringBuilder pdIds = new StringBuilder();
				
				for (RefPrivateData ref : informative.getRefPrivateData()) {
					PrivateData pd = ref.getRefPrivateData();
					pdIds.append(pd.getName());
					pdIds.append(", ");
				}
				pdIds.delete(pdIds.length() - 2, pdIds.length());
				
				DocumentHelper.replaceText(nRow, "StPDId", pdIds.toString());
			} else {
				DocumentHelper.replaceText(nRow, "StPDId", "");
			}
			
			DocumentHelper.replaceText(nRow, "StRId", "");
			
			if (informative.getRefService().size() > 0) {
				StringBuilder sIds = new StringBuilder();
				
				for (RefService ref : informative.getRefService()) {
					Service s = ref.getRefService();
					sIds.append(s.getName());
					sIds.append(", ");
				}
				sIds.delete(sIds.length() - 2, sIds.length());
				
				DocumentHelper.replaceText(nRow, "StSId", sIds.toString());
			} else {
				DocumentHelper.replaceText(nRow, "StSId", "");
			}
			
			if (informative.getRefEnforcement().size() > 0) {
				StringBuilder eIds = new StringBuilder();
				
				for (RefEnforcement ref : informative.getRefEnforcement()) {
					Enforcement e = ref.getRefEnforcement();
					eIds.append(e.getName());
					eIds.append(", ");
				}
				eIds.delete(eIds.length() - 2, eIds.length());
				
				DocumentHelper.replaceText(nRow, "StEId", eIds.toString());
			} else {
				DocumentHelper.replaceText(nRow, "StEId", "");
			}
			
			DocumentHelper.replaceText(nRow, "StPeriod", "");
		}
	}
	
	private void writeRecipients(Policy policy, XSSFWorkbook workbook) {
		XSSFSheet sheet = workbook.getSheet("Recipients");
		XSSFRow tRow = (XSSFRow) DocumentHelper.getCell(sheet, "RId").getRow();
		
		for (Recipient recipient : policy.getRecipient()) {
			XSSFRow nRow = sheet.createRow(sheet.getLastRowNum() + 1);
			DocumentHelper.cloneRow(workbook, sheet, nRow, tRow);
			
			DocumentHelper.replaceText(nRow, "RId", recipient.getName());
			DocumentHelper.replaceText(nRow, "RDescription", recipient.getDescription());
			String scope = recipient.getScope().toLowerCase();
			DocumentHelper.replaceText(nRow, "RScope", scope);
			String type = recipient.getType().toLowerCase();
			DocumentHelper.replaceText(nRow, "RType", type);
			
			if (recipient.getRecipientPart().size() > 0) {
				String rId = recipient.getRecipientPart().get(0).getRecipientPart().getName();
				DocumentHelper.replaceText(nRow, "SRId", rId);
			} else {
				DocumentHelper.replaceText(nRow, "SRId", "");
			}
		}
		
		// Delete the Template Row
		sheet.shiftRows(tRow.getRowNum() + 1, sheet.getLastRowNum(), -1);
	}
	
	private void writeServices(Policy policy, XSSFWorkbook workbook) {
		XSSFSheet sheet = workbook.getSheet("Services");
		XSSFRow tRow = (XSSFRow) DocumentHelper.getCell(sheet, "SId").getRow();
		
		for (Service service : policy.getService()) {
			XSSFRow nRow = sheet.createRow(sheet.getLastRowNum() + 1);
			DocumentHelper.cloneRow(workbook, sheet, nRow, tRow);
			
			DocumentHelper.replaceText(nRow, "SId", service.getName());
			DocumentHelper.replaceText(nRow, "SName", service.getServiceName());
			DocumentHelper.replaceText(nRow, "SDescription", service.getDescription());
			
			if (service.getRefPrivateData().size() > 0) {
				StringBuilder pdIds = new StringBuilder();
				
				for (RefPrivateData attr : service.getRefPrivateData()) {
					PrivateData pd = attr.getRefPrivateData();
					pdIds.append(pd.getName());
					pdIds.append(", ");
				}
				pdIds.delete(pdIds.length() - 2, pdIds.length());
				
				DocumentHelper.replaceText(nRow, "SPDId", pdIds.toString());
			} else {
				DocumentHelper.replaceText(nRow, "SPDId", "");
			}
			
			if (service.getServicePart().size() > 0) {
				String ssId = service.getServicePart().get(0).getServicePart().getName();
				DocumentHelper.replaceText(nRow, "SSId", ssId);
			} else {
				DocumentHelper.replaceText(nRow, "SSId", "");
			}
		}
		
		// Delete the Template Row
		sheet.shiftRows(tRow.getRowNum() + 1, sheet.getLastRowNum(), -1);
	}
	
	private void writePrivateData(Policy policy, XSSFWorkbook workbook) {
		XSSFSheet sheet = workbook.getSheet("PrivateData");
		XSSFRow tRow = (XSSFRow) DocumentHelper.getCell(sheet, "PDId").getRow();
		
		for (PrivateData privateData : policy.getPrivateData()) {
			XSSFRow nRow = sheet.createRow(sheet.getLastRowNum() + 1);
			DocumentHelper.cloneRow(workbook, sheet, nRow, tRow);
			
			DocumentHelper.replaceText(nRow, "PDId", privateData.getName());

			String type = privateData.getType();
			
			if (type.equals("PersonalInformation")) {
				type = "Personal Information";
			} else {
				type = "Usage Information";
			}
			
			DocumentHelper.replaceText(nRow, "PDType", type);
			DocumentHelper.replaceText(nRow, "PDDescription", privateData.getDescription());
			
			if (privateData.getAttribute().size() > 0) {
				StringBuilder attributes = new StringBuilder();
				
				for (Attribute attr : privateData.getAttribute()) {
					attributes.append(attr.getName());
					attributes.append(", ");
				}
				attributes.delete(attributes.length() - 2, attributes.length());
				
				DocumentHelper.replaceText(nRow, "PDAttributes", attributes.toString());
			} else {
				DocumentHelper.replaceText(nRow, "PDAttributes", "");
			}
		}
		
		// Delete the Template Row
		sheet.shiftRows(tRow.getRowNum() + 1, sheet.getLastRowNum(), -1);
	}
	
	private void writeEnforcements(Policy policy, XSSFWorkbook workbook) {
		XSSFSheet sheet = workbook.getSheet("Enforcements");
		XSSFRow tRow = (XSSFRow) DocumentHelper.getCell(sheet, "EId").getRow();
		
		for (Enforcement enforcement : policy.getEnforcement()) {
			XSSFRow nRow = sheet.createRow(sheet.getLastRowNum() + 1);
			DocumentHelper.cloneRow(workbook, sheet, nRow, tRow);
			
			DocumentHelper.replaceText(nRow, "EId", enforcement.getName());
			DocumentHelper.replaceText(nRow, "EName", enforcement.getEnforcementName());
			DocumentHelper.replaceText(nRow, "EDescription", enforcement.getDescription());
			DocumentHelper.replaceText(nRow, "EType", enforcement.getType());
		}
		
		// Delete the Template Row
		sheet.shiftRows(tRow.getRowNum() + 1, sheet.getLastRowNum(), -1);
	}
}
