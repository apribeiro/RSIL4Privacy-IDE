package rslingo.rslil4privacy.ui.windows;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.dialogs.MessageDialog;
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
	
	private static final String SRC_FOLDER = "src";
	private static final String GEN_FOLDER = "src-gen";
	
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	
	private Shell shell;
	private Shell parent;
	private Table table_1;
	private MenuCommand menuCommand;
	private boolean importMode;
	private String fileExtension;
	
	public MenuCommandWindow(Shell parent, MenuCommand menuCommand,
			boolean importMode, String fileExtension) {
		this.parent = parent;
		this.menuCommand = menuCommand;
		this.importMode = importMode;
		this.fileExtension = fileExtension;
	}

	/**
 	 * Launch the application.
 	 * @param args
 	 */
 	public static void main(String[] args) {
 		try {
 			MenuCommandWindow window = new MenuCommandWindow(null, null, false, null);
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
		shell.setText("RSLingo4Privacy Studio");
		
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
		ArrayList<IProject> projects = new ArrayList<IProject>();
		
		for (IProject p : workspace.getProjects()) {
			if (p.isOpen()) {
				projects.add(p);
			}
		}
		Collections.sort(projects, new ProjectComparator());
		
		for (IProject project : projects) {
			TableItem item = new TableItem(table_1, SWT.NONE);
			item.setText(project.getName());
		}
		
		Button btnOk = new Button(shell, SWT.NONE);
		btnOk.setBounds(268, 227, 75, 25);
		btnOk.setText("OK");
		btnOk.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					if (btnRadioButtonAll.getSelection()) {				
						if (importMode) {
							for (IProject project : projects) {
								menuCommand.execute(project, null);
							}
						} else {
							for (IProject project : projects) {
								ArrayList<IFile> files = findFilesByExtension(project);
									
								for (IFile file : files) {
									menuCommand.execute(project, file);
								}
							}
						}
					} else if (btnRadioButtonSelected.getSelection()) {				
						for (TableItem item : table_1.getItems()) {
							if (item.getChecked()) {
								IProject project = workspace.getProject(item.getText());
									
								if (importMode) {
									menuCommand.execute(project, null);
								} else {
									ArrayList<IFile> files = findFilesByExtension(project);
									
									for (IFile file : files) {
										menuCommand.execute(project, file);
									}
								}
							}
						}
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				    MessageDialog errorDialog = new MessageDialog(parent, "RSLingo4Privacy Studio",
				    		null, e2.getMessage(), MessageDialog.ERROR, new String[] { "OK" }, 0);
				    errorDialog.open();
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
	
	private ArrayList<IFile> findFilesByExtension(IProject project) {
		ArrayList<IFile> files = new ArrayList<IFile>();
		ArrayList<IFolder> folders = new ArrayList<IFolder>();
		folders.add(project.getFolder(SRC_FOLDER));
		IFolder srcGenFolder = project.getFolder(GEN_FOLDER);
		
		if (srcGenFolder.exists()) {
			folders.add(srcGenFolder);
		}

		try {
			for (IFolder folder : folders) {
				for (IResource resource : folder.members()) {
					if (resource instanceof IFile && resource.getName().endsWith(fileExtension)) {
						files.add((IFile) resource);
					}
				}
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return files;
	}
	
	class ProjectComparator implements Comparator<IProject> {
		@Override
		public int compare(IProject p1, IProject p2) {
			return p1.getName().compareTo(p2.getName());
		}
	}
}
