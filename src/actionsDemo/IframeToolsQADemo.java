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

public class IframeToolsQADemo {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.println("Begining of program......................." + new Date());
		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String url = "https://demoqa.com/frames";
		driver.get(url);
		
		
		driver.switchTo().frame("frame1");
		
//		driver.switchTo().frame(0);
		
//		WebElement frameElement = driver.findElement(By.id("frame1"));
//		driver.switchTo().frame(frameElement);
		
		
		WebElement header = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		
		System.out.println(header.getText()+"------------------------------");
		
		driver.switchTo().defaultContent();
		
		

		Thread.sleep(5000);
		System.out.println("=============================================");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.println("End of program......................." + new Date());

		
	}

}
