package actionsDemo;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IframeSelectableDemo {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.println("Begining of program......................." + new Date());
		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String url = "https://jqueryui.com/selectable/";
		driver.get(url);
		Actions actions = new Actions(driver);

//		driver.switchTo().frame(0);
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frameElement);
		
		
		List<WebElement> allItems = driver.findElements(By.xpath("//li[contains(text(),'Item')]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);", allItems.get(0));

		for (int i = 0; i < allItems.size(); i=i+2) {
			actions.keyDown(Keys.CONTROL)
			.click(allItems.get(i))
			.pause(Duration.ofSeconds(2))
			.perform();
		}
		
		actions.keyUp(Keys.CONTROL).build().perform();
		
//		Thread.sleep(5000);
//		for (int i = 0; i < allItems.size(); i++) {
//			actions.keyDown(Keys.CONTROL)
//			.click(allItems.get(i))
//			.pause(Duration.ofSeconds(2))
//			.perform();
//		}
		
		actions.keyUp(Keys.CONTROL).build().perform();
		
		driver.switchTo().defaultContent();
		
		

		Thread.sleep(5000);
		System.out.println("=============================================");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.println("End of program......................." + new Date());

		// WebElement page = driver.findElement(By.tagName("html"));
		// page.sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
		// page.sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
		// WebElement item1 = driver.findElement(By.xpath("//li[text()='Item
		// 1']"));
		// WebElement item3 = driver.findElement(By.xpath("//li[text()='Item
		// 3']"));
		// WebElement item5 = driver.findElement(By.xpath("//li[text()='Item
		// 5']"));
		// WebElement item7 = driver.findElement(By.xpath("//li[text()='Item
		// 7']"));

		// actions.sendKeys(Keys.CONTROL,Keys.SUBTRACT)
		// .pause(Duration.ofSeconds(2))
		// .sendKeys(Keys.CONTROL,Keys.SUBTRACT)
		// .build().perform();

	}

}
