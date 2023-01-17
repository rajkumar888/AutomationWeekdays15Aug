package testngdemo;

import org.testng.annotations.Test;

public class TestPriority {

	@Test(priority = 1)
	public void testcase003() {
		System.out.println("welcome to testng3....");
	}

	
	@Test(priority = 3)
	public void testcase002() {
		System.out.println("welcome to testng2....");
	}

	
	@Test(priority = -2)
	public void testcase001() {
		System.out.println("welcome to testng1....");
	}

	@Test()
	public void testcase006() {
		System.out.println("welcome to testng5....");
	}

	
}
