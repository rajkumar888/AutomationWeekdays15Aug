package actionsDemo;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSEDemo4 {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.println("Begining of program......................." + new Date());
				
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String url = "http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html";
		driver.get(url);
		
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='MIT License']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
		
		js.executeScript("history.go(0)");
		System.out.println(js.executeScript("return document.title;").toString());
		
		
		Thread.sleep(5000);
		System.out.println("=============================================");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
//		driver.quit();
//		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");
//		Runtime.getRuntime().exec("notepad.exe");
		System.out.println("End of program......................." + new Date());
	}

}
