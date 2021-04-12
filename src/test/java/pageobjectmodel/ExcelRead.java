package pageobjectmodel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static Object[][] read(String fileName, String sheetName) {
		
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
			
			//rwcont-1 because excel files have titles (wich are not part of the test data, just for descriptive purposes)
			Object[][] excel = new String[rwcnt-1][colcnt];
			//7. Create a loop over all the rows of excel file to read it
			for(int i = 0; i< rwcnt-1; i++) {
				Row row = sh.getRow(i+1); //i+1 since we are filling Object[][] for i index but we gather i+1 row (This is because first row contains titles and not test data)
				
				//8. Create a loop to print cells within a row
				for(int j = 0; j < colcnt; j++) {
					Cell val  = row.getCell(j);
					String cellVal = "";
					if(!(val == null))
						cellVal = val.getStringCellValue();
					excel[i][j] = cellVal;
				}
			}
			
			return excel;
			
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}

}
