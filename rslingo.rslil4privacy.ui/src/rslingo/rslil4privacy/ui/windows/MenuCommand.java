package rslingo.rslil4privacy.ui.windows;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;

public interface MenuCommand {

	/**
	 * Executes the associated command using the project
	 * and/or file passed as arguments.
	 * 
	 * @param project the source project
	 * @param file the source file used for the generation
	 * @throws Exception 
	 */
	public void execute(IProject project, IFile file) throws Exception;
	
}
