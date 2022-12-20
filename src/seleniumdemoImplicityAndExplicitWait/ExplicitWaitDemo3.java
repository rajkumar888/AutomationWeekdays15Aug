package seleniumdemoImplicityAndExplicitWait;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo3 {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Begining of program......................." + new Date());
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		

		driver.get("https://google.com/ncr");
		
		
		
		// Initialize and wait till element(link) became clickable - timeout in 10 seconds
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
//	
		
		WebElement firstelementOther=wait
				.until(driver1 -> driver1.findElement(By.name("q")));
		
		firstelementOther.sendKeys("cheese" + Keys.ENTER);
		
		
		WebElement firstelement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));
		// Print the first result
		System.out.println(firstelement.getText());
		
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
