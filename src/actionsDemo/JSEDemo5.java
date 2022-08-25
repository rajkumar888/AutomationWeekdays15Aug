package actionsDemo;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSEDemo5 {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.println("Begining of program......................." + new Date());
				
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		String url = "https://www.softwaretestingmaterial.com/javascriptexecutor-selenium-webdriver/#h-scenario-9-to-get-the-url-of-a-webpage";
		driver.get(url);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		System.out.println(js.executeScript("return document.title;").toString());

		String sText =  js.executeScript("return document.URL;").toString();
		System.out.println(sText);
		
		
		js.executeScript("document.getElementById('Email').value='SoftwareTestingMaterial.com';");
		
		
		Thread.sleep(5000);
		System.out.println("=============================================");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		driver.quit();
//		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");
//		Runtime.getRuntime().exec("notepad.exe");
		System.out.println("End of program......................." + new Date());
	}

}
