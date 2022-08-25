package com.seleniumdemo.day2;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorLinkTextDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");
		System.out.println("Begining of program......................." + new Date());
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.facebook.com/";
		driver.get(url);

		
		
//		driver.findElement(By.id("email")).sendKeys("rajkumar888@gmail.com");
		
		driver.findElement(By.className("_6luy")).sendKeys("rajkumar888@gmail.com");
		
		driver.findElement(By.name("pass")).sendKeys("passwordDemo@123");
		
		driver.findElement(By.name("login")).submit();
		
		

		Thread.sleep(50000);
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
