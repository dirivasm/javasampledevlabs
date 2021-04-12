package pageobjectmodel;

import org.testng.annotations.DataProvider;

public class DirectoryDataProvider {
	
	@DataProvider
	public Object[][] dp(){
		return ExcelRead.read("src/main/resources/DirectoryExcel.xlsx", "Data");    
	}

}
