package actionsDemo;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Begining of program......................." + new Date());
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String url = "https://www.way2automation.com/";
		driver.get(url);


		Actions actions = new Actions(driver);
		
		WebElement allcourseElement = driver.findElement(By.xpath("//span[text()='All Courses']"));
		WebElement seleniumMenu = driver.findElement(By.xpath("//span[text()='Selenium']"));
		WebElement seleniumJavaMenu= driver.findElement(By.xpath("//span[text()='Selenium with Java']"));
		
		
		actions
		.moveToElement(allcourseElement)
		.pause(Duration.ofSeconds(2))
		.moveToElement(seleniumMenu)
		.pause(Duration.ofSeconds(2))
		.click(seleniumJavaMenu)
		.build()
		.perform();
		
		WebElement headerText = driver.findElement(By.xpath("//h1[contains(text(),'Selenium Training Online')]"));
		System.out.println(headerText.isDisplayed());
		
		Thread.sleep(5000);
		System.out.println("=============================================");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
