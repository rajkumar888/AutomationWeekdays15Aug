package testngdemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	@Test(dataProvider = "login")
	
	public void login_demo(String username, String password) {

		System.out.println("username................." + username);
		System.out.println("password................." + password);
		System.out.println("===========================================");
	}
	
	
	

	@DataProvider(name = "login")
	
	public Object[][] dataProviderMethod() {
		
		
		Object[][] data = new Object[4][2];

		// 1st row.
		data[0][0] = "John";
		data[0][1] = "password1";

		// 2nd row.
		data[1][0] = "Sanjana";
		data[1][1] = "password2";

		// 3rd row.
		data[2][0] = "Deep";
		data[2][1] = "password3";
		
		data[3][0] = "demo";
		data[3][1] = "password4";

		return data;
	}

}
