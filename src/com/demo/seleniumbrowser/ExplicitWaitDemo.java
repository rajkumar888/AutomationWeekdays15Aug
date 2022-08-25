package com.demo.seleniumbrowser;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Begining of program......................." + new Date());
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
//		String url = "https://www.facebook.com/";
//		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		
		
		
		String eTitle = "Demo Guru99 Page";
		String aTitle = "" ;
		
		
		// launch Chrome and redirect it to the Base URL
		driver.get("http://demo.guru99.com/test/guru99home/" );
		
		
		aTitle = driver.getTitle();
		//compare the actual title with the expected title
		if (aTitle.contentEquals(eTitle))
		{
		System.out.println( "Test Passed") ;
		}
		else {
		System.out.println( "Test Failed" );
		}
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		WebElement guru99seleniumlink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='http://www.guru99.com/']/img")));
		
		guru99seleniumlink.click();

		
		
		
		
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
