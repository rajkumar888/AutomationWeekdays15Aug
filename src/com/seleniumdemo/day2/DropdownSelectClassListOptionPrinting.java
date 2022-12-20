package com.seleniumdemo.day2;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelectClassListOptionPrinting {

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

		WebElement elemonth = driver.findElement(By.cssSelector("#month"));

		Select month = new Select(elemonth);

		List<WebElement> alloptions = month.getOptions();

		for (WebElement opt : alloptions) {
			System.out.println(opt.getText());
		}

		Thread.sleep(5000);
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
