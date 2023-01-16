package seleniumCrossBrowserDemo;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchDemoEDGE {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.println("Begining of program......................." + new Date());
		Runtime.getRuntime().exec("taskkill /F /T /IM msedgedriver.exe");

		System.setProperty("webdriver.edge.driver", "./Driver/msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		String url = "https://www.google.com/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		

		driver.findElement(By.cssSelector("input[name='q'][title='Search']")).sendKeys("DevLabsalliance.com",
				Keys.ENTER);

		Thread.sleep(5000);
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}
}
