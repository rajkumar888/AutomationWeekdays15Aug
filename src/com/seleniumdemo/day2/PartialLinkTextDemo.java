package com.seleniumdemo.day2;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextDemo {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Begining of program......................." + new Date());
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "http://demo.guru99.com/test/radio.html";
		driver.get(url);

		
		
//		driver.findElement(By.linkText("Security Project")).click();
		
//		Marketplace
		
		driver.findElement(By.partialLinkText("Telecom")).click();
		
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
