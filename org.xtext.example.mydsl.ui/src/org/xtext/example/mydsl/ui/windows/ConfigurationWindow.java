package org.xtext.example.mydsl.ui.windows;

import java.io.File;

import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;

public class ConfigurationWindow {

	private static final String DEF_WORD_PATH = "RSLIL-WordTemplate.docx";
	private static final String DEF_EXCEL_PATH = "RSLIL-ExcelTemplate-v1.1.xlsx";
	
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	
	private Shell shell;
	private Shell parent;

	public ConfigurationWindow(Shell parent) {
		this.parent = parent;
	}

	/**
 	 * Launch the application.
 	 * @param args
 	 */
 	public static void main(String[] args) {
 		try {
 			ConfigurationWindow window = new ConfigurationWindow(null);
 			window.open();
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
 	}
	
	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		String pluginsPath = Platform.getInstallLocation().getURL().getPath().substring(1)
				+ "plugins/RSLingo4Privacy"; 
		File f = new File(pluginsPath);
		
		if (!f.exists()) {
			f.mkdir();
		}
		
		shell = new Shell(parent, SWT.CLOSE | SWT.TITLE | SWT.MAX 
				| SWT.RESIZE | SWT.APPLICATION_MODAL);
		shell.setSize(450, 300);
		shell.setText("RSLingo4Privacy Studio");
		
		Group grpTemplates = new Group(shell, SWT.NONE);
		grpTemplates.setText("Templates");
		grpTemplates.setBounds(10, 10, 414, 82);
		
		// Force labels background colors to be transparent
		formToolkit.setBackground(null);
		
		Label lblWord = formToolkit.createLabel(grpTemplates, "Word:", SWT.NONE);
		lblWord.setBounds(10, 23, 37, 15);
		
		Label lblExcel = formToolkit.createLabel(grpTemplates, "Excel:", SWT.ALPHA);
		lblExcel.setBounds(10, 54, 37, 15);
		
		Text txtWord = formToolkit.createText(grpTemplates, DEF_WORD_PATH, SWT.NONE);
		txtWord.setBounds(53, 20, 262, 21);
		txtWord.setEnabled(false);
		
		Text txtExcel = formToolkit.createText(grpTemplates, DEF_EXCEL_PATH, SWT.NONE);
		txtExcel.setBounds(53, 51, 262, 21);
		txtExcel.setEnabled(false);
		
		Button btnBrowseWord = new Button(grpTemplates, SWT.NONE);
		btnBrowseWord.setBounds(321, 18, 75, 25);
		formToolkit.adapt(btnBrowseWord, true, true);
		btnBrowseWord.setText("Browse...");
		btnBrowseWord.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog dialog = new FileDialog(shell, SWT.OPEN);
				dialog.setFilterExtensions(new String[] { "*.docx", "*.doc" });
				dialog.setText("Select the Word file to upload");
				String path = dialog.open();
				
				if (path != null) {
					txtWord.setText(path);
				}
			}
		});
		
		Button btnBrowseExcel = new Button(grpTemplates, SWT.NONE);
		btnBrowseExcel.setBounds(321, 49, 75, 25);
		formToolkit.adapt(btnBrowseExcel, true, true);
		btnBrowseExcel.setText("Browse...");
		btnBrowseExcel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog dialog = new FileDialog(shell, SWT.OPEN);
				dialog.setFilterExtensions(new String[] { "*.xlsx", "*.xls" });
				dialog.setText("Select the Excel file to upload");
				String path = dialog.open();
				
				if (path != null) {
					txtWord.setText(path);
				}
			}
		});
		
		Group grpQualityEngine = new Group(shell, SWT.NONE);
		grpQualityEngine.setText("Eddy Reasoner");
		grpQualityEngine.setBounds(10, 98, 414, 82);
		
		Button btnOk = new Button(shell, SWT.NONE);
		btnOk.setBounds(268, 227, 75, 25);
		btnOk.setText("OK");
		btnOk.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (!txtWord.getText().equals(DEF_WORD_PATH)) {
					
				}
				
				if (!txtExcel.getText().equals(DEF_EXCEL_PATH)) {
					
				}
			}
		});
		
		Button btnCancel = new Button(shell, SWT.NONE);
		btnCancel.setBounds(349, 227, 75, 25);
		btnCancel.setText("Cancel");
		btnCancel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.close();
			}
		});
	}
}
