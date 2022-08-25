package com.demo.fileuploaddemo;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.println("Begining of program......................." + new Date());
//		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");

		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();

		String url = "http://demo.guru99.com/test/upload/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebElement fileupload = driver.findElement(By.cssSelector("#uploadfile_0"));
		
//		System.out.println(fileupload.getAttribute("namfjjfjfje"));
		
//		driver.switchTo().alert().accept();
		
		

		String filepath = "C:/Users/Training/Desktop/Selenium-Reading-Material.pdf";
		fileupload.sendKeys(filepath);

		Thread.sleep(5000);

		driver.findElement(By.cssSelector("#terms")).click();

		driver.findElement(By.cssSelector("#submitbutton")).click();
		Thread.sleep(5000);

		WebElement confirmationTextEle = driver
				.findElement(By.xpath("//center[contains(.,'has been successfully uploaded.')]"));
		System.out.println(confirmationTextEle.isDisplayed());

		driver.quit();
		System.out.println("End of program......................." + new Date());

	}

}
