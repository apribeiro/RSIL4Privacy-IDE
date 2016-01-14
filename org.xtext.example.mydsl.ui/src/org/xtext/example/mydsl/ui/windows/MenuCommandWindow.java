package org.xtext.example.mydsl.ui.windows;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.widgets.Composite;

public class MenuCommandWindow {

	protected Shell shell;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MenuCommandWindow window = new MenuCommandWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("RSLIL4Privacy");
		
		Button btnRadioButtonAll = new Button(shell, SWT.RADIO);
		btnRadioButtonAll.setBounds(10, 10, 100, 16);
		btnRadioButtonAll.setText("Use all projects");
		btnRadioButtonAll.setSelection(true);
		btnRadioButtonAll.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		
		Button btnRadioButtonSelected = new Button(shell, SWT.RADIO);
		btnRadioButtonSelected.setBounds(240, 10, 166, 16);
		btnRadioButtonSelected.setText("Use projects selected below");
		btnRadioButtonSelected.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		
		Button btnOk = new Button(shell, SWT.NONE);
		btnOk.setBounds(268, 227, 75, 25);
		btnOk.setText("OK");
		btnOk.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (btnRadioButtonAll.getSelection()) {
					
				} else if (btnRadioButtonSelected.getSelection()) {
					
				}
			}
		});
		
		Button btnCancel = new Button(shell, SWT.NONE);
		btnCancel.setBounds(349, 227, 75, 25);
		btnCancel.setText("Cancel");
		btnCancel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.close();
			}
		});
		
		Composite composite = formToolkit.createComposite(shell, SWT.NONE);
		composite.setBounds(10, 32, 414, 189);
		formToolkit.paintBordersFor(composite);
	}
}
