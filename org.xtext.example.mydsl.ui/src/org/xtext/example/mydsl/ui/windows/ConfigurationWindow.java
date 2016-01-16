package org.xtext.example.mydsl.ui.windows;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class ConfigurationWindow {

	private Shell shell;
	private Shell parent;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

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
		shell = new Shell(parent, SWT.CLOSE | SWT.TITLE | SWT.MAX 
				| SWT.RESIZE | SWT.APPLICATION_MODAL);
		shell.setSize(450, 300);
		shell.setText("RSLIL4Privacy");
		
		Group grpTemplates = new Group(shell, SWT.NONE);
		grpTemplates.setText("Templates");
		grpTemplates.setBounds(10, 10, 414, 82);
		
		// Force labels background colors to be transparent
		formToolkit.setBackground(null);
		
		Label lblWord = formToolkit.createLabel(grpTemplates, "Word:", SWT.NONE);
		lblWord.setBounds(10, 23, 37, 15);
		
		Label lblExcel = formToolkit.createLabel(grpTemplates, "Excel:", SWT.ALPHA);
		lblExcel.setBounds(10, 54, 37, 15);
		
		Text txtWord = formToolkit.createText(grpTemplates, "RSLIL-WordTemplate.docx", SWT.NONE);
		txtWord.setBounds(53, 20, 262, 21);
		
		Text txtExcel = formToolkit.createText(grpTemplates, "RSLIL-ExcelTemplate-v1.1.xlsx", SWT.NONE);
		txtExcel.setBounds(53, 51, 262, 21);
		
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
				dialog.open();
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
				dialog.open();
			}
		});
		
		Group grpQualityEngine = new Group(shell, SWT.NONE);
		grpQualityEngine.setText("Requirement Quality Engine");
		grpQualityEngine.setBounds(10, 98, 414, 82);
		
		Button btnOk = new Button(shell, SWT.NONE);
		btnOk.setBounds(268, 227, 75, 25);
		btnOk.setText("OK");
		btnOk.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
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
