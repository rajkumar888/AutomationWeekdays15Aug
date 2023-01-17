package testngdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryListenerDemo {

	
	 @Test(retryAnalyzer = RetryAnalyzer.class)
	    public void test1() {
	        //Negative Scenario
//	        Assert.assertEquals(3,5,"Addition Problem! 2+2 must be 4!\n");
		 
//		 Assert.assertTrue(true);
		 
		 Assert.assertFalse(false);
		 
		 
	    }
	 
	    
	    @Test(retryAnalyzer = RetryAnalyzer.class)
	    public void test3() {
	        //Postive Scenario
//	    	Assert. assertEquals(4,4,"Addition Problem! 2+2 must be 4!\n");
//	    	 Assert.assertTrue(false);
	    	
	    	 Assert.assertFalse(true);
	    }
	
	
}
