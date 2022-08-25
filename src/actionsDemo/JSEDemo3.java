package actionsDemo;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSEDemo3 {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.println("Begining of program......................." + new Date());
				
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String url = "http://demo.guru99.com/V4/";
		driver.get(url);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
        WebElement btnLogin =driver.findElement(By.name("btnLogin"));			
        		
        //Login to Guru99 		
        driver.findElement(By.name("uid")).sendKeys("mngr34926");					
        driver.findElement(By.name("password")).sendKeys("amUpenu");					
        		
        //Perform Click on LOGIN button using JavascriptExecutor		
        js.executeScript("arguments[0].click();", btnLogin);
        
        driver.switchTo().alert().accept();
                                
        //To generate Alert window using JavascriptExecutor. Display the alert message 			
     
        js.executeScript("alert('Welcome to Devlabs!!!!');"); 
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
        
        
		Thread.sleep(5000);
		System.out.println("=============================================");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
//		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");
//		Runtime.getRuntime().exec("notepad.exe");
		System.out.println("End of program......................." + new Date());
	}

}
