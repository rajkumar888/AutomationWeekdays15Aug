package seleniumdemoday1;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSourceDemo {

	public static void main(String[] args) throws IOException, InterruptedException  {
		System.out.print("Start of the Program.........."+new Date());
		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		String url = "https://www.facebook.com/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));  // global wait or implicit wait
		
//		System.out.println(driver.getPageSource());
//		System.out.println(driver.getPageSource().contains("Copyright The Closure Library Authors."));
//		System.out.println(driver.getWindowHandle());
		
		WebElement emailid = driver.findElement(By.cssSelector("#email"));
		
		emailid.sendKeys("HelloWorld");
		Thread.sleep(2000);
		emailid.clear();
		emailid.sendKeys("Welcome");
		Thread.sleep(2000);
		emailid.clear();
		emailid.sendKeys("Computer");
		Thread.sleep(2000);
		emailid.clear();
		
		Thread.sleep(5000);
		System.out.println("===================================================");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.print("End of the Program.........."+new Date());
	}
}
