package testngdemo;

import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionDemo{
	
	@Test()
	public void test1() throws InterruptedException {
		System.out.println("Test Case 1 "+new Date() );
		
		
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals(1, 2);
//		Assert.assertEquals(1, 2);
		System.out.println(Thread.currentThread().getId()+"...........");
		System.out.println("Test Case 1 "+new Date() );
		
		
		softAssert.assertEquals("Hello", "Hello");
		System.out.println("Test Case 1 "+new Date() );
		
		softAssert.assertEquals("abc", "abc");
		System.out.println("Test Case 1 "+new Date() );
		
		
		System.out.println("End of Program...............");
		softAssert.assertAll();
		
	}

	
}
