package selenium.session3;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDeleteSheets {

	public static void main(String[] args) {
		
		String fileName = "src/main/resources/sdet_sheets.xlsx";
		
		String extension =fileName.substring(fileName.indexOf("."));
		
		Workbook wb = null;
		
		try {
			FileInputStream fis = new FileInputStream(new File(fileName));
			
			if(extension.equals(".xls")) {
				wb = new HSSFWorkbook(fis);
			}else if(extension.equals(".xlsx")) {
				wb = new XSSFWorkbook(fis);
			}
			
			int shcnt = wb.getNumberOfSheets();
			System.out.println("Current Number of Sheets: "+shcnt);
			
			Map<String,Integer> ash = new HashMap<String,Integer>();
			System.out.println("Sheet Names: ");
			for(int i=0; i<shcnt; i++) {
				String sheetName = wb.getSheetName(i);
				System.out.println(sheetName);
				ash.put(sheetName,i);
			}
			
			
			System.out.println("***** DELETING SHEET 1 & 2 ******");
			if(ash.containsKey("Sheet1") || ash.containsKey("Sheet2")) {
				wb.removeSheetAt(ash.get("Sheet1"));
				wb.removeSheetAt(ash.get("Sheet2"));
			}
			
			
			shcnt = wb.getNumberOfSheets();
			System.out.println("Current Number of Sheets after Delete: "+shcnt);
			System.out.println("Sheet Names: ");
			for(int i=0; i<shcnt; i++) {
				System.out.println(wb.getSheetName(i));
			}

			
			wb.close();
			fis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
