package rslingo.rslil4privacy.ui.wizards;

import java.util.Calendar;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import rslingo.rslil4privacy.ui.handlers.DocumentHelper;

public class MetadataWizardPage extends WizardPage {

	Text namespaceText;
	Text policyNameText;
	Text descriptionText;
	Text authorsText;
	Text organizationsText;
	DateTime dateTime;
	Text versionText;
	
	public MetadataWizardPage() {
		super("MetadataWizardPage");
		setTitle("RSL-IL4Privacy Policy Metadata");
		setDescription("Define the RSL-IL4Privacy policy metadata.");
	}

	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;
		layout.verticalSpacing = 9;
		Label label = new Label(container, SWT.NULL);
		label.setText("&Namespace:");

		namespaceText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		namespaceText.setLayoutData(gd);
		namespaceText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		label = new Label(container, SWT.NULL);
		label.setText("&Policy name:");

		policyNameText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		policyNameText.setLayoutData(gd);
		policyNameText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});

		label = new Label(container, SWT.NULL);
		label.setText("&Description:");

		descriptionText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		descriptionText.setLayoutData(gd);
		descriptionText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		label = new Label(container, SWT.NULL);
		label.setText("&Author(s):");

		authorsText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		authorsText.setLayoutData(gd);
		authorsText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		label = new Label(container, SWT.NULL);
		label.setText("&Organization(s):");

		organizationsText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		organizationsText.setLayoutData(gd);
		organizationsText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		label = new Label(container, SWT.NULL);
		label.setText("Dat&e:");

		dateTime = new DateTime(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(SWT.NONE);
		dateTime.setLayoutData(gd);
		Calendar cal = Calendar.getInstance();
		dateTime.setDate(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH),
				cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		label = new Label(container, SWT.NULL);
		label.setText("&Version:");

		versionText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		versionText.setLayoutData(gd);
		versionText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		dialogChanged();
		setControl(container);
	}

	private void dialogChanged() {
		String regex = "^[a-zA-Z_\\$][\\w\\$]*(?:\\.[a-zA-Z_\\$][\\w\\$]*)*$";
		String namespace = getNamespace();
		
		if (namespace.length() == 0) {
			updateStatus("Package namespace must be specified");
			return;
		}
		
		if (!namespace.matches(regex)) {
			updateStatus("Invalid package namespace");
			return;
		}
		
		if (getPolicyName().length() == 0) {
			updateStatus("Policy name must be specified");
			return;
		}
		
		if (getDescription().length() == 0) {
			updateStatus("Description must be specified");
			return;
		}
		
		if (getAuthors().length() == 0) {
			updateStatus("Author(s) must be specified");
			return;
		}
		
		if (getOrganizations().length() == 0) {
			updateStatus("Organization(s) must be specified");
			return;
		}
		
		updateStatus(null);
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	public String getNamespace() {
		return namespaceText.getText();
	}
	
	public String getPolicyName() {
		return policyNameText.getText();
	}

	public String getDescription() {
		return descriptionText.getText();
	}
	
	public String getAuthors() {
		return authorsText.getText();
	}
	
	public String getOrganizations() {
		return organizationsText.getText();
	}
	
	public String getDate() {
		Calendar cal = Calendar.getInstance();
		cal.set(dateTime.getYear(), dateTime.getMonth(), dateTime.getDay());
		return DocumentHelper.getRSLILDate(cal.getTime());
	}
	
	public String getVersion() {
		return versionText.getText();
	}
}
