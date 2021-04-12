package testng.session2;

import org.testng.annotations.Test;

public class ParallelTest3 {
	
	@Test
	public void test7() {
		System.out.println("Test 7 "+Thread.currentThread().getId());
	}
	
	@Test
	public void test8() {
		System.out.println("Test 8 "+Thread.currentThread().getId());
	}
	
	@Test
	public void test9() {
		System.out.println("Test 9 "+Thread.currentThread().getId());
	}

}
