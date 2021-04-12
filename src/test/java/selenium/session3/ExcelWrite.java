package selenium.session3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

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
			
			int rwcnt = sh.getPhysicalNumberOfRows();
			int colcnt = sh.getRow(0).getLastCellNum();
			
			System.out.println("Rows: "+rwcnt);
			System.out.println("Cols: "+colcnt);
			
			
			sh.createRow(rwcnt).createCell(0).setCellValue("Ruben");
			sh.getRow(rwcnt).createCell(1).setCellValue("Cuevas");
			sh.getRow(rwcnt).createCell(2).setCellValue(65);
			sh.getRow(rwcnt).createCell(3).setCellValue("Healthy Food");
			fis.close();
			
			FileOutputStream fos = new FileOutputStream(fl);
			wb.write(fos);
			wb.close();
			fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
