package testngdemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener						
{		
	 public void onFinish(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    public void onStart(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    public void onTestFailure(ITestResult result) {					
	    	System.out.println(result.getMethod().getMethodName()+".....test failed...");		
	        		
	    }		

	    public void onTestSkipped(ITestResult result) {					
	    	System.out.println(result.getMethod().getMethodName()+".....test skipped...");			
	        		
	    }		

	    public void onTestStart(ITestResult result) {					
	    	System.out.println(result.getMethod().getMethodName()+".....test satrted...");			
	        		
	    }		

	    public void onTestSuccess(ITestResult result) {					
	        System.out.println(result.getMethod().getMethodName()+".....successfully passed");		
	        		
	    }	
   	
}