package rslingo.rslil4privacy.ui.wizards;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public class NewRSLingoProjectWizard extends Wizard implements INewWizard {
	private NewRSLingoProjectWizardPage page;
	private ISelection selection;
	
	public NewRSLingoProjectWizard() {
		super();
		setWindowTitle("New RSLingo Project");
		setNeedsProgressMonitor(true);
	}

	public void addPages() {
		page = new NewRSLingoProjectWizardPage(selection);
		addPage(page);
	}
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}
	
	@Override
	public boolean performFinish() {
		final String projectName = page.getProjectName();
		final String fileMode = page.getFileMode();
		
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(projectName, fileMode, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
		return true;
	}
	
	private void doFinish(String projectName, String fileMode, IProgressMonitor monitor)
		throws CoreException {
		// Create the Project structure
		monitor.beginTask("Creating the project " + fileMode, 2);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(projectName);
		project.create(monitor);
		project.open(monitor);
		IProjectDescription description = project.getDescription();
		description.setNatureIds(new String[] { "org.eclipse.xtext.ui.shared.xtextNature" });
		project.setDescription(description, monitor);
		monitor.worked(1);
		
		IFolder folder = project.getFolder("src");
		folder.create(true, true, monitor);
		
		monitor.setTaskName("Creating policy files...");
		
		if (fileMode.equals(NewRSLingoProjectWizardPage.SINGLE)) {
			IFile file = folder.getFile("new_policy.rslil");
			
			try {
				InputStream stream = openContentStream();
				file.create(stream, true, monitor);
				stream.close();
			} catch (IOException e) {
			}
		} else {
			IFile file = folder.getFile("new_policy.Master.rslil");
			
			try {
				InputStream stream = openContentStream();
				file.create(stream, true, monitor);
				stream.close();
			} catch (IOException e) {
			}
		}
		monitor.worked(1);

//		monitor.setTaskName("Opening file for editing...");
//		getShell().getDisplay().asyncExec(new Runnable() {
//			public void run() {
//				IWorkbenchPage page =
//					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
//				try {
//					IDE.openEditor(page, file, true);
//				} catch (PartInitException e) {
//				}
//			}
//		});
//		monitor.worked(1);
	}

	private InputStream openContentStream() {
		String contents =
			"This is the initial file contents for *.rslil file that should be word-sorted in the Preview page of the multi-page editor";
		return new ByteArrayInputStream(contents.getBytes());
	}
}
