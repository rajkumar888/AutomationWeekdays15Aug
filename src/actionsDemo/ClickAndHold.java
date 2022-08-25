package actionsDemo;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Begining of program......................." + new Date());
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String url = "https://selenium08.blogspot.com/2020/01/click-and-hold.html";
		driver.get(url);
		Actions actions = new Actions(driver);

		// Locate the element C by By.xpath.
		WebElement titleA = driver.findElement(By.xpath("//li[text()= 'A']"));
		WebElement titleG = driver.findElement(By.xpath("//li[text()= 'G']"));

		// Call clickAndHold() method to perform click and hold operation on
		// element C.
		actions
		.clickAndHold(titleA)
		.moveToElement(titleG)
		.pause(Duration.ofSeconds(2))
		.pause(Duration.ofSeconds(2))
		.release()
		.build().perform();

		Thread.sleep(5000);
		System.out.println("=============================================");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
//		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
