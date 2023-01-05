package actionsDemo;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.println("Begining of program......................." + new Date());
		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		
		String url = "https://www.way2automation.com/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		Actions actions = new Actions(driver);

		WebElement allcourseElement = driver.findElement(By.xpath("//span[text()='All Courses']"));
		WebElement seleniumMenu = driver.findElement(By.xpath("//span[text()='Selenium']"));
		WebElement seleniumJavaMenu = driver.findElement(By.xpath("//span[text()='Selenium with Java']"));

		actions
		.moveToElement(allcourseElement)
		.pause(Duration.ofSeconds(1))
		.moveToElement(seleniumMenu)
		.pause(Duration.ofSeconds(1))
		.click(seleniumJavaMenu)
		.perform();
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//i[@class='eicon-close']")).click();

		WebElement headerText = driver.findElement(By.xpath("//h1[contains(text(),'Selenium Training Online')]"));
		System.out.println(headerText.isDisplayed()+"...........................");

		Thread.sleep(5000);
		System.out.println("=============================================");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
