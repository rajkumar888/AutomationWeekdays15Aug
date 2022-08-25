package com.seleniumdemo.day1;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDemo {

	public static void main(String[] args) throws InterruptedException, IOException  {
		System.out.print("Start of the Program.........."+new Date());
		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");
		
		
		System.setProperty("webdriver.chrome.driver", "./BrowserDriver/chromedriver.exe");
		
		
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		String url = "https://www.google.com/";
		driver.get(url);
		
		
		
		
		//implicit wait for page and elements synchronization 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println("===================================================");
		
		
		driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);

		
		
//		List<WebElement> allh3links = driver.findElements(By.xpath("//h3[contains(text(),'news') or contains(text(),'News')]"));
//		
//		
//		System.out.println(allh3links.size());
//		
//		
//		for(int i=0; i<allh3links.size() ; i++){
//			
//			System.out.println(allh3links.get(i).getText()+" ........");
//			
//			allh3links.get(i).click();
//			System.out.println(driver.getTitle());
//			System.out.println(driver.getCurrentUrl());
//			driver.navigate().back();
//			allh3links = driver.findElements(By.xpath("//h3[contains(text(),'news') or contains(text(),'News')]"));
//		}
//		
		
		
		
		
		
		
		Thread.sleep(5000);
		System.out.println("===================================================");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.print("End of the Program.........."+new Date());
	}
}
