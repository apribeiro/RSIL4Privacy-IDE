package org.xtext.example.mydsl.ui.handlers;

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
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.xtext.example.mydsl.MyDslStandaloneSetup;
import org.xtext.example.mydsl.myDsl.Collection;
import org.xtext.example.mydsl.myDsl.Disclosure;
import org.xtext.example.mydsl.myDsl.Enforcement;
import org.xtext.example.mydsl.myDsl.Informative;
import org.xtext.example.mydsl.myDsl.Policy;
import org.xtext.example.mydsl.myDsl.PrivateData;
import org.xtext.example.mydsl.myDsl.Recipient;
import org.xtext.example.mydsl.myDsl.Retention;
import org.xtext.example.mydsl.myDsl.Service;
import org.xtext.example.mydsl.myDsl.Usage;
import org.xtext.example.mydsl.ui.windows.MenuCommand;
import org.xtext.example.mydsl.ui.windows.MenuCommandWindow;

import com.google.inject.Injector;

public class ExportExcelHandler extends AbstractHandler {

	private static final String GEN_FOLDER = "src-gen";
	private static final String DOCS_FOLDER = "docs";
	private static final String FILE_EXT = ".mydsl";
	private static final String DEF_WORD_PATH = "RSL-IL4Privacy-ExcelTemplate.xlsx";

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
			generateExcel(file);
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
				Injector injector = new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
				XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
				resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
				Resource resource = resourceSet.getResource(
						URI.createURI("platform:/resource/" + file.getFullPath().toString()), true);
				//URI.createURI("platform:/resource/org.xtext.example.mydsl/src/example.mydsl"), true);
				Policy policy = (Policy) resource.getContents().get(0);

				try {
					InputStream from = new FileInputStream(PLUGIN_PATH + DEF_WORD_PATH);
					XSSFWorkbook workbook = new XSSFWorkbook(from);

					writeStatements(policy, workbook);
					writePrivateData(policy, workbook);
					writeServices(policy, workbook);
					writeRecipients(policy, workbook);
					writeEnforcements(policy, workbook);

					// Write the Document in file system
					File to = new File(project.getLocation().toOSString()
							+ "/" + GEN_FOLDER + "/" + DOCS_FOLDER 
							+ "/" + file.getName() + ".xlsx");
					FileOutputStream out = new FileOutputStream(to);
					workbook.write(out);
					out.close();
					workbook.close();

					project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());

					System.out.println(file.getName() + ".xlsx generated!");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		new Thread(runnable).start();
	}
	
	private void writeStatements(Policy policy, XSSFWorkbook workbook) {
		writeCollectionStatements(policy, workbook);
		writeDisclosureStatements(policy, workbook);
		writeRetentionStatements(policy, workbook);
		writeUsageStatements(policy, workbook);
		writeInformativeStatements(policy, workbook);
		
		// Delete Template Row
//		XSSFSheet sheet = workbook.getSheet("Statements");
//		XSSFRow tRow = (XSSFRow) DocumentHelper.getCell(sheet, "StId").getRow();
//		int lastRowNum = sheet.getLastRowNum();
//		int tRowNum = tRow.getRowNum();
//		
//		if (tRowNum >= 0 && tRowNum < lastRowNum) {
//			sheet.shiftRows(tRowNum + 1, lastRowNum, 1, true, true);
//		}
		
//		sheet.removeRow(tRow);
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
			String modality = collection.getModalitykind().toLowerCase();
			DocumentHelper.replaceText(nRow, "StModality", modality);
			DocumentHelper.replaceText(nRow, "StType", "Collection");
			
			if (collection.getRefprivatedata().size() > 0) {
				DocumentHelper.replaceText(nRow, "StPDId", "pdid");
			} else {
				DocumentHelper.replaceText(nRow, "StPDId", "");
			}
			
			DocumentHelper.replaceText(nRow, "StRId", "");
			
			if (collection.getRefertoservice().size() > 0) {
				DocumentHelper.replaceText(nRow, "StSId", "sid");
			} else {
				DocumentHelper.replaceText(nRow, "StSId", "");
			}
			
			if (collection.getRefertoEnforcement().size() > 0) {
				DocumentHelper.replaceText(nRow, "StEId", "eid");
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
			String modality = disclosure.getModalitykind().toLowerCase();
			DocumentHelper.replaceText(nRow, "StModality", modality);
			DocumentHelper.replaceText(nRow, "StType", "Disclosure");
			
			if (disclosure.getRefprivatedata().size() > 0) {
				DocumentHelper.replaceText(nRow, "StPDId", "pdid");
			} else {
				DocumentHelper.replaceText(nRow, "StPDId", "");
			}
			
			if (disclosure.getReferToRecipient().size() > 0) {
				DocumentHelper.replaceText(nRow, "StRId", "rid");
			} else {
				DocumentHelper.replaceText(nRow, "StRId", "");
			}
			
			if (disclosure.getRefertoservice().size() > 0) {
				DocumentHelper.replaceText(nRow, "StSId", "sid");
			} else {
				DocumentHelper.replaceText(nRow, "StSId", "");
			}
			
			if (disclosure.getRefertoEnforcement().size() > 0) {
				DocumentHelper.replaceText(nRow, "StEId", "eid");
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
			String modality = retention.getModalitykind().toLowerCase();
			DocumentHelper.replaceText(nRow, "StModality", modality);
			DocumentHelper.replaceText(nRow, "StType", "Retention");
			
			if (retention.getRefprivatedata().size() > 0) {
				DocumentHelper.replaceText(nRow, "StPDId", "pdid");
			} else {
				DocumentHelper.replaceText(nRow, "StPDId", "");
			}
			
			DocumentHelper.replaceText(nRow, "StRId", "");
			
			if (retention.getRefertoservice().size() > 0) {
				DocumentHelper.replaceText(nRow, "StSId", "sid");
			} else {
				DocumentHelper.replaceText(nRow, "StSId", "");
			}
			
			if (retention.getRefertoEnforcement().size() > 0) {
				DocumentHelper.replaceText(nRow, "StEId", "eid");
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
			String modality = usage.getModalitykind().toLowerCase();
			DocumentHelper.replaceText(nRow, "StModality", modality);
			DocumentHelper.replaceText(nRow, "StType", "Usage");
			
			if (usage.getRefprivatedata().size() > 0) {
				DocumentHelper.replaceText(nRow, "StPDId", "pdid");
			} else {
				DocumentHelper.replaceText(nRow, "StPDId", "");
			}
			
			DocumentHelper.replaceText(nRow, "StRId", "");
			
			if (usage.getRefertoservice().size() > 0) {
				DocumentHelper.replaceText(nRow, "StSId", "sid");
			} else {
				DocumentHelper.replaceText(nRow, "StSId", "");
			}
			
			if (usage.getRefertoEnforcement().size() > 0) {
				DocumentHelper.replaceText(nRow, "StEId", "eid");
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
			String modality = informative.getModalitykind().toLowerCase();
			DocumentHelper.replaceText(nRow, "StModality", modality);
			DocumentHelper.replaceText(nRow, "StType", "Informative");
			
			if (informative.getRefprivatedata().size() > 0) {
				DocumentHelper.replaceText(nRow, "StPDId", "pdid");
			} else {
				DocumentHelper.replaceText(nRow, "StPDId", "");
			}
			
			DocumentHelper.replaceText(nRow, "StRId", "");
			
			if (informative.getRefertoservice().size() > 0) {
				DocumentHelper.replaceText(nRow, "StSId", "sid");
			} else {
				DocumentHelper.replaceText(nRow, "StSId", "");
			}
			
			if (informative.getRefertoEnforcement().size() > 0) {
				DocumentHelper.replaceText(nRow, "StEId", "eid");
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
			String scope = recipient.getRecipientScopeKind().toLowerCase();
			DocumentHelper.replaceText(nRow, "RScope", scope);
			String type = recipient.getRecipientTypeKind().toLowerCase();
			DocumentHelper.replaceText(nRow, "RType", type);
			
			if (recipient.getPartof().size() > 0) {
				DocumentHelper.replaceText(nRow, "SRId", "rid");
			} else {
				DocumentHelper.replaceText(nRow, "SRId", "");
			}
		}
	}
	
	private void writeServices(Policy policy, XSSFWorkbook workbook) {
		XSSFSheet sheet = workbook.getSheet("Services");
		XSSFRow tRow = (XSSFRow) DocumentHelper.getCell(sheet, "SId").getRow();
		
		for (Service service : policy.getService()) {
			XSSFRow nRow = sheet.createRow(sheet.getLastRowNum() + 1);
			DocumentHelper.cloneRow(workbook, sheet, nRow, tRow);
			
			DocumentHelper.replaceText(nRow, "SId", service.getName());
			DocumentHelper.replaceText(nRow, "SName", service.getServicename());
			DocumentHelper.replaceText(nRow, "SDescription", service.getDescription());
			
			if (service.getRefprivatedata().size() > 0) {
				DocumentHelper.replaceText(nRow, "SPDId", "pdid");
			} else {
				DocumentHelper.replaceText(nRow, "SPDId", "");
			}
			
			if (service.getServicepartof().size() > 0) {
				DocumentHelper.replaceText(nRow, "SSSId", "ssid");
			} else {
				DocumentHelper.replaceText(nRow, "SSSId", "");
			}
		}
	}
	
	private void writePrivateData(Policy policy, XSSFWorkbook workbook) {
		XSSFSheet sheet = workbook.getSheet("PrivateData");
		XSSFRow tRow = (XSSFRow) DocumentHelper.getCell(sheet, "PDId").getRow();
		
		for (PrivateData privateData : policy.getPrivateData()) {
			XSSFRow nRow = sheet.createRow(sheet.getLastRowNum() + 1);
			DocumentHelper.cloneRow(workbook, sheet, nRow, tRow);
			
			DocumentHelper.replaceText(nRow, "PDId", privateData.getName());
			// FIXME Separate Type words
			DocumentHelper.replaceText(nRow, "PDType", privateData.getPrivateDataKind());
			DocumentHelper.replaceText(nRow, "PDDescription", privateData.getPrivatedata());
			
			if (privateData.getAttribute().size() > 0) {
				DocumentHelper.replaceText(nRow, "PDAttributes", "attributes");
			} else {
				DocumentHelper.replaceText(nRow, "PDAttributes", "");
			}
		}
	}
	
	private void writeEnforcements(Policy policy, XSSFWorkbook workbook) {
		XSSFSheet sheet = workbook.getSheet("Enforcements");
		XSSFRow tRow = (XSSFRow) DocumentHelper.getCell(sheet, "EId").getRow();
		
		for (Enforcement enforcement : policy.getEnforcement()) {
			XSSFRow nRow = sheet.createRow(sheet.getLastRowNum() + 1);
			DocumentHelper.cloneRow(workbook, sheet, nRow, tRow);
			
			DocumentHelper.replaceText(nRow, "EId", enforcement.getName());
			DocumentHelper.replaceText(nRow, "EName", enforcement.getEnforcementName());
			DocumentHelper.replaceText(nRow, "EDescription", enforcement.getEnforcementDescription());
			DocumentHelper.replaceText(nRow, "EType", enforcement.getEnforcementKind());
		}
	}
}
