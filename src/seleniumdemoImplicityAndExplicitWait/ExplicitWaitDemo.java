package seleniumdemoImplicityAndExplicitWait;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.println("Begining of program......................." + new Date());
		Runtime.getRuntime().exec("taskkill /IM chromedriver");

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		
		// launch Chrome and redirect it to the Base URL
		driver.get("https://demo.guru99.com/test/guru99home/" );
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		String eTitle = "Demo Guru99 Page";
		String aTitle = "" ;
		
		
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		WebElement guru99seleniumlink = wait
										.until(ExpectedConditions
												.visibilityOfElementLocated(By.xpath("//a[@href='https://www.guru99.com/']/img")));
		
		guru99seleniumlink.click();
		
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
