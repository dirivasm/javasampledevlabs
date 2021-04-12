package testng.session1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTAG {


	  @Test(groups = {"smoke","regression"})
	  @Parameters({"user"})
	  public void test1(String user) {
		  System.out.println("User name is: "+user);	  
	  }

	
}
