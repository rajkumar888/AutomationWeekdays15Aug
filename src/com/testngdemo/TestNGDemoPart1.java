package com.testngdemo;

import java.util.Date;

import org.testng.annotations.Test;

public class TestNGDemoPart1 {

	
	@Test()
	public void testcase001111() throws InterruptedException {

		System.out.println("inside testcase001111 test case"+new Date());
		Thread.sleep(1000);
	}

	@Test()
	public void testcase0022222() throws InterruptedException {

		System.out.println("inside testcase0022222 test case"+new Date());
		Thread.sleep(1000);
	}
	
	
	@Test()
	public void testcase003333() throws InterruptedException {

		System.out.println("inside testcase003333 test case"+new Date());
		Thread.sleep(1000);
	}

}
