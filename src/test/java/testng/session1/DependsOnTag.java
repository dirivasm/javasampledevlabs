package testng.session1;

import org.testng.annotations.Test;

public class DependsOnTag {


	  @Test
	  public void test1() {
		  System.out.println("Test1");
	  }
	
	  @Test(dependsOnMethods = {"test1"})
	  public void test2() {
		  System.out.println("Test2");
	  }
		
	  @Test
	  public void test3() {
		  System.out.println("Test3");
	  }
	

	
}
