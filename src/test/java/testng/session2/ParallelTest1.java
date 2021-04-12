package testng.session2;

import org.testng.annotations.Test;

public class ParallelTest1 {
	
	@Test
	public void test1() {
		System.out.println("Test 1 "+Thread.currentThread().getId());
	}
	
	@Test
	public void test2() {
		System.out.println("Test 2 "+Thread.currentThread().getId());
	}
	
	@Test
	public void test3() {
		System.out.println("Test 3 "+Thread.currentThread().getId());
	}

}
