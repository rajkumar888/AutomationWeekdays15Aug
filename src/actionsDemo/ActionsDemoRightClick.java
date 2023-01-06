package actionsDemo;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemoRightClick {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.println("Begining of program......................." + new Date());
		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String url = "https://www.facebook.com/";
		driver.get(url);
		
		Actions actions = new Actions(driver);
		
		//img[contains(@class,'fb_logo')]
		
		
		WebElement fblogo = driver.findElement(By.xpath("//img[contains(@class,'fb_logo')]"));
		
		actions
		.moveToElement(fblogo)
		.pause(Duration.ofSeconds(2))
		.contextClick()
		.sendKeys(Keys.ARROW_DOWN)
		.pause(Duration.ofSeconds(2))
		.sendKeys(Keys.ARROW_DOWN)
		.pause(Duration.ofSeconds(2))
		.sendKeys(Keys.RETURN)
		.perform();
		
		
//		WebElement txtUsername = driver.findElement(By.id("email"));
//
//		actions
//		.moveToElement(txtUsername)
//		.pause(Duration.ofSeconds(2))
//		.click()
//		.pause(Duration.ofSeconds(2))
//				.keyDown(txtUsername, Keys.SHIFT)
//				.pause(Duration.ofSeconds(2))
//				.sendKeys(txtUsername, "hello world")
//				.pause(Duration.ofSeconds(2))
//				.keyUp(txtUsername, Keys.SHIFT)
//				.pause(Duration.ofSeconds(2))
//				.doubleClick(txtUsername)
//				.pause(Duration.ofSeconds(2))
//				.contextClick()
//				.perform();

//		WebElement forgottenpasswordLink = driver.findElement(By.linkText("Forgotten password?"));
//		WebElement marketplaceLink = driver.findElement(By.linkText("Marketplace"));
//
//		actions
//		.keyDown(Keys.CONTROL)
//		.click(forgottenpasswordLink)
//		.pause(Duration.ofSeconds(2))
//		.click(marketplaceLink)
//		.keyUp(Keys.CONTROL)
//		.build().perform();
//
//		Set<String> allwinIds = driver.getWindowHandles();
//		System.out.println(allwinIds.size());
//
//		for (String id : allwinIds) {
//			driver.switchTo().window(id);
//
//			System.out.println(driver.getTitle());
//			System.out.println(driver.getCurrentUrl());
//			Thread.sleep(2000);
//			System.out.println();
//		}

		Thread.sleep(5000);
		System.out.println("=============================================");
		// System.out.println(driver.getTitle());
		// System.out.println(driver.getCurrentUrl());
//		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
