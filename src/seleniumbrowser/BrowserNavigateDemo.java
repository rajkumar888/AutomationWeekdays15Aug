package seleniumbrowser;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigateDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.out.println("Begining of program......................."+new Date());
		Runtime.getRuntime().exec("taskkill /IM chromedriver");
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		String url="https://www.devlabsalliance.com/";
		
		driver.navigate().to(url);
		
//		driver.get(url);
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		
		driver.findElement(By.linkText("TRAINING")).click();
		
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.navigate().forward();
		
		Thread.sleep(5000);
		
//		driver.close();
		
		driver.quit();
		
		System.out.println("End of program......................."+new Date());

	}

}
