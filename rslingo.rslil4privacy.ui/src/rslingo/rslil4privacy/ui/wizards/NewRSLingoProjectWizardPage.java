package rslingo.rslil4privacy.ui.wizards;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

public class NewRSLingoProjectWizardPage extends WizardNewProjectCreationPage {
	
	public static final String SINGLE = "Single File";
	public static final String MAIN = "Main File";
	
	private Combo comboMode;

	public NewRSLingoProjectWizardPage(ISelection selection) {
		super("wizardPage");
		setTitle("RSLingo Project");
		setDescription("This wizard creates a new RSLingo project.");
	}
	
	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		Composite container = (Composite) getControl();
		Composite projectGroup = new Composite(container, SWT.NONE);
        GridLayout layout = new GridLayout();
        layout.numColumns = 2;
        projectGroup.setLayout(layout);
        projectGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        
		Label labelFile = new Label(projectGroup, SWT.NONE);
		labelFile.setText("&File structure mode:");
		
		comboMode = new Combo(projectGroup, SWT.BORDER | SWT.SINGLE | SWT.READ_ONLY);
		comboMode.setLayoutData(new GridData(SWT.NONE));
		comboMode.setItems(new String[] { SINGLE, MAIN });
		comboMode.select(0);
	}
	
	public String getFileMode() {
		return comboMode.getText();
	}
}