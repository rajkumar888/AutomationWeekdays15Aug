package testngdemo;

import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloWorld {
	
	

	@Test
	public void testcase003() throws InterruptedException {
		System.out.println("Hello world 3........"+new Date());
//		Thread.sleep(1000);
	}
	
	
	
	@Test
	public void testcase002() throws InterruptedException {
		System.out.println("Hello world 2........"+new Date());
//		Thread.sleep(1000);
	}

	
	

	@Test
	public void testcase001() throws InterruptedException {
		System.out.println("Hello world 1........"+new Date());
//		Thread.sleep(1000);
		Assert.assertTrue(false);
	}
}
