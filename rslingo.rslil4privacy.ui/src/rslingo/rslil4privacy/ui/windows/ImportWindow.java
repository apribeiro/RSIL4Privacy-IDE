package rslingo.rslil4privacy.ui.windows;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Button;

public class ImportWindow {

	public static final String SINGLE = "Single File";
	public static final String MAIN = "Main File";
	
	private String importMode;
	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ImportWindow window = new ImportWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public String open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		return importMode;
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(411, 160);
		shell.setText("RSLingo4Privacy Studio");
		
		Label lblRslilprivacyFileGeneration = new Label(shell, SWT.NONE);
		lblRslilprivacyFileGeneration.setBounds(10, 13, 197, 15);
		lblRslilprivacyFileGeneration.setText("RSL-IL4Privacy File Generation Mode:");
		
		Combo combo = new Combo(shell, SWT.NONE | SWT.READ_ONLY);
		combo.setBounds(223, 10, 165, 23);
		combo.setItems(new String[] { SINGLE, MAIN });
		combo.select(0);
		
		Button btnOk = new Button(shell, SWT.NONE);
		btnOk.setBounds(232, 87, 75, 25);
		btnOk.setText("OK");
		btnOk.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				importMode = combo.getItem(combo.getSelectionIndex());
				shell.close();
			}
		});
		
		Button btnCancel = new Button(shell, SWT.NONE);
		btnCancel.setBounds(313, 87, 75, 25);
		btnCancel.setText("Cancel");
		btnCancel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.close();
			}
		});
	}
}
