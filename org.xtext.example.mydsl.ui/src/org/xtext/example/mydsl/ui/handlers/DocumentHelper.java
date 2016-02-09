package org.xtext.example.mydsl.ui.handlers;

import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xwpf.usermodel.PositionInParagraph;
import org.apache.poi.xwpf.usermodel.TextSegement;
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
						replaceText(p, tag, value);
					}
				}
			}
		}
	}

	public static void replaceText(XWPFParagraph par, String tag, String value, boolean addLineBreak) {
		List<XWPFRun> runs = par.getRuns();

		if (runs != null) {
			TextSegement found = par.searchText(tag, new PositionInParagraph());

			if (found != null) {
				if (found.getBeginRun() == found.getEndRun()) {
					// whole search string is in one Run
					XWPFRun run = runs.get(found.getBeginRun());
					String runText = run.getText(run.getTextPosition());
					String replaced = runText.replace(tag, value);
					run.setText(replaced, 0);
					
					if (addLineBreak) {
						run.addCarriageReturn();
					}
				} else {
					// The search string spans over more than one Run
					// Put the Strings together
					StringBuilder b = new StringBuilder();

					for (int runPos = found.getBeginRun(); runPos <= found.getEndRun(); runPos++) {
						XWPFRun run = runs.get(runPos);
						b.append(run.getText(run.getTextPosition()));
					}

					String connectedRuns = b.toString();
					String replaced = connectedRuns.replace(tag, value);

					// The first Run receives the replaced String of all connected Runs
					XWPFRun partOne = runs.get(found.getBeginRun());
					partOne.setText(replaced, 0);

					if (addLineBreak) {
						partOne.addCarriageReturn();
					}
					
					// Remove the text in the other Runs.
					for (int runPos = found.getBeginRun() + 1; runPos <= found.getEndRun(); runPos++) {
						XWPFRun partNext = runs.get(runPos);
						partNext.setText("", 0);
					}
				}
			}
		}
	}

	public static void replaceText(XWPFParagraph par, String tag, String value) {
		replaceText(par, tag, value, false);
	}
	
	public static void addLineBreakToParagraph(XWPFParagraph par) {
		List<XWPFRun> runs = par.getRuns();
		
		if (runs != null) {
			runs.get(runs.size() - 1).addCarriageReturn();
		}
	}
	
	public static XWPFParagraph getParagraph(XWPFDocument doc, String tag) {
		XWPFParagraph paragraph = null;

		for (XWPFParagraph p : doc.getParagraphs()) {
			String text = p.getText();

			if (text != null && text.contains(tag)) {
				return p;
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
	
	public static Cell getCell(XSSFSheet sheet, String tag) {
		XSSFCell cell = null;
		
		for (Row row : sheet) {
			for (Cell c : row) {
	            if (c.getCellType() == Cell.CELL_TYPE_STRING) {
	                if (c.getRichStringCellValue().getString().trim().equals(tag)) {
	                    return c;
	                }
	            }
	        }
		}
		return cell;
	}
	
	public static void cloneRow(XSSFWorkbook workbook, XSSFSheet sheet, XSSFRow clone, XSSFRow source) {
		// Loop through source columns to add to new row
		for (int i = 0; i < source.getLastCellNum(); i++) {
			// Grab a copy of the old/new cell
			XSSFCell oldCell = source.getCell(i);
			XSSFCell newCell = clone.createCell(i);

			// If the old cell is null jump to next cell
			if (oldCell == null) {
				newCell = null;
				continue;
			}

			// Copy style from old cell and apply to new cell
			XSSFCellStyle newCellStyle = workbook.createCellStyle();
			newCellStyle.cloneStyleFrom(oldCell.getCellStyle());
			newCell.setCellStyle(newCellStyle);

			// If there is a cell comment, copy
			if (oldCell.getCellComment() != null) {
				newCell.setCellComment(oldCell.getCellComment());
			}

			// If there is a cell hyperlink, copy
			if (oldCell.getHyperlink() != null) {
				newCell.setHyperlink(oldCell.getHyperlink());
			}

			// Set the cell data type
			newCell.setCellType(oldCell.getCellType());

			// Set the cell data value
			switch (oldCell.getCellType()) {
			case Cell.CELL_TYPE_BLANK:
				newCell.setCellValue(oldCell.getStringCellValue());
				break;
			case Cell.CELL_TYPE_BOOLEAN:
				newCell.setCellValue(oldCell.getBooleanCellValue());
				break;
			case Cell.CELL_TYPE_ERROR:
				newCell.setCellErrorValue(oldCell.getErrorCellValue());
				break;
			case Cell.CELL_TYPE_FORMULA:
				newCell.setCellFormula(oldCell.getCellFormula());
				break;
			case Cell.CELL_TYPE_NUMERIC:
				newCell.setCellValue(oldCell.getNumericCellValue());
				break;
			case Cell.CELL_TYPE_STRING:
				newCell.setCellValue(oldCell.getRichStringCellValue());
				break;
			}
		}

		// If there are are any merged regions in the source row, copy to new row
		for (int i = 0; i < sheet.getNumMergedRegions(); i++) {
			CellRangeAddress cellRangeAddress = sheet.getMergedRegion(i);
			
			if (cellRangeAddress.getFirstRow() == source.getRowNum()) {
				CellRangeAddress newCellRangeAddress = new CellRangeAddress(clone.getRowNum(),
						(clone.getRowNum() +
								(cellRangeAddress.getLastRow() - cellRangeAddress.getFirstRow()
										)),
						cellRangeAddress.getFirstColumn(),
						cellRangeAddress.getLastColumn());
				sheet.addMergedRegion(newCellRangeAddress);
			}
		}
	}
	
	public static void replaceText(XSSFRow row, String tag, String value) {
		for (Cell c : row) {
            if (c.getCellType() == Cell.CELL_TYPE_STRING) {
                if (c.getRichStringCellValue().getString().trim().equals(tag)) {
                	if (tryParseInt(value)) {
                		c.setCellValue(Integer.parseInt(value));
					} else {
						c.setCellValue(value);
					}
                }
            }
		}
	}
	
	private static boolean tryParseInt(String value) {
		try {
			Integer.parseInt(value);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
