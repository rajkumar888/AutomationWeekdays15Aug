package com.pack.testngdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryListenerDemo {

	
	 @Test(retryAnalyzer = RetryAnalyzerImplementation.class)
	    public void test1() {
	        //Negative Scenario
	        Assert.assertEquals(3,5,"Value is not matched");
	    }
	 
	    
	    @Test(retryAnalyzer = RetryAnalyzerImplementation.class)
	    public void test3() {
	    	
	    	Assert.assertEquals(3,3,"Value is not matched");
	    }
	
	
}
