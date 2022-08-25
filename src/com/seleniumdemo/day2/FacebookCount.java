package com.seleniumdemo.day2;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCount {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Begining of program......................." + new Date());
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.facebook.com/";
		driver.get(url);

		
//		List<WebElement> listOfWord = driver.findElements(By.xpath("//*[contains(text(),'facebook') or contains(text(),'Facebook')]"));
		
//		List<WebElement> listOfWord = driver.findElements(By.xpath("//*[contains(text(),'facebook')]"));
		List<WebElement> listOfWord = driver.findElements(By.xpath("//*[contains(text(),'Facebok')]"));
		
		System.out.println(listOfWord.size());
		System.out.println(listOfWord);
		
//		WebElement singleelement = driver.findElement(By.xpath("//*[contains(text(),'Facebok')]"));
//		
//		System.out.println(singleelement);
		
		Thread.sleep(5000);
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
