package org.xtext.example.mydsl.ui.handlers;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

public class ImportExcelHandler extends AbstractHandler {

	private static final String GEN_FOLDER = "src-gen";
	private static final String DOCS_FOLDER = "docs";
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		FileDialog dialog = new FileDialog(window.getShell(), SWT.OPEN);
		dialog.setFilterExtensions(new String[] { "*.xlsx", "*.xls" });
		dialog.setText("Select the Excel file to upload");
		String filePath = dialog.open();
		
		if (filePath != null) {
			try {
				IWorkspaceRoot workspace = ResourcesPlugin.getWorkspace().getRoot();
		        IProject project = workspace.getProjects()[0];
				IFolder srcGenFolder = project.getFolder(GEN_FOLDER);
                
	            if (!srcGenFolder.exists()) {
                    srcGenFolder.create(true, true, new NullProgressMonitor());
	            }
				
	            IFolder docsFolder = srcGenFolder.getFolder(DOCS_FOLDER);
	    		
	    		if (!docsFolder.exists()) {
	    			docsFolder.create(true, true, new NullProgressMonitor());
	            }
	            
	            importExcelFile(docsFolder, filePath, dialog.getFileName());
				generateStatementsFile(srcGenFolder, filePath, dialog.getFileName());
				generatePrivateDataFile(srcGenFolder, filePath, dialog.getFileName());
				generateServicesFile(srcGenFolder, filePath, dialog.getFileName());
				generateEnforcementsFile(srcGenFolder, filePath, dialog.getFileName());
				generateRecipientsFile(srcGenFolder, filePath, dialog.getFileName());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return null;
	}
	
	private void importExcelFile(IFolder docsFolder, String filePath, String fileName)
			throws Exception {
		IFile file = docsFolder.getFile(fileName);
		InputStream source = new FileInputStream(new File(filePath));
		
		if (!file.exists()) {
			file.create(source, IResource.FORCE, null);
		} else {
			file.setContents(source, IResource.FORCE, null);
		}
	}
	
	private void generateStatementsFile(IFolder srcGenFolder, String filePath, String fileName)
			throws Exception {
		StringBuilder sb = new StringBuilder();
		InputStream inp = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(inp);
		sb.append("Package " + fileName + ".Statements.RSLingo4Privacy {");
		sb.append("\n");
		sb.append("\n");
		sb.append("import " + fileName + ".Privatedata.RSLingo4Privacy.*");
		sb.append("\n");
		sb.append("import " + fileName + ".Services.RSLingo4Privacy.*");
		sb.append("\n");
		sb.append("import " + fileName + ".Enforcements.RSLingo4Privacy.*");
		sb.append("\n");
		sb.append("import " + fileName + ".Recipients.RSLingo4Privacy.*");
		sb.append("\n");
		sb.append("\n");
		
		// Get the Statements Sheet
	    Sheet sheet = wb.getSheetAt(1);
    	Iterator<Row> rowIt = sheet.rowIterator();
    	// Ignore the Header row
    	rowIt.next();
    	
    	while (rowIt.hasNext()) {
    		Row row = rowIt.next();
    		Cell cellId = row.getCell(0);
    		
    		if (cellId != null) {
    			int id = (int) cellId.getNumericCellValue();
	    		Cell cellDescription = row.getCell(1);
	    		String description = cellDescription.getStringCellValue();
	    		Cell cellCondition = row.getCell(2);
	    		String condition = cellCondition.getStringCellValue();
	    		Cell cellModality = row.getCell(3);
	    		String modality = cellModality.getStringCellValue();
	    		modality = modality.substring(0, 1).toUpperCase() + modality.substring(1);
	    		Cell cellType = row.getCell(4);
	    		String type = cellType.getStringCellValue();
	    		Cell cellPrivateData = row.getCell(5);
	    		Cell cellService = row.getCell(7);
	    		Cell cellEnforcement = row.getCell(8);
	    		sb.append(type + " st" + id + " {");
	    		sb.append("\n");
	    		sb.append("\tDescription \"" + description + "\",");
	    		sb.append("\n");
	    		sb.append("\tCondition \"" + condition + "\",");
	    		sb.append("\n");
	    		
	    		if (type.equals("Retention")) {
	    			sb.append("\tPeriod \"As long as it is necessary\",");
		    		sb.append("\n");
				}
	    		
	    		if (cellPrivateData.getCellType() == Cell.CELL_TYPE_NUMERIC) {
	    			int privateData = (int) cellPrivateData.getNumericCellValue();
	    			sb.append("\tRefersTo PrivateData PD" + privateData + ",");
	    			sb.append("\n");
				} else if (cellPrivateData.getCellType() == Cell.CELL_TYPE_STRING) {
					String privateData = cellPrivateData.getStringCellValue();
					
					if (!privateData.equals("All")) {
						sb.append("\tRefersTo PrivateData ");
			    		
		    			for (String s : privateData.split(", ")) {
		    				sb.append("PD" + s + "-"); 
						}
		    			// Delete last '-'
		    			sb.deleteCharAt(sb.length() - 1);
		    			sb.append(",");
		    			sb.append("\n");
					}
				}
	    		
	    		if (cellService.getCellType() == Cell.CELL_TYPE_NUMERIC) {
	    			int service = (int) cellService.getNumericCellValue();
	    			sb.append("\tRefersTo Service S" + service + ",");
	    			sb.append("\n");
				} else if (cellService.getCellType() == Cell.CELL_TYPE_STRING) {
					String service = cellService.getStringCellValue();
					
					if (!service.equals("All")) {
						sb.append("\tRefersTo Service ");
			    		
		    			for (String s : service.split(", ")) {
		    				sb.append("S" + s + "-"); 
						}
		    			// Delete last '-'
		    			sb.deleteCharAt(sb.length() - 1);
		    			sb.append(",");
		    			sb.append("\n");
					}
				}
	    		
	    		if (cellEnforcement.getCellType() == Cell.CELL_TYPE_NUMERIC) {
	    			int enforcement = (int) cellEnforcement.getNumericCellValue();
	    			sb.append("\tRefersTo Enforcement En" + enforcement + ",");
	    			sb.append("\n");
				} else if (cellEnforcement.getCellType() == Cell.CELL_TYPE_STRING) {
					String enforcement = cellEnforcement.getStringCellValue();
					
					if (!enforcement.equals("All")) {
						sb.append("\tRefersTo Enforcement ");
			    		
		    			for (String s : enforcement.split(", ")) {
		    				sb.append("En" + s + "-"); 
						}
		    			// Delete last '-'
		    			sb.deleteCharAt(sb.length() - 1);
		    			sb.append(",");
		    			sb.append("\n");
					}
				}
	    		
	    		sb.append("\tModality " + modality);
	    		sb.append("\n};");
	    		sb.append("\n\n");
			}
    		else
    			break;
		}
    	
    	sb.deleteCharAt(sb.length() - 1);
    	sb.append("};");
		
		IFile file = srcGenFolder.getFile(fileName + ".Statements.mydsl");
		InputStream source = new ByteArrayInputStream(sb.toString().getBytes());
		
		if (!file.exists()) {
			file.create(source, IResource.FORCE, null);
		} else {
			file.setContents(source, IResource.FORCE, null);
		}
	}
	
	private void generatePrivateDataFile(IFolder srcGenFolder, String filePath, String fileName)
			throws Exception {
		StringBuilder sb = new StringBuilder();
		InputStream inp = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(inp);
		sb.append("Package " + fileName + ".Privatedata.RSLingo4Privacy {");
		sb.append("\n");
		sb.append("\n");
		
		// Get the Statements Sheet
	    Sheet sheet = wb.getSheetAt(4);
    	Iterator<Row> rowIt = sheet.rowIterator();
    	// Ignore the Header row
    	rowIt.next();
    	
    	while (rowIt.hasNext()) {
    		Row row = rowIt.next();
    		Cell cellId = row.getCell(0);
    		
    		if (cellId != null) {
    			int id = (int) cellId.getNumericCellValue();
    			Cell cellType = row.getCell(1);
	    		String type = cellType.getStringCellValue().replaceAll(" ", "");
    			Cell cellDescription = row.getCell(2);
	    		String description = cellDescription.getStringCellValue();
	    		Cell cellAttributes = row.getCell(3);
	    		String attributes = cellAttributes.getStringCellValue();
	    		sb.append("PrivateData PD" + id + " {");
	    		sb.append("\n");
	    		sb.append("\tDescription \"" + description + "\",");
	    		sb.append("\n");
	    		sb.append("\tType " + type + ",");
	    		sb.append("\n");
	    		
	    		for (String a : attributes.split(",\n")) {
	    			a = a.substring(0, 1).toUpperCase() + a.substring(1);
	    			sb.append("\tAttribute \"" + a + "\" Description \"" + a + "\",");
	    			sb.append("\n");
				}
	    		// Delete last ',\n'
	    		sb.deleteCharAt(sb.length() - 2);
	    		sb.deleteCharAt(sb.length() - 1);
	    		sb.append("\n};");
	    		sb.append("\n\n");
			}
    		else
    			break;
		}
    	
    	sb.deleteCharAt(sb.length() - 1);
    	sb.append("};");
		
		IFile file = srcGenFolder.getFile(fileName + ".Privatedata.mydsl");
		InputStream source = new ByteArrayInputStream(sb.toString().getBytes());
		
		if (!file.exists()) {
			file.create(source, IResource.FORCE, null);
		} else {
			file.setContents(source, IResource.FORCE, null);
		}
	}
	
	private void generateServicesFile(IFolder srcGenFolder, String filePath, String fileName)
			throws Exception {
		StringBuilder sb = new StringBuilder();
		InputStream inp = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(inp);
		sb.append("Package " + fileName + ".Services.RSLingo4Privacy {");
		sb.append("\n");
		sb.append("\n");
		sb.append("import " + fileName + ".Privatedata.RSLingo4Privacy.*");
		sb.append("\n");
		sb.append("\n");
		
		// Get the Statements Sheet
	    Sheet sheet = wb.getSheetAt(3);
    	Iterator<Row> rowIt = sheet.rowIterator();
    	// Ignore the Header row
    	rowIt.next();
    	
    	while (rowIt.hasNext()) {
    		Row row = rowIt.next();
    		Cell cellId = row.getCell(0);
    		
    		if (cellId != null) {
    			int id = (int) cellId.getNumericCellValue();
    			Cell cellName = row.getCell(1);
	    		String name = cellName.getStringCellValue();
	    		Cell cellDescription = row.getCell(2);
	    		String description = cellDescription.getStringCellValue();
	    		Cell cellPrivateData = row.getCell(4);
	    		Cell cellPartOf = row.getCell(5);
	    		sb.append("Service S" + id + " {");
	    		sb.append("\n");
	    		sb.append("\tName \"" + name + "\",");
	    		sb.append("\n");
	    		sb.append("\tDescription \"" + description + "\",");
	    		sb.append("\n");
	    		
	    		if (cellPrivateData.getCellType() == Cell.CELL_TYPE_NUMERIC) {
	    			int privateData = (int) cellPrivateData.getNumericCellValue();
	    			sb.append("\tRefersTo PrivateData PD" + privateData + ",");
	    			sb.append("\n");
				} else if (cellPrivateData.getCellType() == Cell.CELL_TYPE_STRING) {
					String privateData = cellPrivateData.getStringCellValue();
					
					if (!privateData.equals("All")) {
						sb.append("\tRefersTo PrivateData ");
			    		
		    			for (String s : privateData.split(", ")) {
		    				sb.append("PD" + s + "-");
						}
		    			// Delete last '-'
		    			sb.deleteCharAt(sb.length() - 1);
		    			sb.append(",");
		    			sb.append("\n");
					}
				}
	    		
	    		if (cellPartOf.getCellType() == Cell.CELL_TYPE_NUMERIC) {
	    			int partOf = (int) cellPartOf.getNumericCellValue();
	    			sb.append("\tService_Part S" + partOf);
	    			sb.append("\n");
				}
	    		
	    		sb.append("};");
	    		sb.append("\n\n");
			}
    		else
    			break;
		}
    	
    	sb.deleteCharAt(sb.length() - 1);
    	sb.append("};");
		
		IFile file = srcGenFolder.getFile(fileName + ".Services.mydsl");
		InputStream source = new ByteArrayInputStream(sb.toString().getBytes());
		
		if (!file.exists()) {
			file.create(source, IResource.FORCE, null);
		} else {
			file.setContents(source, IResource.FORCE, null);
		}
	}
	
	private void generateEnforcementsFile(IFolder srcGenFolder, String filePath, String fileName)
			throws Exception {
		StringBuilder sb = new StringBuilder();
		InputStream inp = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(inp);
		sb.append("Package " + fileName + ".Enforcements.RSLingo4Privacy {");
		sb.append("\n");
		sb.append("\n");
		
		// Get the Statements Sheet
	    Sheet sheet = wb.getSheetAt(5);
    	Iterator<Row> rowIt = sheet.rowIterator();
    	// Ignore the Header row
    	rowIt.next();
    	
    	while (rowIt.hasNext()) {
    		Row row = rowIt.next();
    		Cell cellId = row.getCell(0);
    		
    		if (cellId != null) {
    			int id = (int) cellId.getNumericCellValue();
    			Cell cellName = row.getCell(1);
	    		String name = cellName.getStringCellValue();
    			Cell cellDescription = row.getCell(2);
	    		String description = cellDescription.getStringCellValue();
	    		Cell cellType = row.getCell(3);
	    		String type = cellType.getStringCellValue();
	    		sb.append("Enforcement En" + id + " {");
	    		sb.append("\n");
	    		sb.append("\tName \"" + name + "\",");
	    		sb.append("\n");
	    		sb.append("\tDescription \"" + description + "\",");
	    		sb.append("\n");
	    		sb.append("\tType " + type);
	    		sb.append("\n};");
	    		sb.append("\n\n");
			}
    		else
    			break;
		}
    	
    	sb.deleteCharAt(sb.length() - 1);
    	sb.append("};");
		
		IFile file = srcGenFolder.getFile(fileName + ".Enforcements.mydsl");
		InputStream source = new ByteArrayInputStream(sb.toString().getBytes());
		
		if (!file.exists()) {
			file.create(source, IResource.FORCE, null);
		} else {
			file.setContents(source, IResource.FORCE, null);
		}
	}
	
	private void generateRecipientsFile(IFolder srcGenFolder, String filePath, String fileName)
			throws Exception {
		StringBuilder sb = new StringBuilder();
		InputStream inp = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(inp);
		sb.append("Package " + fileName + ".Recipients.RSLingo4Privacy {");
		sb.append("\n");
		sb.append("\n");
		
		// Get the Statements Sheet
	    Sheet sheet = wb.getSheetAt(2);
    	Iterator<Row> rowIt = sheet.rowIterator();
    	// Ignore the Header row
    	rowIt.next();
    	
    	while (rowIt.hasNext()) {
    		Row row = rowIt.next();
    		Cell cellId = row.getCell(0);
    		
    		if (cellId != null) {
    			if (cellId.getCellType() == Cell.CELL_TYPE_NUMERIC) {
    				int id = (int) cellId.getNumericCellValue();
        			Cell cellDescription = row.getCell(1);
    	    		String description = cellDescription.getStringCellValue();
    	    		Cell cellScope = row.getCell(2);
    	    		String scope = cellScope.getStringCellValue();
    	    		scope = scope.substring(0, 1).toUpperCase() + scope.substring(1);
    	    		Cell cellType = row.getCell(3);
    	    		String type = cellType.getStringCellValue();
    	    		type = type.substring(0, 1).toUpperCase() + type.substring(1);
    	    		Cell cellPartOf = row.getCell(5);
    	    		sb.append("Recipient R" + id + " {");
    	    		sb.append("\n");
    	    		sb.append("\tName \"" + description + "\",");
    	    		sb.append("\n");
    	    		sb.append("\tDescription \"" + description + "\",");
    	    		sb.append("\n");
    	    		
    	    		if (cellPartOf.getCellType() == Cell.CELL_TYPE_NUMERIC) {
    	    			int partOf = (int) cellPartOf.getNumericCellValue();
    	    			sb.append("\tRecipient_Part R" + partOf + ",");
    	    			sb.append("\n");
					}
    	    		
    	    		sb.append("\tScope " + scope + ",");
    	    		sb.append("\n");
    	    		sb.append("\tType " + type);
    	    		sb.append("\n};");
    	    		sb.append("\n\n");
				}
			}
    		else
    			break;
		}
    	
    	sb.deleteCharAt(sb.length() - 1);
    	sb.append("};");
		
		IFile file = srcGenFolder.getFile(fileName + ".Recipients.mydsl");
		InputStream source = new ByteArrayInputStream(sb.toString().getBytes());
		
		if (!file.exists()) {
			file.create(source, IResource.FORCE, null);
		} else {
			file.setContents(source, IResource.FORCE, null);
		}
	}
}
