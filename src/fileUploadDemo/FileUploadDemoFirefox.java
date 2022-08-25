package fileUploadDemo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadDemoFirefox {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.println("Begining of program......................." + new Date());
		System.setProperty("webdriver.gecko.driver", "D:/Project/BrowserDriver/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		String url = "http://demo.guru99.com/test/upload/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		File filepath = new File("C:/Users/Training/Desktop/Selenium-Reading-Material.pdf");
		String filepathnew = filepath.getAbsolutePath();
//		String filepathnew="C:/Users/Training/Desktop/Selenium-Reading-Material.pdf";
//		String filepathnew="C:\\Users\\Training\\Desktop\\Selenium-Reading-Material.pdf";
		System.out.println(filepathnew);

		WebElement fileupload = driver.findElement(By.cssSelector("#uploadfile_0"));
		fileupload.sendKeys(filepathnew);
		
		
		
		

		Thread.sleep(5000);

		driver.findElement(By.cssSelector("#terms")).click();

		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
