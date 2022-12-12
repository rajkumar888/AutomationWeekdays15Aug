package seleniumbrowser;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysDemoFaceBook {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.println("Begining of program......................." + new Date());
		Runtime.getRuntime().exec("taskkill /IM chromedriver");

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		String url = "https://www.facebook.com/";
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		

		WebElement  userid = driver.findElement(By.cssSelector("input[name='email']"));
		userid.clear();
		userid.sendKeys("Selenium");
		
		WebElement  password = driver.findElement(By.cssSelector("input[name='pass']"));
		password.clear();
		password.sendKeys("Selenium");
		
		WebElement  loginbutton = driver.findElement(By.cssSelector("button[name='login']"));
//		loginbutton.submit();
		loginbutton.click();
		Thread.sleep(10000);
	
		WebElement  errormessage = driver.findElement(By.xpath("//*[contains(text(),'The password that you')]"));
		
		System.out.println(errormessage.isDisplayed()+" ..................");
		
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
