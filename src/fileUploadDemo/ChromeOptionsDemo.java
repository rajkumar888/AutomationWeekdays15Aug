package fileUploadDemo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsDemo {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.println("Begining of program......................." + new Date());
		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");

		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("incognito");
		options.addArguments("disable-infobars");
		options.addArguments("--ignore-certificate-errors");
		options.addArguments("--mute-audio");
//		options.addArguments("version");
//		options.addArguments("headless");
		
		
		WebDriver driver = new ChromeDriver(options);
		SimpleDateFormat dateformat = new SimpleDateFormat("E dd_MMM_yyyy HH_mm_ss");
		
		
		String url = "https://www.facebook.com/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		File srcfilename = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String filename= dateformat.format(new Date());
		File destinationFileName = new File("D:/EveningWS/MorningDevLabs/screenshot/"+filename+".png");
//		Files.copy(srcfilename, destinationFileName);
		
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		Thread.sleep(10000);
//		driver.quit();
		System.out.println("End of program......................." + new Date());

	}

}
