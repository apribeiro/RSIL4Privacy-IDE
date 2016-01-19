package org.xtext.example.mydsl.ui.handlers;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.examples.IterateCells;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

public class ImportExcelHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		FileDialog dialog = new FileDialog(window.getShell(), SWT.OPEN);
		dialog.setFilterExtensions(new String[] { "*.xlsx", "*.xls" });
		dialog.setText("Select the Excel file to upload");
		String filePath = dialog.open();
		
		if (filePath != null) {
			try {
				StringBuilder sb = new StringBuilder();
				InputStream inp = new FileInputStream(filePath);
				Workbook wb = WorkbookFactory.create(inp);
				sb.append("Package " + dialog.getFileName() + ".Statements.RSLingo4Privacy {");
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
		    			double id = cellId.getNumericCellValue();
			    		Cell cellDescription = row.getCell(1);
			    		String description = cellDescription.getStringCellValue();
			    		System.out.println("Id: " + id + " Description: " + description);
					}
		    		else
		    			break;
				}
		    	
				System.out.println(sb);
//			    FileOutputStream fileOut = new FileOutputStream("C://Users/User/Desktop/Cenas-Result.xlsx");
//			    wb.write(fileOut);
//			    fileOut.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return null;
	}
}
