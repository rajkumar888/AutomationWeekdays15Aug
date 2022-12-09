package seleniumbrowser;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDimensionOfWidnow {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.println("Begining of program......................." + new Date());
		Runtime.getRuntime().exec("taskkill /IM chromedriver");

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String url = "https://www.facebook.com/";

		driver.get(url);
		
		System.out.println(driver.manage().window().getSize());
		System.out.println(driver.manage().window().getSize().getWidth());
		System.out.println(driver.manage().window().getSize().getHeight());
		System.out.println("===================================================");
		
		Thread.sleep(5000);
		driver.manage().window().setSize(new Dimension(500, 400));
		
		System.out.println(driver.manage().window().getSize());
		System.out.println(driver.manage().window().getSize().getWidth());
		System.out.println(driver.manage().window().getSize().getHeight());
		System.out.println("===================================================");
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		System.out.println(driver.manage().window().getSize());
		System.out.println(driver.manage().window().getSize().getWidth());
		System.out.println(driver.manage().window().getSize().getHeight());


		Thread.sleep(5000);
		System.out.println("===================================================");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
