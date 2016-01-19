package org.xtext.example.mydsl.ui.handlers;

import java.io.ByteArrayInputStream;
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
				
				StringBuilder sb = new StringBuilder();
				InputStream inp = new FileInputStream(filePath);
				Workbook wb = WorkbookFactory.create(inp);
				sb.append("Package " + dialog.getFileName() + ".Statements.RSLingo4Privacy {");
				sb.append("\n");
				sb.append("\n");
				sb.append("import " + dialog.getFileName() + ".Privatedata.RSLingo4Privacy.*");
				sb.append("\n");
				sb.append("import " + dialog.getFileName() + ".Services.RSLingo4Privacy.*");
				sb.append("\n");
				sb.append("import " + dialog.getFileName() + ".Enforcements.RSLingo4Privacy.*");
				sb.append("\n");
				sb.append("import " + dialog.getFileName() + ".Recipients.RSLingo4Privacy.*");
				sb.append("\n");
				sb.append("\n");
				
				// Get the Statements Sheet
			    Sheet sheet = wb.getSheetAt(0);
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
			    		sb.append(type + " st" + id + " {");
			    		sb.append("\n");
			    		sb.append("\tDescription \"" + description + "\",");
			    		sb.append("\n");
			    		sb.append("\tCondition \"" + condition + "\",");
			    		sb.append("\n");
			    		sb.append("\tModality " + modality);
			    		sb.append("\n};");
			    		sb.append("\n\n");
					}
		    		else
		    			break;
				}
		    	
		    	sb.deleteCharAt(sb.length() - 1);
		    	sb.append("};");
		    	
//				System.out.println(sb);
				
				IFile fileSt = srcGenFolder.getFile(dialog.getFileName() + "Statements.mydsl");
				InputStream source = new ByteArrayInputStream(sb.toString().getBytes());
				
				if (!fileSt.exists()) {
					fileSt.create(source, IResource.FORCE, null);
				} else {
					fileSt.setContents(source, IResource.FORCE, null);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return null;
	}
}
