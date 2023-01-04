package alertDemo;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemoPrompt2 {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Begining of program......................." + new Date());
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		String url = "file:///C:/Users/Training/Desktop/test.html";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.xpath("//button[text()='Try it']")).click();

		Alert alert = driver.switchTo().alert();

		if (alert != null) {

			System.out.println(alert.getText()+"..................");
			alert.sendKeys("selenium....demo...");
			Thread.sleep(5000);
			alert.accept();
		}

		WebElement message = driver.findElement(By.xpath("//p[@id='demo']"));
		
		System.out.println(message.isDisplayed()+".........................");
		System.out.println(message.getText()+".........................");
		
		Thread.sleep(5000);
		System.out.println("=============================================");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
