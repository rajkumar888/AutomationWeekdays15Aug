package testngdemo;

import java.util.Date;

import org.testng.annotations.Test;

public class TestTimeout {

	@Test(timeOut = 500)
	public void testcase003() throws InterruptedException {
		System.out.println("welcome to testng3...."+new Date());
		Thread.sleep(100);
		System.out.println("welcome to testng3------"+new Date());
	}

	
	

	
}
