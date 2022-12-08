package seleniumbrowser;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeDemo {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.println("Begining of program......................." + new Date());
		Runtime.getRuntime().exec("taskkill /IM chromedriver");

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String url = "https://www.facebook.com/";

		driver.get(url);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		
		System.out.println(email.getAttribute("class"));
		System.out.println(email.getAttribute("type"));
		System.out.println(email.getAttribute("placeholder"));
		System.out.println(email.getAttribute("name"));
		System.out.println(email.getAttribute("tabindex"));
		
		
		


		Thread.sleep(5000);
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
