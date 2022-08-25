package com.seleniumdemo.day1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserLaunching {

	public static void main(String[] args) throws InterruptedException, IOException  {

		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		String url = "https://www.selenium.dev/downloads/";
		driver.get(url);

		Thread.sleep(5000);
		driver.quit();
	}
}
