package com.seleniumdemo.day2;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextDemo2 {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Begining of program......................." + new Date());
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.facebook.com/";
		driver.get(url);
		
		
//		driver.findElement(By.partialLinkText("Information Centre")).click();
		
		
		driver.findElement(By.id("email")).sendKeys("facebookuserDemo");
		
		
		String emailfieldvalue = driver.findElement(By.id("email")).getAttribute("value");
		System.out.println(emailfieldvalue);
		
		System.out.println("===========================================");
		
		String logingtext = driver.findElement(By.name("login")).getText();
		System.out.println(logingtext);
		System.out.println("===========================================");
		
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
