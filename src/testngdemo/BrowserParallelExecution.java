package testngdemo;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserParallelExecution {
	 

WebDriver driver;
 
@BeforeMethod
@Parameters(value="browser")

public void setUp(String browser) throws Exception {
     
	if(browser.equalsIgnoreCase("chrome"))
	{
		System.out.println("Current Date and time is "+new Date()+" for browser name "+browser);
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		
	}else if(browser.equalsIgnoreCase("firefox"))
	{
		System.out.println("Current Date and time is "+new Date()+" for browser name "+browser);
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		driver = new FirefoxDriver();
		
	}else if(browser.equalsIgnoreCase("ie"))
	{
		System.out.println("Current Date and time is "+new Date()+" for browser name "+browser);
		System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
	}else if(browser.equalsIgnoreCase("edge"))
	{
		System.out.println("Current Date and time is "+new Date()+" for browser name "+browser);
		System.setProperty("webdriver.edge.driver", "./Driver/msedgedriver.exe");
		driver = new EdgeDriver();
		
		
	}else if(browser.equalsIgnoreCase("opera"))
	{
		System.out.println("Current Date and time is "+new Date()+" for browser name "+browser);
		System.setProperty("webdriver.opera.driver", "./Driver/operadriver.exe");
		driver = new OperaDriver();
	}
	else{
		throw new RuntimeException("Invalid broswername");
	}
	driver.manage().window().maximize();
 }
 
 
@Test
public void login() {
       
  driver.get("https://www.google.com");
  
  System.out.println(driver.getCurrentUrl());
  System.out.println(driver.getTitle());
}
 
  
 
@AfterMethod
    public void tearDown() throws Exception {
       if (driver != null) {
    	   Thread.sleep(5000);
            driver.quit();
        }
    }
}
 
