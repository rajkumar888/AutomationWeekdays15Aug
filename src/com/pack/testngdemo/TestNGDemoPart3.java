package com.pack.testngdemo;

import java.util.Date;

import org.testng.annotations.Test;

public class TestNGDemoPart3 {

	
	@Test()
	public void testcase005555() throws InterruptedException {
		System.out.println("inside testcase005555 test case"+new Date());
		Thread.sleep(1000);
	}

	@Test()
	public void testcase006666() throws InterruptedException {
		System.out.println("inside testcase006666 test case"+new Date());
		Thread.sleep(1000);
	}
	
	
	@Test()
	public void testcase007777() throws InterruptedException {
		System.out.println("inside testcase007777 test case"+new Date());
		Thread.sleep(1000);
	}

}
