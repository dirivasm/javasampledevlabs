package selenium.session3;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) {
		
		String fileName = "src/main/resources/sdet_excel_void.xlsx";
		String sheetName = "Sheet1";
		
		String extension =fileName.substring(fileName.indexOf("."));
		
		Workbook wb = null;
		
		try {
			FileInputStream fis = new FileInputStream(new File(fileName));
			
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
			
			for(int i=0; i<rwcnt; i++) {
				System.out.println("***** Reading New Row");
				for(int j=0; j<colcnt; j++) {
					Cell cell = sh.getRow(i).getCell(j);
					if(cell != null)
						System.out.println("Row: "+i+" Col: "+j+" has Val: "+cell);
				}
				
			}
			fis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
