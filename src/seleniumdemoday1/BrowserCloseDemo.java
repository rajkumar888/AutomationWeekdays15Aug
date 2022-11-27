package seleniumdemoday1;

import java.awt.Dimension;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCloseDemo {

	public static void main(String[] args) throws InterruptedException, IOException  {
		System.out.print("Start of the Program.........."+new Date());
		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		org.openqa.selenium.Dimension dim = driver.manage().window().getSize();
		
		
		System.out.println(dim.getHeight());
		System.out.println(dim.getWidth());
		
		
		driver.manage().window().maximize();
		dim = driver.manage().window().getSize();
		
		System.out.println(dim.getHeight());
		System.out.println(dim.getWidth());
		
		String url = "https://www.selenium.dev/";
//		driver.get(url);
		
		driver.navigate().to(url);
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println("===================================================");
		
//		// page -> webelement - > action
		driver.findElement(By.xpath("//a//span[text()='Downloads']")).click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println("===================================================");
//		
		driver.navigate().back();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println("===================================================");
//		
		driver.navigate().forward();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println("===================================================");
//		
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println("===================================================");
		

		Thread.sleep(5000);
		driver.close();
		driver.quit();
		
		
		System.out.print("End of the Program.........."+new Date());
	}
}
