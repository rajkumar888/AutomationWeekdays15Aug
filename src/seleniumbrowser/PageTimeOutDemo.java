package seleniumbrowser;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTimeOutDemo {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Begining of program......................." + new Date());
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		String url = "https://www.facebook.com/";
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		driver.findElement(By.id("u_0_d_mT")).click();
		
//		driver.findElement(By.xpath("//button[contains(@id,'u_0_d')]")).click();
		
		

		
		System.out.println(driver.manage().timeouts().getPageLoadTimeout().getSeconds()+" page load timeout");
		
		driver.findElement(By.cssSelector("button[id*='u_0_d_']")).click();
		
		
		
		
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
