package org.xtext.example.mydsl.ui.handlers;

import java.util.ArrayList;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.xtext.example.mydsl.MyDslStandaloneSetup;
import org.xtext.example.mydsl.myDsl.impl.PolicyImpl;

import com.google.inject.Injector;

public class WordHandler extends AbstractHandler {

	private static final String FILE_FOLDER = "src";
	private static final String GEN_FOLDER = "src-gen";
	private static final String FILE_EXT = ".mydsl";
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkspaceRoot workspace = ResourcesPlugin.getWorkspace().getRoot();
        IProject project = workspace.getProjects()[0];
        IFolder fileFolder = project.getFolder(FILE_FOLDER);
        ArrayList<String> files = new ArrayList<String>();
        
        try {
			for (IResource resource : fileFolder.members()) {
				if (resource instanceof IFile && resource.getName().endsWith(FILE_EXT)) {
					files.add(resource.getName());
				}
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
        
        if (files.size() > 0) {
        	IFile file = project.getFile("/" + FILE_FOLDER + "/" + files.get(0));
            IFolder srcGenFolder = project.getFolder(GEN_FOLDER);
                    
            if (!srcGenFolder.exists()) {
                try {
                    srcGenFolder.create(true, true,
                            new NullProgressMonitor());
                } catch (CoreException e) {
                    return null;
                }
            }
            
            // Start a new Thread to avoid blocking the UI
            Runnable runnable = new Runnable() {
				@Override
				public void run() {
					new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		            Injector injector = new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
		            XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		            resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		            Resource resource = resourceSet.getResource(
		                URI.createURI("platform:/resource/" + file.getFullPath().toString()), true);
		            	//URI.createURI("platform:/resource/org.xtext.example.mydsl/src/example.mydsl"), true);
		            PolicyImpl policy = (PolicyImpl) resource.getContents().get(0);
		            
		            System.out.println(policy.getName());
		            System.out.println(policy.getDay() + "-" + policy.getMonth() + "-" + policy.getYear());					
				}
			};
			new Thread(runnable).start();
		}
		
		return null;
	}

}
