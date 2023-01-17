package testngdemo;

import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemoEnable {

	
	@Test(enabled = true)
	public void testcase001111() throws InterruptedException {

		System.out.println("inside testcase001111 test case"+new Date());
		Thread.sleep(1000);
	}

	@Test(enabled = true)
	public void testcase0022222() throws InterruptedException {

		System.out.println("inside testcase0022222 test case"+new Date());
		Thread.sleep(1000);
		
		Assert.assertEquals("Computer", "computer","...results didnt match..");
	}
	
	@Test(dependsOnMethods = {"testcase0022222","testcase001111"},alwaysRun = true)
	public void testcase003333() throws InterruptedException {

		System.out.println("inside testcase003333 test case"+new Date());
		Thread.sleep(1000);
	}

}
