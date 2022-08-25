package com.pack.testngdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	
  @Test
  public void m1() {
	  
	System.out.println("Welcome to testng m1");  
	
	Assert.assertEquals(true, true);
  }
  
  
  
  @Test
  public void m2() {
	  
	System.out.println("Welcome to testng m2"); 
	
	int x=10;
	int y=20;
	
	int sum=x+y;
	
	
	Assert.assertEquals(sum, 40);
	
	System.out.println("after failed assertion check.....");  
	
  }
  
  
  @Test
  public void m3() {
	  
	System.out.println("Welcome to testng m2");  
	Assert.assertEquals(true, true);
  }
  
  @Test
  public void m4() {
	  
	System.out.println("Welcome to testng m2");  
//	Assert.assertEquals(true, false);
	Assert.assertTrue(false);
  }
  
}
