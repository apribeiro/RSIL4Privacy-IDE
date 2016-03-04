package org.xtext.example.mydsl.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.xtext.example.mydsl.generator.MyDslGenerator;
import org.xtext.example.mydsl.ui.windows.MenuCommand;
import org.xtext.example.mydsl.ui.windows.MenuCommandWindow;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class JSONHandler extends AbstractHandler {

	private static final String GEN_FOLDER = "src-gen";
	private static final String FILE_EXT = ".mydsl";
	
	@Inject
    private MyDslGenerator generator;
 
    @Inject
    private Provider<EclipseResourceFileSystemAccess2> fileAccessProvider;
     
    @Inject
    IResourceDescriptions resourceDescriptions;
     
    @Inject
    IResourceSetProvider resourceSetProvider;
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getActiveMenuSelection(event);
		
		// Check if the command was triggered using the ContextMenu
		if (selection != null) {
			if (selection instanceof IStructuredSelection) {
				IStructuredSelection structuredSelection = (IStructuredSelection) selection;
				IFile file = (IFile) structuredSelection.getFirstElement();
				IProject project = file.getProject();
				generateJsonFile(project, file);
			} else {
				IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
				IFile file = (IFile) activeEditor.getEditorInput().getAdapter(IFile.class);
				IProject project = file.getProject();
				generateJsonFile(project, file);
			}
		} else {
			IWorkbenchWindow workbenchWindow = HandlerUtil.getActiveWorkbenchWindowChecked(event);
			MenuCommand cmd = new MenuCommand() {
				@Override
				public void execute(IProject project, IFile file) {
					generateJsonFile(project, file);
				}
			};
			MenuCommandWindow window = new MenuCommandWindow(workbenchWindow.getShell(),
					cmd, false, FILE_EXT);
			window.open();
		}
		
		return null;
	}

	private void generateJsonFile(IProject project, IFile file) {
		IFolder srcGenFolder = project.getFolder(GEN_FOLDER);
        
        if (!srcGenFolder.exists()) {
            try {
				srcGenFolder.create(true, true, new NullProgressMonitor());
			} catch (CoreException e) {
				e.printStackTrace();
			}
        }
 
        final EclipseResourceFileSystemAccess2 fsa = fileAccessProvider.get();
        fsa.setOutputPath(srcGenFolder.getName());
        fsa.setMonitor(new NullProgressMonitor());
        fsa.setProject(project);
         
        URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
        ResourceSet rs = resourceSetProvider.get(project);
        Resource r = rs.getResource(uri, true);
        generator.setGenMode(MyDslGenerator.JSON_MODE);
        generator.doGenerate(r, fsa);
	}
}
