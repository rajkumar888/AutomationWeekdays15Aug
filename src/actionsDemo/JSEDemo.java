package actionsDemo;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSEDemo {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.println("Begining of program......................." + new Date());

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String url = "https://www.way2automation.com/";
		driver.get(url);

		long start_time = System.currentTimeMillis();

		// Call executeAsyncScript() method to wait for 5 seconds
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 10000);");

		// Get the difference (currentTime - startTime) of times.
		System.out.println("Passed time: " + (System.currentTimeMillis() - start_time)/1000 + " Seconds");

		Thread.sleep(5000);
		System.out.println("=============================================");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		// Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");
		// Runtime.getRuntime().exec("notepad.exe");
		System.out.println("End of program......................." + new Date());
	}

}
