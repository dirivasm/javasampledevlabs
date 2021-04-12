package testng.session2;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.LearnITestListener.class)
public class SuccessPercentage {

	int count=0;
	 @Test(invocationCount = 4, successPercentage = 30)
	 
	  public void testPass() {
		  
		 System.out.println("Invocation count: "+count);
		 if(count++ %2 == 0) {
			 assertEquals(false, false);
		 }else {
			 assertEquals(true, false);
		 }
		 
	  }
	
	
	
}
