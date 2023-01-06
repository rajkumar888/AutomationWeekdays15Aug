package actionsDemo;

import java.time.Duration;
import java.util.Date;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemoControlClick {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Begining of program......................." + new Date());
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		String url = "https://www.facebook.com/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		String mainwindowid = driver.getWindowHandle();

		Actions actions = new Actions(driver);
		
		
		WebElement forgottenpasswordLink = driver.findElement(By.linkText("Forgotten password?"));
		WebElement marketplaceLink = driver.findElement(By.linkText("Marketplace"));
		WebElement careers = driver.findElement(By.linkText("Careers"));

		actions.keyDown(Keys.CONTROL)
		.click(forgottenpasswordLink)
		.pause(Duration.ofSeconds(2))
		.click(marketplaceLink)
		.keyUp(Keys.CONTROL)
				.pause(Duration.ofSeconds(2))
				.keyDown(Keys.SHIFT)
				.click(careers)
				.pause(Duration.ofSeconds(2))
				.keyUp(Keys.SHIFT)
				.perform();

		Thread.sleep(5000);
		Set<String> openwindowsids = driver.getWindowHandles();

		System.out.println("count of open widnows " + openwindowsids.size());

		for (String winid : openwindowsids) {
			
			if (!winid.equals(mainwindowid)) {
			
				driver.switchTo().window(winid);
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				driver.close();
			}
			
			System.out.println("=============================================");
			openwindowsids = driver.getWindowHandles();
			System.out.println("count of open widnows " + openwindowsids.size());
		}


		System.out.println("=============================================");
		// System.out.println(driver.getTitle());
		// System.out.println(driver.getCurrentUrl());
//		driver.quit();
		System.out.println("End of program......................." + new Date());

	}
	}
