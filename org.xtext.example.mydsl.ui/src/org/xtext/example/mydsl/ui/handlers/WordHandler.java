package org.xtext.example.mydsl.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.xtext.example.mydsl.MyDslStandaloneSetup;
import org.xtext.example.mydsl.myDsl.impl.PolicyImpl;
import org.xtext.example.mydsl.ui.windows.MenuCommand;
import org.xtext.example.mydsl.ui.windows.MenuCommandWindow;

import com.google.inject.Injector;

public class WordHandler extends AbstractHandler {

	private static final String FILE_EXT = ".mydsl";
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getActiveMenuSelection(event);
		
		// Check if the command was triggered using the ContextMenu
		if (selection != null) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			IFile file = (IFile) structuredSelection.getFirstElement();
			generateWordFile(file);
		} else {
			IWorkbenchWindow workbenchWindow = HandlerUtil.getActiveWorkbenchWindowChecked(event);
			MenuCommand cmd = new MenuCommand() {
				@Override
				public void execute(String file) {
//					generateWordFile(file);
				}
			};
			MenuCommandWindow window = new MenuCommandWindow(workbenchWindow.getShell(), cmd, FILE_EXT);
			window.open();
		}
		
		return null;
	}

	private void generateWordFile(IFile file) {
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
	    		// TODO Generate Word file
			}
		};
		new Thread(runnable).start();
	}
}
