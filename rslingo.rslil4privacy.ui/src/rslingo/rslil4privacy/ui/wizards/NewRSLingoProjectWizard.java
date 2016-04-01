package rslingo.rslil4privacy.ui.wizards;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import rslingo.rslil4privacy.rSLIL4Privacy.Metadata;
import rslingo.rslil4privacy.rSLIL4Privacy.impl.MetadataImpl;

public class NewRSLingoProjectWizard extends Wizard implements INewWizard {
	private NewRSLingoProjectWizardPage page;
	private MetadataWizardPage metadataPage;
	
	public NewRSLingoProjectWizard() {
		super();
		setWindowTitle("New RSLingo Project");
		setNeedsProgressMonitor(true);
	}

	public void addPages() {
		page = new NewRSLingoProjectWizardPage();
		metadataPage = new MetadataWizardPage();
		addPage(page);
		addPage(metadataPage);
	}
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// Nothing to do
	}
	
	@Override
	public boolean performFinish() {
		final String projectName = page.getProjectName();
		final String fileMode = page.getFileMode();
		final Metadata metadata = new MetadataImpl() {};
		metadata.setName(metadataPage.getPolicyName());
		metadata.setDescription(metadataPage.getDescription());
		metadata.setAuthors(metadataPage.getAuthors());
		metadata.setOrganizations(metadataPage.getOrganizations());
		metadata.setVersion(metadataPage.getVersion());
		final String namespace = metadataPage.getNamespace();
		final String date = metadataPage.getDate();
		
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(projectName, fileMode, namespace, metadata, date, monitor);
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
	
	private void doFinish(String projectName, String fileMode, String namespace,
			Metadata metadata, String date, IProgressMonitor monitor)
			throws CoreException {
		// Create the Project structure
		monitor.beginTask("Creating the project " + fileMode, 2);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(projectName);
		project.create(monitor);
		project.open(monitor);
		IProjectDescription projDescription = project.getDescription();
		projDescription.setNatureIds(new String[] { "org.eclipse.xtext.ui.shared.xtextNature" });
		project.setDescription(projDescription, monitor);
		monitor.worked(1);
		
		IFolder folder = project.getFolder("src");
		folder.create(true, true, monitor);
		
		monitor.setTaskName("Creating policy files...");
		
		if (fileMode.equals(NewRSLingoProjectWizardPage.SINGLE)) {
			generateSingleFile(folder, namespace, metadata, date, monitor);
		} else {
			generateMainFile(folder, namespace, metadata, date, monitor);
			generateStatementsFile(folder, namespace, monitor);
			generatePrivateDataFile(folder, namespace, monitor);
			generateServicesFile(folder, namespace, monitor);
			generateRecipientsFile(folder, namespace, monitor);
			generateEnforcementsFile(folder, namespace, monitor);
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
	
	private void generateSingleFile(IFolder folder, String namespace, Metadata metadata,
			String date, IProgressMonitor monitor) {
		StringBuilder sb = new StringBuilder();
		sb.append("Package " + namespace + " {");
		sb.append("\n");
		sb.append("\n");
		
		generateMetadataRegion(metadata, date, sb);
		generateStatementsRegion(sb);
		generatePrivateDataRegion(sb);
		generateRecipientsRegion(sb);
		generateServicesRegion(sb);
		generateEnforcementsRegion(sb);
    	
    	sb.deleteCharAt(sb.length() - 1);
		sb.append("}");
		
		IFile file = folder.getFile("new_policy.rslil");
		InputStream stream = new ByteArrayInputStream(sb.toString().getBytes());
		
		try {
			if (!file.exists()) {
				file.create(stream, IResource.FORCE, monitor);
			} else {
				file.setContents(stream, IResource.FORCE, monitor);
			}
		} catch (CoreException e) {
		}
	}
	
	private void generateMainFile(IFolder folder, String namespace, Metadata metadata,
			String date, IProgressMonitor monitor) {
		StringBuilder sb = new StringBuilder();
		sb.append("Package " + namespace + ".Main {");
		sb.append("\n");
		sb.append("\n");
		sb.append("import " + namespace + ".Statements.*");
		sb.append("\n");
		sb.append("import " + namespace + ".Privatedata.*");
		sb.append("\n");
		sb.append("import " + namespace + ".Recipients.*");
		sb.append("\n");
		sb.append("import " + namespace + ".Enforcements.*");
		sb.append("\n");
		sb.append("import " + namespace + ".Services.*");
		sb.append("\n");
		sb.append("\n");
		
		generateMetadataRegion(metadata, date, sb);
    	
    	sb.deleteCharAt(sb.length() - 1);
    	sb.append("}");
		
		IFile file = folder.getFile("new_policy.Main.rslil");
		InputStream source = new ByteArrayInputStream(sb.toString().getBytes());
		
		try {
			if (!file.exists()) {
				file.create(source, IResource.FORCE, monitor);
			} else {
				file.setContents(source, IResource.FORCE, monitor);
			}
		} catch (CoreException e) {
		}
	}
		
	private void generateStatementsFile(IFolder folder, String namespace,
			IProgressMonitor monitor) {
		StringBuilder sb = new StringBuilder();
		sb.append("Package " + namespace + ".Statements {");
		sb.append("\n");
		sb.append("\n");
		sb.append("import " + namespace + ".Privatedata.*");
		sb.append("\n");
		sb.append("import " + namespace + ".Services.*");
		sb.append("\n");
		sb.append("import " + namespace + ".Enforcements.*");
		sb.append("\n");
		sb.append("import " + namespace + ".Recipients.*");
		sb.append("\n");
		sb.append("\n");
		
		generateStatementsRegion(sb);
    	
    	sb.deleteCharAt(sb.length() - 1);
    	sb.append("}");
		
		IFile file = folder.getFile("new_policy.Statements.rslil");
		InputStream stream = new ByteArrayInputStream(sb.toString().getBytes());
		
		try {
			if (!file.exists()) {
				file.create(stream, IResource.FORCE, monitor);
			} else {
				file.setContents(stream, IResource.FORCE, monitor);
			}
		} catch (CoreException e) {
		}
	}
		
	private void generatePrivateDataFile(IFolder folder, String namespace,
			IProgressMonitor monitor) {
		StringBuilder sb = new StringBuilder();
		sb.append("Package " + namespace + ".Privatedata {");
		sb.append("\n");
		sb.append("\n");
		
		generatePrivateDataRegion(sb);
    	
    	sb.deleteCharAt(sb.length() - 1);
    	sb.append("}");
		
		IFile file = folder.getFile("new_policy.Privatedata.rslil");
		InputStream stream = new ByteArrayInputStream(sb.toString().getBytes());
		
		try {
			if (!file.exists()) {
				file.create(stream, IResource.FORCE, monitor);
			} else {
				file.setContents(stream, IResource.FORCE, monitor);
			}
		} catch (CoreException e) {
		}
	}
		
	private void generateServicesFile(IFolder folder, String namespace,
			IProgressMonitor monitor) {
		StringBuilder sb = new StringBuilder();
		sb.append("Package " + namespace + ".Services {");
		sb.append("\n");
		sb.append("\n");
		sb.append("import " + namespace + ".Privatedata.*");
		sb.append("\n");
		sb.append("\n");
		
		generateServicesRegion(sb);
    	
    	sb.deleteCharAt(sb.length() - 1);
    	sb.append("}");
		
		IFile file = folder.getFile("new_policy.Services.rslil");
		InputStream stream = new ByteArrayInputStream(sb.toString().getBytes());
		
		try {
			if (!file.exists()) {
				file.create(stream, IResource.FORCE, monitor);
			} else {
				file.setContents(stream, IResource.FORCE, monitor);
			}
		} catch (CoreException e) {
		}
	}
	
	private void generateEnforcementsFile(IFolder folder, String namespace,
			IProgressMonitor monitor) {
		StringBuilder sb = new StringBuilder();
		sb.append("Package " + namespace + ".Enforcements {");
		sb.append("\n");
		sb.append("\n");
		
		generateEnforcementsRegion(sb);
    	
    	sb.deleteCharAt(sb.length() - 1);
    	sb.append("}");
		
		IFile file = folder.getFile("new_policy.Enforcements.rslil");
		InputStream stream = new ByteArrayInputStream(sb.toString().getBytes());
		
		try {
			if (!file.exists()) {
				file.create(stream, IResource.FORCE, monitor);
			} else {
				file.setContents(stream, IResource.FORCE, monitor);
			}
		} catch (CoreException e) {
		}
	}	
	
	private void generateRecipientsFile(IFolder folder, String namespace,
			IProgressMonitor monitor) {
		StringBuilder sb = new StringBuilder();
		sb.append("Package " + namespace + ".Recipients {");
		sb.append("\n");
		sb.append("\n");
		
		generateRecipientsRegion(sb);
    	
    	sb.deleteCharAt(sb.length() - 1);
    	sb.append("}");
		
		IFile file = folder.getFile("new_policy.Recipients.rslil");
		InputStream stream = new ByteArrayInputStream(sb.toString().getBytes());
		
		try {
			if (!file.exists()) {
				file.create(stream, IResource.FORCE, monitor);
			} else {
				file.setContents(stream, IResource.FORCE, monitor);
			}
		} catch (CoreException e) {
		}
	}
		
	
	private void generateMetadataRegion(Metadata metadata, String date, StringBuilder sb) {
		sb.append("PolicyMetadata {");
		sb.append("\n");
		sb.append("\tPolicyName \"" + metadata.getName() + "\"");
		sb.append("\n");
		sb.append("\tDescription \"" + metadata.getDescription() + "\"");
		sb.append("\n");
		sb.append("\tAuthor(s) \"" + metadata.getAuthors() + "\"");
		sb.append("\n");
		sb.append("\tOrganization(s) \"" + metadata.getOrganizations() + "\"");
		sb.append("\n");
		sb.append("\tDate " + date);
		sb.append("\n");
		sb.append("\tVersion \"" + metadata.getVersion() + "\"");
		sb.append("\n}");
		sb.append("\n\n");
	}
	
	private void generateStatementsRegion(StringBuilder sb) {
		sb.append("Collection St1 {");
		sb.append("\n");
		sb.append("\tDescription \"St1 description\"");
		sb.append("\n");
		sb.append("\tCondition \" St1 condition\"");
		sb.append("\n");
		sb.append("\tModality Permitted");
		sb.append("\n}");
		sb.append("\n\n");
	}
	
	private void generatePrivateDataRegion(StringBuilder sb) {
		sb.append("PrivateData PD1 {");
		sb.append("\n");
		sb.append("\tDescription \"PD1 description\"");
		sb.append("\n");
		sb.append("\tType PersonalInformation");
		sb.append("\n");
		sb.append("\tAttribute \"A1\" {");
		sb.append("\n");
		sb.append("\t\tDescription \"A1 description\"");
		sb.append("\n\t}");
		sb.append("\n}");
		sb.append("\n\n");
	}
	
	private void generateRecipientsRegion(StringBuilder sb) {
		sb.append("Recipient R1 {");
		sb.append("\n");
		sb.append("\tName \"Recipient R1\"");
		sb.append("\n");
		sb.append("\tDescription \"R1 description\"");
		sb.append("\n");		
		sb.append("\tScope Internal");
		sb.append("\n");
		sb.append("\tType Individual");
		sb.append("\n}");
		sb.append("\n\n");
	}
	
	private void generateServicesRegion(StringBuilder sb) {
		sb.append("Service S1 {");
		sb.append("\n");
		sb.append("\tName \"Service 1\"");
		sb.append("\n");
		sb.append("\tDescription \"S1 description\"");
		sb.append("\n}");
		sb.append("\n\n");
	}
	
	private void generateEnforcementsRegion(StringBuilder sb) {
		sb.append("Enforcement En1 {");
		sb.append("\n");
		sb.append("\tName \"Enforcement 1\"");
		sb.append("\n");
		sb.append("\tDescription \"En1 description\"");
		sb.append("\n");
		sb.append("\tType Action");
		sb.append("\n}");
		sb.append("\n\n");
	}
}
