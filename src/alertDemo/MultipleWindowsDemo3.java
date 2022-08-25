package alertDemo;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MultipleWindowsDemo3 {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Begining of program......................." + new Date());
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("test-type");
		options.addArguments("disable-popup-blocking");
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		
		WebDriver driver = new ChromeDriver(capabilities);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String url = "https://www.naukri.com/";
		driver.get(url);
		
		 String setofwidnows = driver.getWindowHandle();
		System.out.println(setofwidnows);
		
		
		Thread.sleep(5000);
		System.out.println("=============================================");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
