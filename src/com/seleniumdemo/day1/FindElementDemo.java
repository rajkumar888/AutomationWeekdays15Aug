package com.seleniumdemo.day1;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementDemo {

	public static void main(String[] args) throws InterruptedException, IOException  {
		System.out.print("Start of the Program.........."+new Date());
		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		String url = "https://www.selenium.dev/";
		driver.get(url);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
//		driver.findElement(By.xpath("//span[text()='Downloads']")).click();

		
		WebElement downloadlink = driver.findElement(By.xpath("//span[text()='Downloads']"));
		downloadlink.click();
		
		Thread.sleep(5000);
		System.out.println("===================================================");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		driver.findElement(By.id("selenium_logo")).click();
		Thread.sleep(5000);
		System.out.println("===================================================");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.className("fa-facebook")).click();
		Thread.sleep(5000);
		System.out.println("===================================================");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		driver.quit();
		System.out.print("End of the Program.........."+new Date());
	}
}
