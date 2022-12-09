package seleniumbrowser;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedDemo {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.println("Begining of program......................." + new Date());
		Runtime.getRuntime().exec("taskkill /IM chromedriver");

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String url = "https://www.firstflight.com.sg/";
		driver.get(url);

		WebElement trackButton = driver.findElement(By.xpath("//input[@value='Track']"));

		System.out.println(trackButton.isDisplayed());
		System.out.println(trackButton.isEnabled());

		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
