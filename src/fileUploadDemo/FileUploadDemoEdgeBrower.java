package fileUploadDemo;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FileUploadDemoEdgeBrower {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.println("Begining of program......................." + new Date());
		System.setProperty("webdriver.edge.driver", "D:/Project/BrowserDriver/msedgedriver.exe");
		
		
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		String url = "http://demo.guru99.com/test/upload/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		
		String filepath = "C:/Users/Training/Desktop/Selenium-Reading-Material.pdf";
		WebElement fileupload = driver.findElement(By.cssSelector("#uploadfile_0"));
		fileupload.sendKeys(filepath);

		Thread.sleep(5000);

		driver.findElement(By.cssSelector("#terms")).click();
		
		driver.quit();
		System.out.println("End of program......................." + new Date());

	}

}
