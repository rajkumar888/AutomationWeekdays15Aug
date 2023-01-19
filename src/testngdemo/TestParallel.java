package testngdemo;

import java.util.Date;

import org.testng.annotations.Test;

public class TestParallel {

	@Test(invocationCount = 100, threadPoolSize = 50)
	public void testcase003() throws InterruptedException {
		System.out.println("welcome to testng3...."+new Date());
		Thread.sleep(1000);
	}
	
}
