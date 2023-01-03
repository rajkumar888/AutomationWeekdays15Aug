package seleniumdemoImplicityAndExplicitWait;

import java.io.IOException;
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

public class FluentWaitdemo {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.println("Begining of program......................." + new Date());
		Runtime.getRuntime().exec("taskkill /IM chromedriver");

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

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

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofMillis(100))
				.ignoring(NoSuchElementException.class)
				.ignoring(TimeoutException.class)
				.ignoring(RuntimeException.class);

		WebElement nameElementdemo = wait
				.until(new Function<WebDriver, WebElement>() 
				{
			public WebElement apply(WebDriver driver) 
			{
				return driver.findElement(By.name("regEmail"));
			}
		}
				);

		nameElementdemo.sendKeys("warren");

		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
