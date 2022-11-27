package seleniumdemoday1;

import java.awt.Dimension;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.chrome.ChromeDriver;

public class DimensionWidnowDemo {

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
		
		driver.navigate().to(url);
		
		Thread.sleep(5000);
//		driver.manage().window().setSize(new Dimension(500,400));
		
		dim = driver.manage().window().getSize();
		
		System.out.println(dim.getHeight());
		System.out.println(dim.getWidth());
		
		
		
		Thread.sleep(5000);
		driver.quit();
		
		
		System.out.print("End of the Program.........."+new Date());
	}
}
