package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class LearnITestListener implements ITestListener {

	public void onStart(ITestContext context) {
				System.out.println("On TEST start");
	}

	public void onFinish(ITestContext context) {
		System.out.println("On TEST completion");
	}

	public void onTestStart(ITestResult result) {
		System.out.println("On TEST start");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Failed skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test Failed but with success percentage");
	}

}
