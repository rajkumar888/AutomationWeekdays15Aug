package com.seleniumdemo.day2;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownBootStrap {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.println("Begining of program......................." + new Date());
		Runtime.getRuntime().exec("taskkill /IM chromedriver");
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		String url = "http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html";
		driver.get(url);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.cssSelector("#menu1")).click();

		Thread.sleep(2000);

		List<WebElement> listOfOptions = driver.findElements(By.xpath("//li/a[@role='menuitem']"));

		for (WebElement option : listOfOptions) {
			System.out.println(option.getText()+"........................");
		}
		
		
		for (WebElement option : listOfOptions) {
			if (option.getText().equals("JavaScript")) {
				option.click();
				break;
			}
		}

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		Thread.sleep(5000);
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
