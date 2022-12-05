package seleniumbrowser;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormAutomation {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.println("Begining of program......................."+new Date());
		Runtime.getRuntime().exec("taskkill /IM chromedriver");
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String url = "https://www.facebook.com/";
		driver.get(url);
		
		
		WebElement email = driver.findElement(By.id("email"));
		
		email.clear();
		email.sendKeys("abcde@gamil.com");
		
		
		WebElement password = driver.findElement(By.name("pass"));
//		
		password.clear();
		password.sendKeys("helloWorld!@#");
		
//		Thread.sleep(5000);
//		email.clear();
//		password.clear();
//
		WebElement LoginButton = driver.findElement(By.name("login"));
		
		LoginButton.click();
		
		Thread.sleep(5000);
		
		System.out.println("The Page url is : "+driver.getCurrentUrl());
		System.out.println("The Page Title is : "+driver.getTitle());
		Thread.sleep(5000);
//		System.out.println("The Page source is : "+driver.getPageSource());
		
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
