package seleniumCrossBrowserDemo;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GoogleSearchDemoIE {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.out.println("Begining of program......................." + new Date());
		System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe");

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
//		capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		WebDriver driver = new InternetExplorerDriver(capabilities);
		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String url = "https://www.google.com/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		

		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("DevLabsalliance.com",
				Keys.ENTER);

		Thread.sleep(5000);
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}
}
