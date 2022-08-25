package jsedemo;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementDemo {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.println("Begining of program......................." + new Date());
		 Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String url = "https://demo.guru99.com/V4/";
		driver.get(url);
		
		driver.findElement(By.cssSelector("input[name='uid']")).sendKeys("Test");
		
		WebElement resetbutton = driver.findElement(By.cssSelector("input[name='btnReset']"));
		resetbutton.click();
		driver.navigate().refresh();
		driver.findElement(By.cssSelector("input[name='uid']")).sendKeys("Test");
		resetbutton = driver.findElement(By.cssSelector("input[name='btnReset']"));
		resetbutton.click();
		
		Thread.sleep(5000);
		System.out.println("=============================================");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
		// Runtime.getRuntime().exec("notepad.exe");
		System.out.println("End of program......................." + new Date());
	}

}
