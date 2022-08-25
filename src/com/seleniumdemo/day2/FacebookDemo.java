package com.seleniumdemo.day2;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookDemo {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Begining of program......................." + new Date());
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.facebook.com/";
		driver.get(url);

		
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("rajkumar888@gmail.com");
		
		
			WebElement element = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect')]"));
		
			
			System.out.println(element.getCssValue("color"));
			System.out.println(element.getCssValue("font-family"));
			System.out.println(element.getCssValue("letter-spacing"));
			System.out.println(element.getCssValue("font-weight"));
			System.out.println(element.getCssValue("font-size"));
			
			System.out.println("=========================");
			
			System.out.println(element.getLocation());
			System.out.println(element.getSize());
			System.out.println(element.getRect().getHeight());
			System.out.println(element.getRect().getWidth());
			System.out.println(element.getRect().getX());
			System.out.println(element.getRect().getY());
			System.out.println("=========================");
			
			System.out.println(element.getText());
			
			WebElement loginbutton = driver.findElement(By.name("login"));
			
			
			String expectedText = "Log In";
			
			if(loginbutton.getText().equals(expectedText)){
				System.out.println("expected and actual are matching.....");
			}else{
				throw new RuntimeException("expected and actual doesn't match");
			}
			
			
		Thread.sleep(5000);
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
