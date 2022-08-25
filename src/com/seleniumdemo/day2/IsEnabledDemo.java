package com.seleniumdemo.day2;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledDemo {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Begining of program......................." + new Date());
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.firstflight.com.sg/";
		driver.get(url);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement  trackButton = driver.findElement(By.xpath("//input[@value='Track']"));
		
		System.out.println(trackButton.isDisplayed());
		System.out.println(trackButton.isEnabled());
		
		trackButton.submit();
//		trackButton.click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//h1[text()='Track Your AWBs']")).isDisplayed());
		

		Thread.sleep(5000);
		System.out.println("===================================================");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
