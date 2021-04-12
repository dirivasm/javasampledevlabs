package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class LearnIRetryAnalyzer implements IRetryAnalyzer {

	private int retrycnt = 0;
	private int maxRetrycnt = 2;
	
	@Override
	public boolean retry(ITestResult result) {
		
		if(retrycnt <= maxRetrycnt) {
			System.out.println("Retry");
			retrycnt++;
			return true;
		}
		
		return false;
	}

	
}
