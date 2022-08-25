package com.demo.seleniumbrowser;

import java.time.Duration;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class ExplicitWaitDemo2 {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Begining of program......................." + new Date());
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		String url = "https://www.happiness.com/";

		driver.get(url);

		// driver.findElement(By.name("regEmail")).sendKeys("warren");
		// driver.findElement(By.name("regPassword1")).sendKeys("warren");
		// driver.findElement(By.className("btn-success")).click();

		// WebDriverWait wait = new WebDriverWait(driver,
		// Duration.ofSeconds(20));
		// WebElement nameElement =
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("regEmail")));

		// nameElement.sendKeys("warren");

		Wait<WebDriver>  wait = new FluentWait<WebDriver> (driver)
				.withTimeout(Duration.ofSeconds(15))
				.pollingEvery(Duration.ofMillis(100))
				.ignoring(NoSuchElementException.class)
				.ignoring(TimeoutException.class);

		WebElement nameElementdemo =  wait.until(new Function<WebDriver, WebElement>() {
			
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.name("regEmail"));
			}
		});

		nameElementdemo.sendKeys("warren");

		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
