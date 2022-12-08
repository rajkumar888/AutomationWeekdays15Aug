package seleniumbrowser;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCSSValueDemo {

	public static void main(String[] args) throws IOException, InterruptedException  {
		System.out.println("Begining of program......................." + new Date());
		Runtime.getRuntime().exec("taskkill /IM chromedriver");

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String url = "https://www.facebook.com/";

		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));  // global wait or implicit wait

		WebElement headerElement = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect')]"));
		
		System.out.println(headerElement.getCssValue("color"));
		System.out.println(headerElement.getCssValue("font-size"));
		System.out.println(headerElement.getCssValue("font-weight"));
		System.out.println(headerElement.getCssValue("letter-spacing"));
		System.out.println(headerElement.getCssValue("background-color"));
		System.out.println(headerElement.getCssValue("border-bottom-color"));
		System.out.println(headerElement.getCssValue("border-bottom-width"));
		
		
		Thread.sleep(5000);
		System.out.println("===================================================");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.print("End of the Program.........."+new Date());
	}
}
