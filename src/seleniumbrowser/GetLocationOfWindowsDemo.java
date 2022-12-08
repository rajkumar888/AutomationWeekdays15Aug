package seleniumbrowser;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationOfWindowsDemo {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.println("Begining of program......................." + new Date());
		Runtime.getRuntime().exec("taskkill /IM chromedriver");

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();

		String url = "https://www.facebook.com/";

		driver.get(url);
		
		
		System.out.println(driver.manage().window().getPosition());
		

		
		Thread.sleep(5000);
		driver.manage().window().setPosition(new Point(100,10));
		System.out.println(driver.manage().window().getPosition());
		
		Thread.sleep(5000);
		driver.manage().window().maximize();
	
		System.out.println(driver.manage().window().getPosition());

		Thread.sleep(5000);
		System.out.println("===================================================");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
