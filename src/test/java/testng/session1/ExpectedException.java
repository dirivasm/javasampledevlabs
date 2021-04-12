package testng.session1;

import org.openqa.selenium.ElementNotVisibleException;
import org.testng.annotations.Test;

public class ExpectedException {


	  @Test(expectedExceptions = {ElementNotVisibleException.class})
	  public void test1() {
		   System.out.println("Test1");
	  }

	
}
