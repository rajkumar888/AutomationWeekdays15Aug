package testngdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestngDemo {

	



//	public static void main(String[] args) {
//
//		System.out.println("welcome to main java....");
//	}
	
	
	@Test
	public void testcase001() {
		System.out.println("welcome to testng1....");
//		Assert.assertTrue(10>5);
		Assert.fail();
	}
	
	@Test
	public void testcase002() {
		System.out.println("welcome to testng2....");
//		Assert.assertTrue(20>10);
		Assert.assertFalse(20<10);
	}
	
	@Test
	public void testcase003() {
		System.out.println("welcome to testng3....");
//		Assert.assertTrue(10>15);
		Assert.assertFalse(20>10);
		
	}



}
