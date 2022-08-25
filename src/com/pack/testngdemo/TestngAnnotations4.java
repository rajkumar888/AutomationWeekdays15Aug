package com.pack.testngdemo;

import org.testng.Assert;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TestngAnnotations4 {
	
	@Test(groups="Santiy",timeOut=10000)
	public void test1() throws InterruptedException {
		System.out.println("Test Case 1");
		Assert.assertEquals(1, 1, "Comaparison is failed.............");
//		Thread.sleep(5000);
		System.out.println("Test Case 1 completed");
	}

	@Test(groups="Smoke")
	public void test2() {
		System.out.println("Test Case 2");
		Assert.assertEquals("Hello", "Hello", "Comaparison is failed.............");
	}
	

	@Test(groups="Santiy")
	public void test3() {
		System.out.println("Test Case 3");
		Assert.assertEquals(1, 1, "Comaparison is failed.............");
	}

	@Test(groups="Smoke")
	public void test4() {
		System.out.println("Test Case 4");
		Assert.assertEquals(1, 1, "Comaparison is failed.............");
	}
	
	
	@Test(groups="Smoke")
	public void test5() {
		System.out.println("Test Case 5");
		Assert.assertEquals(1, 1, "Comaparison is failed.............");
	}
	
	
	@BeforeGroups("Santiy")
	public void beforeGroups() {
		System.out.println("beforeGroups Santiy");
	}
	
	
	@AfterGroups("Santiy")
	public void afterGroups() {
		System.out.println("afterGroups Santiy");
	}
	
	@BeforeGroups("Smoke")
	public void beforeGroups1() {
		System.out.println("beforeGroups Smoke");
	}
	
	
	@AfterGroups("Smoke")
	public void afterGroups1() {
		System.out.println("afterGroups Smoke");
	}
	
	
}
