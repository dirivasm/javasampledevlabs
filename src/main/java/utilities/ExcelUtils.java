package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

public class ExcelUtils {
	
	public List<Map<String, String>> readInputDataFromFile(String fileName) throws EncryptedDocumentException, InvalidFormatException {
	    List<Map<String, String>> inputData = new ArrayList<>();
	    File file = readFileFromResource(fileName);

	    try {
	      FileInputStream inputStream = new FileInputStream(file);
	      Workbook workbook = WorkbookFactory.create(inputStream);

	      Sheet sheet = workbook.getSheetAt(0);

	      for (Row row : sheet) {
	        Row rowHeader = sheet.getRow(0);
	        Iterator<Cell> cellHeaderIterator = rowHeader.cellIterator();
	        Iterator<Cell> cellIterator = row.cellIterator();
	        Map<String, String> rowsData = new HashMap<>();

	        while (cellHeaderIterator.hasNext()) {
	          Cell cellHeader = cellHeaderIterator.next();
	          Cell cellData = cellIterator.next();
	          CellType type = cellData.getCellTypeEnum();

	          switch (type) {
	            case STRING:
	              rowsData.put(cellHeader.getStringCellValue(), cellData.getStringCellValue());
	              break;
	            case NUMERIC:
	              rowsData.put(
	                  cellHeader.getStringCellValue(), String.valueOf(cellData.getNumericCellValue()));
	              break;
	            case BOOLEAN:
	              rowsData.put(
	                  cellHeader.getStringCellValue(), String.valueOf(cellData.getBooleanCellValue()));
	              break;
	          }
	        }

	        inputData.add(rowsData);
	      }
	      workbook.close();
	      inputStream.close();

	    } catch (IOException e) {
	      e.printStackTrace();
	    }

	    return inputData;
	  }

	
	 public File readFileFromResource(String filePath) {
		    ClassLoader classLoader = getClass().getClassLoader();
		    return new File(Objects.requireNonNull(classLoader.getResource(filePath)).getFile());
	}

	  
	
}
