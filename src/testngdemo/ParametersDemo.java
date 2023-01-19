package testngdemo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParametersDemo {
	
	@Parameters({"browser", "username", "password" })

	@Test()
	public void test1(String browser,String username, String password) {
		
		// Negative Scenario
		System.out.println("browser is "+browser);
		System.out.println("Username is "+username);
		System.out.println("password is "+password);
//		Assert.assertFalse(true);
	}
	
	
	
	
	

	@Parameters({"username", "password" })
	@Test()
	public void test3(String username, String password) {
		
		System.out.println("Username is "+username);
		System.out.println("password is "+password);
	}

}
