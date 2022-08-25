package com.testngdemo;

import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	
	@BeforeSuite
	public void initsuite(){
		System.out.println("@BeforeSuite annotation");
	}

	
	@BeforeTest
	public void initTest(){
		System.out.println("@BeforeTest annotation");
	}
	
	
	@BeforeClass
	public void initClass(){
		System.out.println("@BeforeClass annotation");
	}
	
	
	@BeforeGroups("smoke")
	public void intigroup()
	{
		System.out.println("@BeforeGroups annotation");
	}
	
	@AfterGroups("smoke")
	public void teargroup()
	{
		System.out.println("@AfterGroups annotation");
	}
	
	
	@BeforeMethod
	public void initMethod(){
		System.out.println("@BeforeMethod annotation");
	}
	
	
	@AfterSuite
	public void tearsuite(){
		System.out.println("@AfterSuite annotation");
	}

	
	@AfterTest
	public void tearTest(){
		System.out.println("@AfterTest annotation");
	}
	
	
	@AfterClass
	public void tearClass(){
		System.out.println("@AfterClass annotation");
	}
	
	@AfterMethod
	public void tearMethod(){
		System.out.println("@AfterMethod annotation");
	}
	
	
	
	@Test(groups="smoke")
	public void testcase002() throws InterruptedException {

		System.out.println("inside testcase002 test case"+new Date());
		Assert.assertEquals(1, 1);
		Thread.sleep(1000);
	}
	
	
	@Test(groups="sanity")
	public void testcase003() throws InterruptedException {

		System.out.println("inside testcase003 test case"+new Date());
		Assert.assertEquals(1, 1);
		Thread.sleep(1000);
	}
	
	
	@Test(groups="smoke")
	public void testcase001() throws InterruptedException {

		System.out.println("inside testcase001 test case"+new Date());
		
		Assert.assertEquals(1, 1);
		Thread.sleep(1000);
	}

}
