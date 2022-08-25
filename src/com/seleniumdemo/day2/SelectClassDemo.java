package com.seleniumdemo.day2;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDemo {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Begining of program......................." + new Date());
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.facebook.com/";
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.findElement(By.cssSelector("a[id*='u_0_2_']")).click();

		WebElement elementday = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select day = new Select(elementday);
		
		
		day.selectByIndex(0);
		Thread.sleep(2000);
//		day.selectByIndex(30);
		
//		day.selectByVisibleText("1");
//		Thread.sleep(2000);
//		day.selectByVisibleText("20");
		
//		day.selectByValue("18");
//		Thread.sleep(2000);
//		day.selectByValue("25");
		
		WebElement elemonth = driver.findElement(By.cssSelector("#month"));
//				
		Select month = new Select(elemonth);
		
//		month.selectByIndex(0);
//		Thread.sleep(2000);
//		month.selectByIndex(11);
		
		month.selectByVisibleText("Mar");
		Thread.sleep(2000);
//		month.selectByVisibleText("Nov");	
		
//		month.selectByValue("1");
//		Thread.sleep(2000);
//		month.selectByValue("12");
		
		
		WebElement eleyear = driver.findElement(By.cssSelector("#year"));
		
		Select year= new Select(eleyear);
		
		year.selectByVisibleText("2001");
//		Thread.sleep(2000);
//		year.selectByVisibleText("1999");
		
		
		Thread.sleep(5000);
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
