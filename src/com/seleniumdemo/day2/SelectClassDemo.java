package com.seleniumdemo.day2;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDemo {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.println("Begining of program......................." + new Date());
		Runtime.getRuntime().exec("taskkill /IM chromedriver");

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String url = "https://www.facebook.com/";
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();

		WebElement elementday = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select day = new Select(elementday);
		
//		day.selectByIndex(0);
//		Thread.sleep(2000);
//		day.selectByIndex(30);
		
//		day.selectByVisibleText("5");
//		Thread.sleep(2000);
//		day.selectByVisibleText("20");
		
		day.selectByValue("18");
		Thread.sleep(2000);
		day.selectByValue("25");
		
		Thread.sleep(2000);
		
		WebElement elemonth = driver.findElement(By.cssSelector("#month"));
			
		Select month = new Select(elemonth);
		
//		month.selectByIndex(0);
//		Thread.sleep(2000);
//		month.selectByIndex(11);
//		Thread.sleep(2000);
//		month.selectByIndex(5);
//		
//		month.selectByVisibleText("Mar");
//		Thread.sleep(2000);
//		month.selectByVisibleText("Nov");	
//		
		month.selectByValue("1");
		Thread.sleep(2000);
		month.selectByValue("12");
//		
//		
		WebElement eleyear = driver.findElement(By.cssSelector("#year"));
		
		Select year= new Select(eleyear);
		
//		year.selectByVisibleText("2001");
		Thread.sleep(2000);
		
		year.selectByVisibleText("1999");
		Thread.sleep(2000);
		year.selectByIndex(0);
		Thread.sleep(2000);
		year.selectByIndex(year.getOptions().size()-1);
		
		
		Thread.sleep(5000);
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
