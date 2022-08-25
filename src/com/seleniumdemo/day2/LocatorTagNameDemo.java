package com.seleniumdemo.day2;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTagNameDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");
		System.out.println("Begining of program......................." + new Date());
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.facebook.com/";
		
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println("...........................");
		
		

//		WebElement element = driver.findElement(By.tagName("h2"));
		
//		System.out.println(element.getText());
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		

		Thread.sleep(5000);
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
