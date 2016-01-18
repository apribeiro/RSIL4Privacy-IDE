package org.xtext.example.mydsl.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

public class UMLHandler extends AbstractHandler {
	
	@SuppressWarnings("unused")
	private static final String GEN_FOLDER = "src-gen";
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getActiveMenuSelection(event);
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		
		// Check if the command was triggered using the ContextMenu
		if (selection != null) {
			MessageDialog.openInformation(
				window.getShell(),
				"RSLingo4Privacy Studio",
				"UML Model generated (ContextMenu)!");
		} else {
			MessageDialog.openInformation(
				window.getShell(),
				"RSLingo4Privacy Studio",
				"UML Model generated (MenuBar)!");
		}
		
		return null;
	}

}
