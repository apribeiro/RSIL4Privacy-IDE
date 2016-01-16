package org.xtext.example.mydsl.ui.windows;

import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.forms.widgets.FormToolkit;

public class MenuCommandWindow {
	
	private static final String FILE_FOLDER = "src";
	
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	
	private Shell shell;
	private Shell parent;
	private Table table_1;
	private MenuCommand menuCommand;
	private String fileExtension;
	
	public MenuCommandWindow(Shell parent, MenuCommand menuCommand, String fileExtension) {
		this.parent = parent;
		this.menuCommand = menuCommand;
		this.fileExtension = fileExtension;
	}

	/**
 	 * Launch the application.
 	 * @param args
 	 */
 	public static void main(String[] args) {
 		try {
 			MenuCommandWindow window = new MenuCommandWindow(null, null, null);
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
		
		Button btnRadioButtonAll = new Button(shell, SWT.RADIO);
		btnRadioButtonAll.setBounds(10, 10, 100, 16);
		btnRadioButtonAll.setText("Use all projects");
		btnRadioButtonAll.setSelection(true);
		btnRadioButtonAll.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				table_1.setEnabled(false);
			}
		});
		
		Button btnRadioButtonSelected = new Button(shell, SWT.RADIO);
		btnRadioButtonSelected.setBounds(240, 10, 166, 16);
		btnRadioButtonSelected.setText("Use projects selected below");
		btnRadioButtonSelected.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				table_1.setEnabled(true);
			}
		});
		
		CheckboxTableViewer checkboxTableViewer = CheckboxTableViewer.newCheckList(shell, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION);
		table_1 = checkboxTableViewer.getTable();
		table_1.setBounds(10, 32, 414, 189);
		table_1.setEnabled(false);
		formToolkit.paintBordersFor(table_1);
		
		IWorkspaceRoot workspace = ResourcesPlugin.getWorkspace().getRoot();
		
		for (IProject project : workspace.getProjects()) {
			TableItem item = new TableItem(table_1, SWT.NONE);
			item.setText(project.getName());
		}
		
		Button btnOk = new Button(shell, SWT.NONE);
		btnOk.setBounds(268, 227, 75, 25);
		btnOk.setText("OK");
		btnOk.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (btnRadioButtonAll.getSelection()) {
					ArrayList<IProject> projects = new ArrayList<IProject>(
							Arrays.asList(workspace.getProjects())); 
					findFilesByExtension(projects);
					menuCommand.execute(projects.size() + " project(s)");
				} else if (btnRadioButtonSelected.getSelection()) {
					ArrayList<IProject> projects = new ArrayList<IProject>();
					
					for (TableItem item : table_1.getItems()) {
						if (item.getChecked()) {
							projects.add(workspace.getProject(item.getText()));
							findFilesByExtension(projects);
							menuCommand.execute(item.getText());
						}
					}
					
					System.out.println(projects.size() + " selected!");
				}
				shell.close();
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
	
	private ArrayList<String> findFilesByExtension(ArrayList<IProject> projects) {
		ArrayList<String> files = new ArrayList<String>();

		for (IProject project : projects) {
			IFolder fileFolder = project.getFolder(FILE_FOLDER);

			try {
				for (IResource resource : fileFolder.members()) {
					if (resource instanceof IFile && resource.getName().endsWith(fileExtension)) {
						files.add(resource.getName());
					}
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		
		return files;
	}
}
