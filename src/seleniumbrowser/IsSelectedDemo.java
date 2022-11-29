package seleniumbrowser;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedDemo {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Begining of program......................." + new Date());
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "http://demo.guru99.com/test/radio.html";
		driver.get(url);

		
		WebElement  radioOption2 = driver.findElement(By.xpath("//input[@value='Option 2']"));
		
		System.out.println("........................Before clicking");
		System.out.println(radioOption2.isDisplayed());
		System.out.println(radioOption2.isEnabled());
		System.out.println(radioOption2.isSelected());
		radioOption2.click();
		System.out.println("........................After clicking");
		System.out.println(radioOption2.isDisplayed());
		System.out.println(radioOption2.isEnabled());
		System.out.println(radioOption2.isSelected());
		
		
		Thread.sleep(5000);
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
