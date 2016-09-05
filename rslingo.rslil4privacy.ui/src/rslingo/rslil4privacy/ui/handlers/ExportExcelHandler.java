package rslingo.rslil4privacy.ui.handlers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFCreationHelper;
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
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
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

	private static final String PLUGIN_ID = "rslingo.rslil4privacy";
	private static final String GEN_FOLDER = "src-gen";
	private static final String DOCS_FOLDER = "docs";
	private static final String FILE_EXT = ".rslil4privacy";
	private static final String DEF_EXCEL_PATH = "RSL-IL4Privacy-ExcelTemplate.xlsx";

	private final String RSLINGO_PATH = Platform.getInstallLocation()
			.getURL().getPath().substring(1)
			+ "RSLingo4Privacy/";
	
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
				generateExcel(file, shell);
			} else {
				IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
				IFile file = (IFile) activeEditor.getEditorInput().getAdapter(IFile.class);
				generateExcel(file, shell);
			}
		} else {
			MenuCommand cmd = new MenuCommand() {
				@Override
				public void execute(IProject project, IFile file) {
					generateExcel(file, shell);
				}
			};
			MenuCommandWindow window = new MenuCommandWindow(shell, cmd, false, FILE_EXT);
			window.open();
		}
		
		return null;
	}

	private void generateExcel(IFile file, Shell shell) {
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
		Job job = new Job("Exporting to Excel...") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
				//URI.createURI("platform:/resource/rslingo.rslil/src/example.rslil4privacy"), true);
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
					String excelPath = ConfigurationHelper.getExcelPath();
					InputStream from = null;
					
					if (excelPath.equals(DEF_EXCEL_PATH)) {
						from = new FileInputStream(RSLINGO_PATH + DEF_EXCEL_PATH);
					} else {
						from = new FileInputStream(excelPath);
					}
					
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
					return new Status(Status.ERROR, PLUGIN_ID, e.getMessage(), e);
				}
				return Status.OK_STATUS;
			}
	    };
	    job.setUser(true);
	    job.schedule();
	}
	
	private void writeMetadata(Metadata metadata, XSSFWorkbook workbook) {
		XSSFSheet sheet = workbook.getSheet("Home");
		XSSFRow rowName = (XSSFRow) DocumentHelper.getCell(sheet, "HPolicyName").getRow();
		DocumentHelper.replaceText(rowName, "HPolicyName", metadata.getName());
		XSSFRow rowDescription = (XSSFRow) DocumentHelper.getCell(sheet, "HDescription").getRow();
		DocumentHelper.replaceText(rowDescription, "HDescription", metadata.getDescription());
		XSSFRow rowAuthors = (XSSFRow) DocumentHelper.getCell(sheet, "HAuthors").getRow();
		DocumentHelper.replaceText(rowAuthors, "HAuthors", metadata.getAuthors());
		XSSFRow rowOrgs = (XSSFRow) DocumentHelper.getCell(sheet, "HOrganizations").getRow();
		DocumentHelper.replaceText(rowOrgs, "HOrganizations", metadata.getOrganizations());

		// Set Date cell and apply style
		Cell cellDate = DocumentHelper.getCell(sheet, "HDate");
		Date date = metadata.getDate();
		String dateVal = date.getDay() + "-"
				+ DocumentHelper.getNumberOfRSLILMonth(date.getMonth().getName())
				+ "-" + date.getYear();
		XSSFCreationHelper createHelper = workbook.getCreationHelper();
		XSSFCellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-mmm-yyyy"));
		cellDate.setCellValue(DocumentHelper.parseDate(dateVal));
		cellDate.setCellStyle(cellStyle);
		
		XSSFRow rowVersion = (XSSFRow) DocumentHelper.getCell(sheet, "HVersion").getRow();
		DocumentHelper.replaceText(rowVersion, "HVersion", metadata.getVersion());
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
			
			RefPrivateData refPrivateData = collection.getRefPrivateData();
			
			if (refPrivateData != null) {
				StringBuilder pdIds = new StringBuilder();
				PrivateData pd = refPrivateData.getRefPrivateData();
				pdIds.append(pd.getName());
				
				for (PrivateData refMulPD : refPrivateData.getRefs()) {
					pdIds.append(", ");
					pdIds.append(refMulPD.getName());
				}
				
				DocumentHelper.replaceText(nRow, "StPDId", pdIds.toString());
			} else if (collection.getRefPDAll() != null) {
				DocumentHelper.replaceText(nRow, "StPDId", collection.getRefPDAll());
			} else {
				DocumentHelper.replaceText(nRow, "StPDId", "");
			}
			
			DocumentHelper.replaceText(nRow, "StRId", "");
			
			RefService refService = collection.getRefService();
			
			if (refService != null) {
				StringBuilder sIds = new StringBuilder();
				
				Service s = refService.getRefService();
				sIds.append(s.getName());
				
				for (Service ref : refService.getRefs()) {
					sIds.append(", ");
					sIds.append(ref.getName());
				}
				
				DocumentHelper.replaceText(nRow, "StSId", sIds.toString());
			} else if (collection.getRefSAll() != null) {
				DocumentHelper.replaceText(nRow, "StSId", collection.getRefSAll());
			} else {
				DocumentHelper.replaceText(nRow, "StSId", "");
			}
			
			RefEnforcement refEnf = collection.getRefEnforcement();
			
			if (refEnf != null) {
				StringBuilder eIds = new StringBuilder();
				Enforcement e = refEnf.getRefEnforcement();
				eIds.append(e.getName());
				
				for (Enforcement refEnforcement : refEnf.getRefs()) {
					eIds.append(", ");
					eIds.append(refEnforcement.getName());
				}
				
				DocumentHelper.replaceText(nRow, "StEId", eIds.toString());
			} else if (collection.getRefEAll() != null) {
				DocumentHelper.replaceText(nRow, "StEId", collection.getRefEAll());
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
			
			RefPrivateData refPrivateData = disclosure.getRefPrivateData();
			
			if (refPrivateData != null) {
				StringBuilder pdIds = new StringBuilder();
				PrivateData pd = refPrivateData.getRefPrivateData();
				pdIds.append(pd.getName());
				
				for (PrivateData refMulPD : refPrivateData.getRefs()) {
					pdIds.append(", ");
					pdIds.append(refMulPD.getName());
				}
				
				DocumentHelper.replaceText(nRow, "StPDId", pdIds.toString());
			} else if (disclosure.getRefPDAll() != null) {
				DocumentHelper.replaceText(nRow, "StPDId", disclosure.getRefPDAll());
			} else {
				DocumentHelper.replaceText(nRow, "StPDId", "");
			}
			
			RefRecipient refRecipient = disclosure.getRefRecipient();
			
			if (refRecipient != null) {
				StringBuilder rIds = new StringBuilder();
				Recipient r = refRecipient.getRefRecipient();
				rIds.append(r.getName());
				
				for (Recipient refRec : refRecipient.getRefs()) {
					rIds.append(", ");
					rIds.append(refRec.getName());
				}
				
				DocumentHelper.replaceText(nRow, "StRId", rIds.toString());
			} else if (disclosure.getRefRAll() != null) {
				DocumentHelper.replaceText(nRow, "StRId", disclosure.getRefRAll());
			} else {
				DocumentHelper.replaceText(nRow, "StRId", "");
			}
			
			RefService refService = disclosure.getRefService();
			
			if (refService != null) {
				StringBuilder sIds = new StringBuilder();
				
				Service s = refService.getRefService();
				sIds.append(s.getName());
				
				for (Service ref : refService.getRefs()) {
					sIds.append(", ");
					sIds.append(ref.getName());
				}
				
				DocumentHelper.replaceText(nRow, "StSId", sIds.toString());
			} else if (disclosure.getRefSAll() != null) {
				DocumentHelper.replaceText(nRow, "StSId", disclosure.getRefSAll());
			} else {
				DocumentHelper.replaceText(nRow, "StSId", "");
			}
			
			RefEnforcement refEnf = disclosure.getRefEnforcement();
			
			if (refEnf != null) {
				StringBuilder eIds = new StringBuilder();
				Enforcement e = refEnf.getRefEnforcement();
				eIds.append(e.getName());
				
				for (Enforcement refEnforcement : refEnf.getRefs()) {
					eIds.append(", ");
					eIds.append(refEnforcement.getName());
				}
				
				DocumentHelper.replaceText(nRow, "StEId", eIds.toString());
			} else if (disclosure.getRefEAll() != null) {
				DocumentHelper.replaceText(nRow, "StEId", disclosure.getRefEAll());
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
			
			RefPrivateData refPrivateData = retention.getRefPrivateData();
			
			if (refPrivateData != null) {
				StringBuilder pdIds = new StringBuilder();
				PrivateData pd = refPrivateData.getRefPrivateData();
				pdIds.append(pd.getName());
				
				for (PrivateData refMulPD : refPrivateData.getRefs()) {
					pdIds.append(", ");
					pdIds.append(refMulPD.getName());
				}

				DocumentHelper.replaceText(nRow, "StPDId", pdIds.toString());
			} else if (retention.getRefPDAll() != null) {
				DocumentHelper.replaceText(nRow, "StPDId", retention.getRefPDAll());
			} else {
				DocumentHelper.replaceText(nRow, "StPDId", "");
			}
			
			DocumentHelper.replaceText(nRow, "StRId", "");
			
			RefService refService = retention.getRefService();
			
			if (refService != null) {
				StringBuilder sIds = new StringBuilder();
				Service s = refService.getRefService();
				sIds.append(s.getName());
					
				for (Service ref : refService.getRefs()) {
					sIds.append(", ");
					sIds.append(ref.getName());
				}
				
				DocumentHelper.replaceText(nRow, "StSId", sIds.toString());
			} else if (retention.getRefSAll() != null) {
				DocumentHelper.replaceText(nRow, "StSId", retention.getRefSAll());
			} else {
				DocumentHelper.replaceText(nRow, "StSId", "");
			}
			
			RefEnforcement refEnf = retention.getRefEnforcement();
			
			if (refEnf != null) {
				StringBuilder eIds = new StringBuilder();
				Enforcement e = refEnf.getRefEnforcement();
				eIds.append(e.getName());
				
				for (Enforcement refEnforcement : refEnf.getRefs()) {
					eIds.append(", ");
					eIds.append(refEnforcement.getName());
				}
				
				DocumentHelper.replaceText(nRow, "StEId", eIds.toString());
			} else if (retention.getRefEAll() != null) {
				DocumentHelper.replaceText(nRow, "StEId", retention.getRefEAll());
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
			
			RefPrivateData refPrivateData = usage.getRefPrivateData();
			
			if (refPrivateData != null) {
				StringBuilder pdIds = new StringBuilder();
				PrivateData pd = refPrivateData.getRefPrivateData();
				pdIds.append(pd.getName());
				
				for (PrivateData refMulPD : refPrivateData.getRefs()) {
					pdIds.append(", ");
					pdIds.append(refMulPD.getName());
				}
				
				DocumentHelper.replaceText(nRow, "StPDId", pdIds.toString());
			} else if (usage.getRefPDAll() != null) {
				DocumentHelper.replaceText(nRow, "StPDId", usage.getRefPDAll());
			} else {
				DocumentHelper.replaceText(nRow, "StPDId", "");
			}
			
			DocumentHelper.replaceText(nRow, "StRId", "");
			
			RefService refService = usage.getRefService();
			
			if (refService != null) {
				StringBuilder sIds = new StringBuilder();
				Service s = refService.getRefService();
				sIds.append(s.getName());
				
				for (Service ref : refService.getRefs()) {
					sIds.append(", ");
					sIds.append(ref.getName());
				}
				
				DocumentHelper.replaceText(nRow, "StSId", sIds.toString());
			} else if (usage.getRefSAll() != null) {
				DocumentHelper.replaceText(nRow, "StSId", usage.getRefSAll());
			} else {
				DocumentHelper.replaceText(nRow, "StSId", "");
			}
			
			RefEnforcement refEnf = usage.getRefEnforcement();
			
			if (refEnf != null) {
				StringBuilder eIds = new StringBuilder();
				Enforcement e = refEnf.getRefEnforcement();
				eIds.append(e.getName());
					
				for (Enforcement refEnforcement : refEnf.getRefs()) {
					eIds.append(", ");
					eIds.append(refEnforcement.getName());
				}
				
				DocumentHelper.replaceText(nRow, "StEId", eIds.toString());
			} else if (usage.getRefEAll() != null) {
				DocumentHelper.replaceText(nRow, "StEId", usage.getRefEAll());
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
			
			RefPrivateData refPrivateData = informative.getRefPrivateData();
			
			if (refPrivateData != null) {
				StringBuilder pdIds = new StringBuilder();
				PrivateData pd = refPrivateData.getRefPrivateData();
				pdIds.append(pd.getName());
				
				for (PrivateData refMulPD : refPrivateData.getRefs()) {
					pdIds.append(", ");
					pdIds.append(refMulPD.getName());
				}
				
				DocumentHelper.replaceText(nRow, "StPDId", pdIds.toString());
			} else if (informative.getRefPDAll() != null) {
				DocumentHelper.replaceText(nRow, "StPDId", informative.getRefPDAll());
			} else {
				DocumentHelper.replaceText(nRow, "StPDId", "");
			}
			
			DocumentHelper.replaceText(nRow, "StRId", "");
			
			RefService refService = informative.getRefService();
			
			if (refService != null) {
				StringBuilder sIds = new StringBuilder();
				Service s = refService.getRefService();
				sIds.append(s.getName());
					
				for (Service ref : refService.getRefs()) {
					sIds.append(", ");
					sIds.append(ref.getName());
				}
				
				DocumentHelper.replaceText(nRow, "StSId", sIds.toString());
			} else if (informative.getRefSAll() != null) {
				DocumentHelper.replaceText(nRow, "StSId", informative.getRefSAll());
			} else {
				DocumentHelper.replaceText(nRow, "StSId", "");
			}
			
			RefEnforcement refEnf = informative.getRefEnforcement();
			
			if (refEnf != null) {
				StringBuilder eIds = new StringBuilder();
				Enforcement e = refEnf.getRefEnforcement();
				eIds.append(e.getName());
				
				for (Enforcement refEnforcement : refEnf.getRefs()) {
					eIds.append(", ");
					eIds.append(refEnforcement.getName());
				}
				
				DocumentHelper.replaceText(nRow, "StEId", eIds.toString());
			} else if (informative.getRefEAll() != null) {
				DocumentHelper.replaceText(nRow, "StEId", informative.getRefEAll());
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
			
			RefPrivateData refPD = service.getRefPrivateData();
			
			if (refPD != null) {
				StringBuilder pdIds = new StringBuilder();
				PrivateData pd = refPD.getRefPrivateData();
				pdIds.append(pd.getName());
					
				for (PrivateData refMulPD : refPD.getRefs()) {
					pdIds.append(", ");
					pdIds.append(refMulPD.getName());
				}
				
				DocumentHelper.replaceText(nRow, "SPDId", pdIds.toString());
			} else if (service.getRefPDAll() != null) {
				DocumentHelper.replaceText(nRow, "SPDId", service.getRefPDAll());
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
