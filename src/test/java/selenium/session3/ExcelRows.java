package selenium.session3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRows {

	public static void main(String[] args) {
		
		String fileName = "src/main/resources/sdet_excel_void.xlsx";
		String sheetName = "Sheet1";
		
		String extension =fileName.substring(fileName.indexOf("."));
		
		Workbook wb = null;
		
		File fl = new File(fileName);
		try {
			FileInputStream fis = new FileInputStream(fl);
			
			if(extension.equals(".xls")) {
				wb = new HSSFWorkbook(fis);
			}else if(extension.equals(".xlsx")) {
				wb = new XSSFWorkbook(fis);
			}
			
			Sheet sh = wb.getSheet(sheetName);
			
			//Get total of entries (does not include blank rows)
			int rwcnt = sh.getPhysicalNumberOfRows();
			System.out.println("Rows: "+rwcnt);

			//Get total of entries (Includes blank rows)
			rwcnt = sh.getLastRowNum();
			System.out.println("Rows: "+rwcnt);

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
