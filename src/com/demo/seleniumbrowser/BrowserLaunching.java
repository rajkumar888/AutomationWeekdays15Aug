package com.demo.seleniumbrowser;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunching {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.out.println("Begining of program......................."+new Date());
		
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		
		
//		ChromeDriver driver=new ChromeDriver();
		
//		Runtime.getRuntime().exec("taskkill /IM chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String url="https://www.devlabsalliance.com/";
		
		driver.navigate().to("https://www.devlabsalliance.com/");
		
//		driver.get(url);
		Thread.sleep(5000);
//		driver.navigate().refresh();
		driver.findElement(By.linkText("TRAINING")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		
		driver.close();
		
		driver.quit();
		
		driver.quit();
		
		
		
		
		System.out.println("End of program......................."+new Date());

	}

}
