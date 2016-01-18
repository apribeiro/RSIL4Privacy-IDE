package org.xtext.example.mydsl.ui.windows;

import java.io.File;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class ConfigurationWindow {

	private static final String CONFIG_PATH = "config.xml";
	private static final String DEF_WORD_PATH = "RSLIL-WordTemplate.docx";
	private static final String DEF_EXCEL_PATH = "RSLIL-ExcelTemplate-v1.1.xlsx";
	private static final String DEF_EDDY_PATH = "Eddy.jar";
	
	private final String PLUGIN_PATH = Platform.getInstallLocation()
			.getURL().getPath().substring(1)
			+ "plugins/RSLingo4Privacy/";
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	
	private Shell shell;
	private Shell parent;

	public ConfigurationWindow(Shell parent) {
		this.parent = parent;
	}

	/**
 	 * Launch the application.
 	 * @param args
 	 */
 	public static void main(String[] args) {
 		try {
 			ConfigurationWindow window = new ConfigurationWindow(null);
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
		checkPluginFolder();
		
		shell = new Shell(parent, SWT.CLOSE | SWT.TITLE | SWT.MAX 
				| SWT.RESIZE | SWT.APPLICATION_MODAL);
		shell.setSize(450, 300);
		shell.setText("RSLingo4Privacy Studio");
		
		Group grpTemplates = new Group(shell, SWT.NONE);
		grpTemplates.setText("Templates");
		grpTemplates.setBounds(10, 10, 414, 82);
		
		// Force labels background colors to be transparent
		formToolkit.setBackground(null);
		
		Label lblWord = formToolkit.createLabel(grpTemplates, "Word:", SWT.NONE);
		lblWord.setBounds(10, 23, 37, 15);
		
		Label lblExcel = formToolkit.createLabel(grpTemplates, "Excel:", SWT.ALPHA);
		lblExcel.setBounds(10, 54, 37, 15);
		
		HashMap<String, String> configs = getConfigurations();
		Text txtWord = formToolkit.createText(grpTemplates, configs.get("word-path"), SWT.NONE);
		txtWord.setBounds(53, 20, 262, 21);
		txtWord.setEnabled(false);
		
		Text txtExcel = formToolkit.createText(grpTemplates, configs.get("excel-path"), SWT.NONE);
		txtExcel.setBounds(53, 51, 262, 21);
		txtExcel.setEnabled(false);
		
		Button btnBrowseWord = new Button(grpTemplates, SWT.NONE);
		btnBrowseWord.setBounds(321, 18, 75, 25);
		formToolkit.adapt(btnBrowseWord, true, true);
		btnBrowseWord.setText("Browse...");
		btnBrowseWord.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog dialog = new FileDialog(shell, SWT.OPEN);
				dialog.setFilterExtensions(new String[] { "*.docx", "*.doc" });
				dialog.setText("Select the Word file to upload");
				String path = dialog.open();
				
				if (path != null) {
					txtWord.setText(path);
				}
			}
		});
		
		Button btnBrowseExcel = new Button(grpTemplates, SWT.NONE);
		btnBrowseExcel.setBounds(321, 49, 75, 25);
		formToolkit.adapt(btnBrowseExcel, true, true);
		btnBrowseExcel.setText("Browse...");
		btnBrowseExcel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog dialog = new FileDialog(shell, SWT.OPEN);
				dialog.setFilterExtensions(new String[] { "*.xlsx", "*.xls" });
				dialog.setText("Select the Excel file to upload");
				String path = dialog.open();
				
				if (path != null) {
					txtWord.setText(path);
				}
			}
		});
		
		Group grpEddy = new Group(shell, SWT.NONE);
		grpEddy.setText("Eddy Reasoner");
		grpEddy.setBounds(10, 98, 414, 82);
		
		Label lblJarPath = formToolkit.createLabel(grpEddy, "Jar Path:", SWT.ALPHA);
		lblJarPath.setBounds(10, 26, 44, 15);
		
		Text txtEddy = formToolkit.createText(grpEddy, configs.get("eddy-path"), SWT.NONE);
		txtEddy.setBounds(62, 23, 253, 21);
		txtEddy.setEnabled(false);
		
		Button btnBrowseEddy = new Button(grpEddy, SWT.NONE);
		btnBrowseEddy.setBounds(321, 21, 75, 25);
		formToolkit.adapt(btnBrowseEddy, true, true);
		btnBrowseEddy.setText("Browse...");
		btnBrowseEddy.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog dialog = new FileDialog(shell, SWT.OPEN);
				dialog.setFilterExtensions(new String[] { "*.jar" });
				dialog.setText("Select the Eddy jar file to upload");
				String path = dialog.open();
				
				if (path != null) {
					txtEddy.setText(path);
				}
			}
		});
		
		Button btnOk = new Button(shell, SWT.NONE);
		btnOk.setBounds(268, 227, 75, 25);
		btnOk.setText("OK");
		btnOk.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				HashMap<String, String> configs = new HashMap<String, String>();
				configs.put("word-path", txtWord.getText());
				configs.put("excel-path", txtExcel.getText());
				configs.put("eddy-path", txtEddy.getText());
				saveConfigurations(configs);
				shell.close();
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
	}
	
	private void checkPluginFolder() {
		File pluginFolder = new File(PLUGIN_PATH);
		File configFile = new File(PLUGIN_PATH + CONFIG_PATH);
		
		if (!pluginFolder.exists()) {
			pluginFolder.mkdir();
		}
		
		if (!configFile.exists()) {
			try {
				DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
				Document doc = docBuilder.newDocument();
				
				// Configuration elements
				Element config = doc.createElement("configurations");
				config.setAttribute("description", "File containing the configurations for RSLingo4Privacy");
				doc.appendChild(config);
				// Word template path
				Element wordConfig = doc.createElement("configuration");
				wordConfig.setAttribute("name", "word-path");
				wordConfig.setAttribute("value", DEF_WORD_PATH);
				config.appendChild(wordConfig);
				// Excel template path
				Element excelConfig = doc.createElement("configuration");
				excelConfig.setAttribute("name", "excel-path");
				excelConfig.setAttribute("value", DEF_EXCEL_PATH);
				config.appendChild(excelConfig);
				// Eddy Reasoner path
				Element eddyConfig = doc.createElement("configuration");
				eddyConfig.setAttribute("name", "eddy-path");
				eddyConfig.setAttribute("value", DEF_EDDY_PATH);
				config.appendChild(eddyConfig);
				
				// Write the content into the config.xml file
				TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				transformer.setOutputProperty(OutputKeys.INDENT, "yes");
				DOMSource source = new DOMSource(doc);
				StreamResult result = new StreamResult(configFile);
				transformer.transform(source, result);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	private HashMap<String, String> getConfigurations() {
		HashMap<String, String> configs = new HashMap<String, String>();
		File configFile = new File(PLUGIN_PATH + CONFIG_PATH);
		
		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(configFile);
			doc.getDocumentElement().normalize();
			
			XPath xPath = XPathFactory.newInstance().newXPath();
			NodeList nodes = (NodeList) xPath.evaluate("/configurations/configuration",
					doc.getDocumentElement(), XPathConstants.NODESET);
			
			Element wordConfig = (Element) nodes.item(0);
			configs.put("word-path", wordConfig.getAttribute("value"));
			Element excelConfig = (Element) nodes.item(1);
			configs.put("excel-path", excelConfig.getAttribute("value"));
			Element eddyConfig = (Element) nodes.item(2);
			configs.put("eddy-path", eddyConfig.getAttribute("value"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return configs;
	}
	
	private void saveConfigurations(HashMap<String, String> configs) {
		File configFile = new File(PLUGIN_PATH + CONFIG_PATH);

		if (!configs.get("word-path").equals(DEF_WORD_PATH)
			|| !configs.get("excel-path").equals(DEF_EXCEL_PATH)
			|| !configs.get("eddy-path").equals(DEF_EDDY_PATH)) {
			try {
				DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
				Document doc = docBuilder.parse(configFile);
				doc.getDocumentElement().normalize();
				
				XPath xPath = XPathFactory.newInstance().newXPath();
				NodeList nodes = (NodeList) xPath.evaluate("/configurations/configuration",
						doc.getDocumentElement(), XPathConstants.NODESET);
				
				if (!configs.get("word-path").equals(DEF_WORD_PATH)) {
					Element wordConfig = (Element) nodes.item(0);
					wordConfig.setAttribute("value", configs.get("word-path"));
				}
				
				if (!configs.get("excel-path").equals(DEF_EXCEL_PATH)) {
					Element excelConfig = (Element) nodes.item(1);
					excelConfig.setAttribute("value", configs.get("excel-path"));
				}
				
				if (!configs.get("eddy-path").equals(DEF_EDDY_PATH)) {
					Element eddyConfig = (Element) nodes.item(2);
					eddyConfig.setAttribute("value", configs.get("eddy-path"));
				}
				
				// Write the content into the config.xml file
				TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				transformer.setOutputProperty(OutputKeys.INDENT, "yes");
				DOMSource source = new DOMSource(doc);
				StreamResult result = new StreamResult(configFile);
				transformer.transform(source, result);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
