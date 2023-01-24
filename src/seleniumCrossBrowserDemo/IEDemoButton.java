package seleniumCrossBrowserDemo;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class IEDemoButton {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.print("Start of the Program.........." + new Date());
		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");
		
		System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe");
//		
//		WebDriverManager.iedriver().setup();
		
		InternetExplorerOptions capabilities= new InternetExplorerOptions();
        capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
        capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
//        capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
//		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//		capabilities.setCapability(CapabilityType.BROWSER_VERSION, "11");
//		capabilities.setCapability("ignoreProtectedModeSettings", true);
//		capabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        
        
		WebDriver driver = new InternetExplorerDriver(capabilities);
		
		driver.manage().window().maximize();
		
		
		String url = "https://www.firstflight.com.sg/";
		driver.get(url);
		
		WebElement  trackButton = driver.findElement(By.xpath("//input[@value='Track']"));
//		trackButton.submit();
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2000)");  
		jse.executeScript("arguments[0].click();", trackButton);
		
		
		Thread.sleep(5000);
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
