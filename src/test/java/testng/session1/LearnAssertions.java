package testng.session1;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(listeners.LearnITestListener.class)
public class LearnAssertions {

	 @Test
	  public void testPass() {
		  Assert.assertEquals(true,true);
		  System.out.println("Testing success assertion");
	  }
	
	
	  @Test
	  public void testHardAssert() {
		  System.out.println("Test");
		  Assert.assertEquals(false,true);
		  System.out.println("Testing Hard Assertion");
	  }
	  
	  @Test
	  public void testSoftAssert() {
		 
		  SoftAssert obj = new SoftAssert();
		  obj.assertEquals(false,true);
		  System.out.println("Testing Soft Assertion");
		  obj.assertAll();
	  }
	
}
