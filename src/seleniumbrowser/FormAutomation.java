package seleniumbrowser;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormAutomation {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Begining of program......................." + new Date());
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
		driver.get(url);
		
		
		WebElement email = driver.findElement(By.id("email"));
		
		email.clear();
		email.sendKeys("abcde@gamil.com");
		
		WebElement password = driver.findElement(By.name("passwd"));
		
		password.clear();
		password.sendKeys("helloWorld!@#");

		WebElement signInButton = driver.findElement(By.name("SubmitLogin"));
		
		signInButton.click();
		
		Thread.sleep(5000);
		
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
