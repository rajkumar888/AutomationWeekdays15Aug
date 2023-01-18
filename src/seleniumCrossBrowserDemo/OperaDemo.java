package seleniumCrossBrowserDemo;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class OperaDemo {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.print("Start of the Program.........." + new Date());
		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");
//		WebDriverManager.operadriver().setup();

////		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
////		System.setProperty("webdriver.ie.driver", "./drivers/geckodriver.exe");
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
////		System.setProperty("webdriver.edge.driver", "./drivers/geckodriver.exe");
		
		WebDriver driver = new OperaDriver();
		
		driver.manage().window().maximize();
		String url = "https://www.firstflight.com.sg/";
		driver.get(url);
		
		WebElement  trackButton = driver.findElement(By.xpath("//input[@value='Track']"));
		trackButton.submit();
		
		
		Thread.sleep(5000);
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
