package testng.session2;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class RetryAnalizerTest {

	 @Test(retryAnalyzer = listeners.LearnIRetryAnalyzer.class)	 
	  public void testPass() {
		  
		 assertEquals(false, true);
		 
	  }
	
	
	
}
