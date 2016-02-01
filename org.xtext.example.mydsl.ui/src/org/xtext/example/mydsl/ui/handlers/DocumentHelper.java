package org.xtext.example.mydsl.ui.handlers;

import java.util.List;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr;

public class DocumentHelper {

	public static void replaceText(XWPFDocument doc, String tag, String value) {
		for (XWPFParagraph p : doc.getParagraphs()) {
		    List<XWPFRun> runs = p.getRuns();
		    
		    if (runs != null) {
		        for (XWPFRun r : runs) {
		            String text = r.getText(0);
		            if (text != null && text.contains(tag)) {
		                text = text.replace(tag, value);
		                r.setText(text, 0);
		            }
		        }
		    }
		}
		
		for (XWPFTable tbl : doc.getTables()) {
		   for (XWPFTableRow row : tbl.getRows()) {
		      for (XWPFTableCell cell : row.getTableCells()) {
		         for (XWPFParagraph p : cell.getParagraphs()) {
		            for (XWPFRun r : p.getRuns()) {
		              String text = r.getText(0);
		              
		              if (text.contains(tag)) {
		                text = text.replace(tag, value);
		                r.setText(text);
		              }
		            }
		         }
		      }
		   }
		}
	}
	
	public static XWPFParagraph getParagraph(XWPFDocument doc, String tag) {
		XWPFParagraph paragraph = null;
		
		for (XWPFParagraph p : doc.getParagraphs()) {
		    List<XWPFRun> runs = p.getRuns();
		    
		    if (runs != null) {
		        for (XWPFRun r : runs) {
		            String text = r.getText(0);
		            if (text != null && text.contains(tag)) {
		                return p;
		            }
		        }
		    }
		}
		return paragraph;
	}
	
	public static void cloneParagraph(XWPFParagraph clone, XWPFParagraph source) {
	    CTPPr pPr = clone.getCTP().isSetPPr() ? clone.getCTP().getPPr() : clone.getCTP().addNewPPr();
	    pPr.set(source.getCTP().getPPr());
	    for (XWPFRun r : source.getRuns()) {
	        XWPFRun nr = clone.createRun();
	        cloneRun(nr, r);
	    }
	}

	public static void cloneRun(XWPFRun clone, XWPFRun source) {
	    CTRPr rPr = clone.getCTR().isSetRPr() ? clone.getCTR().getRPr() : clone.getCTR().addNewRPr();
	    rPr.set(source.getCTR().getRPr());
	    clone.setText(source.getText(0));
	}
}
