package testng.session1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProv {
	  
		@DataProvider
		public Object[][] dp(){
			return new Object[][]{
						{1, "user1"},
						{2, "user2"},
						{3, "user3"}
					};
		}
		
		@Test(dataProvider="dp")
		public void testDP(Integer n, String str) {
			System.out.println("Integer: "+n);
			System.out.println("String: "+str);
		}
	
	
	
}
