package org.xtext.example.mydsl.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.xtext.example.mydsl.ui.windows.ConfigurationWindow;

public class ConfigurationHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ConfigurationWindow window = new ConfigurationWindow();
		window.open();
		return null;
	}

}
