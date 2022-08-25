package com.seleniumdemo.day2;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchDemo {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Begining of program......................." + new Date());
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.google.com/";
		driver.get(url);

		driver.findElement(By.cssSelector("input[name='q'][title='Search']")).sendKeys("DevLabsalliance.com",
				Keys.ENTER);

		Thread.sleep(5000);
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}
}
