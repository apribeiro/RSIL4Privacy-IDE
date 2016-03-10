package rslingo.rslil4privacy.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import rslingo.rslil4privacy.ui.windows.ConfigurationWindow;

public class ConfigurationHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow workbenchWindow = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		ConfigurationWindow window = new ConfigurationWindow(workbenchWindow.getShell());
		window.open();
		return null;
	}

}
