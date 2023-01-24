package seleniumCrossBrowserDemo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class InternetExplorerDemo {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.println("Begining of program......................." + new Date());
		System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe");

		InternetExplorerOptions capabilities = new InternetExplorerOptions();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
//		capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);

		WebDriver driver = new InternetExplorerDriver(capabilities);

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		String url = "http://demo.guru99.com/test/upload/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		File filepath = new File("C:\\Users\\Training\\Desktop\\Study Materials\\VVI Selenium-Reading-Material.pdf");
		String filepathnew = filepath.getAbsolutePath();
		WebElement fileupload = driver.findElement(By.cssSelector("#uploadfile_0"));
		fileupload.sendKeys(filepathnew);

		Thread.sleep(5000);

		driver.findElement(By.cssSelector("#terms")).click();
		Thread.sleep(5000);

		driver.quit();
		System.out.println("End of program......................." + new Date());

	}

}
