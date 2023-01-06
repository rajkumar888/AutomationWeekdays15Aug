package actionsDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemoRightClickChrome {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.out.println("Begining of program......................." + new Date());
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String url = "https://www.facebook.com/";
		driver.get(url);
		
		Actions actions = new Actions(driver);
		WebElement txtUsername = driver.findElement(By.id("email"));

		actions
		.moveToElement(txtUsername)
		.pause(Duration.ofSeconds(2))
		.click()
		.pause(Duration.ofSeconds(2))
				.keyDown(txtUsername, Keys.SHIFT)
				.pause(Duration.ofSeconds(2))
				.sendKeys(txtUsername, "hello")
				.pause(Duration.ofSeconds(2))
				.keyUp(txtUsername, Keys.SHIFT)
				.pause(Duration.ofSeconds(2))
				.doubleClick(txtUsername)
				.pause(Duration.ofSeconds(2))
				.contextClick(txtUsername)
				.pause(Duration.ofSeconds(2))
				.perform();
		
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(5000);
		System.out.println("=============================================");
		// System.out.println(driver.getTitle());
		// System.out.println(driver.getCurrentUrl());
//		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
