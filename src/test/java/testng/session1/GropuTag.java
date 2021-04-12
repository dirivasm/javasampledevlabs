package testng.session1;

import org.testng.annotations.Test;

public class GropuTag {


	  @Test(groups = {"smoke","regression"})
	  public void test1() {
		  System.out.println("Test1");	  
	  }
	  
	  @Test(groups = {"regression"})
	  public void test2() {
		  System.out.println("Test2");	  
	  }
	  
	  @Test(groups = {"smoke","regression", "sanity"})
	  public void test3() {
		  System.out.println("Test3");	  
	  }
	  
	  @Test(groups = {"smoke","regression"})
	  public void test4() {
		  System.out.println("Test4");	  
	  }
	  
	  @Test(groups = {"sanity","regression"})
	  public void test5() {
		  System.out.println("Test5");	  
	  }
	
}
