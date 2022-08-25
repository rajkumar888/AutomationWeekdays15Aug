package com.seleniumdemo.day2;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookSelectClassDemo {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Begining of program......................." + new Date());
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		long start_time = System.currentTimeMillis();
		
		String url = "https://www.gmail.com/";
		driver.get(url);
		
		driver.findElement(By.cssSelector("input[id='identifierId']")).sendKeys("rajkumar888");
		driver.findElement(By.xpath("//span[text()='Next']")).click();

		try {
			driver.findElement(By.cssSelector("input[name='password']")).sendKeys("rajkumar888");
			driver.findElement(By.xpath("//span[text()='Next']")).click();
		} catch (Exception e) {
			driver.findElement(By.xpath("//span[text()='Try again']")).click();
		}
		

		

//		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		long end_time = System.currentTimeMillis();
		
		System.out.println("Total time taken "+((end_time-start_time)/1000.0));
		
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
