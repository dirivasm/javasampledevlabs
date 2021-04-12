package testng.session2;

import org.testng.annotations.Test;

public class ParallelTest2 {
	
	@Test
	public void test4() {
		System.out.println("Test 4 "+Thread.currentThread().getId());
	}
	
	@Test
	public void test5() {
		System.out.println("Test 5 "+Thread.currentThread().getId());
	}
	
	@Test
	public void test6() {
		System.out.println("Test 6 "+Thread.currentThread().getId());
	}

}
