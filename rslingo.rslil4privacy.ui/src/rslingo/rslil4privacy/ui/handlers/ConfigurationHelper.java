package rslingo.rslil4privacy.ui.handlers;

import java.io.File;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.eclipse.core.runtime.Platform;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class ConfigurationHelper {

	private static final String RSLINGO_PATH = Platform.getInstallLocation()
			.getURL().getPath().substring(1)
			+ "RSLingo4Privacy/";
	
	private static final String CONFIG_PATH = "config.xml";
	
	public static HashMap<String, String> getConfigurations() {
		HashMap<String, String> configs = new HashMap<String, String>();
		File configFile = new File(RSLINGO_PATH + CONFIG_PATH);
		
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
			Element useGraphvizConfig = (Element) nodes.item(2);
			configs.put("use-graphviz", useGraphvizConfig.getAttribute("value"));
			Element graphvizConfig = (Element) nodes.item(3);
			configs.put("graphviz-path", graphvizConfig.getAttribute("value"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return configs;
	}
	
	public static String getWordPath() {
		HashMap<String, String> configs = getConfigurations();
		String path = configs.get("word-path");
		
		return path;
	}

	public static String getExcelPath() {
		HashMap<String, String> configs = getConfigurations();
		String path = configs.get("excel-path");
		
		return path;
	}
	
}
