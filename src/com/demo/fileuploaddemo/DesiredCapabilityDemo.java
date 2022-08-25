package com.demo.fileuploaddemo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilityDemo {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.println("Begining of program......................." + new Date());
		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");

		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");

		DesiredCapabilities caps = new DesiredCapabilities();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito"); // ChromeOptions for starting chrome
											// in incognito mode
		options.addArguments("start-maximized");
		options.addArguments("incognito");
		options.addArguments("disable-infobars");
//		options.addArguments("--ignore-certificate-errors");
		options.addArguments("--mute-audio");
//		options.addExtensions(new File("D:/EveningWS/MorningDevLabs/crxdemo/extension_3_1_2_0.crx"));
		// options.addArguments("version");
		// options.addArguments("headless");
//		options.setAcceptInsecureCerts(true);

		// desrired capabilites settings
		caps.setCapability(ChromeOptions.CAPABILITY, options);
		// other capability declarations
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "latest");
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
//		caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		

		WebDriver driver = new ChromeDriver(caps);
		SimpleDateFormat dateformat = new SimpleDateFormat("E dd_MMM_yyyy HH_mm_ss");

		String url = "https://revoked.badssl.com";
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("CertificateWarningController.visitInsecureWebsiteWithTemporaryBypass()");

		File srcfilename = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String filename = dateformat.format(new Date());
		File destinationFileName = new File("D:/EveningWS/MorningDevLabs/screenshot/" + filename + ".png");
//		Files.copy(srcfilename, destinationFileName);

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		Thread.sleep(10000);
		// driver.quit();
		System.out.println("End of program......................." + new Date());

	}

}
