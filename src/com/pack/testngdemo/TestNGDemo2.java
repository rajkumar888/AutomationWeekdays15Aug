package com.pack.testngdemo;

import org.testng.annotations.Test;

public class TestNGDemo2 {
	
	
  @Test
  public void t1() {
	  
	System.out.println("Welcome to testng t1");  
  }
  
  
  
  @Test
  public void t2() {
	  
	System.out.println("Welcome to testng t2");  
  }
  
  
  @Test(enabled=false)
  public void t3() {
	  
	System.out.println("Welcome to testng t3");  
  }
  
}
