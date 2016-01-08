package org.xtext.example.mydsl.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class EddyHandler extends AbstractHandler implements IHandler {

	@Inject
    private IGenerator generator;
 
    @Inject
    private Provider<EclipseResourceFileSystemAccess2> fileAccessProvider;
     
    @Inject
    IResourceDescriptions resourceDescriptions;
     
    @Inject
    IResourceSetProvider resourceSetProvider;
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
        IWorkspaceRoot workspace = ResourcesPlugin.getWorkspace().getRoot();
        IProject project = workspace.getProjects()[0];
        IFile file = project.getFile("/src/test.mydsl");
        IFolder srcGenFolder = project.getFolder("src-gens");
                
        if (!srcGenFolder.exists()) {
            try {
                srcGenFolder.create(true, true,
                        new NullProgressMonitor());
            } catch (CoreException e) {
                return null;
            }
        }
 
        final EclipseResourceFileSystemAccess2 fsa = fileAccessProvider.get();
        fsa.setOutputPath(srcGenFolder.getFullPath().toString());
        fsa.setMonitor(new NullProgressMonitor());
        fsa.setProject(project);
         
        URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
        ResourceSet rs = resourceSetProvider.get(project);
        Resource r = rs.getResource(uri, true);
        generator.doGenerate(r, fsa);
            
        return null;
	}

}
