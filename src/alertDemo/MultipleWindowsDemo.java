package alertDemo;

import java.time.Duration;
import java.util.Date;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsDemo {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Begining of program......................." + new Date());
		System.setProperty("webdriver.chrome.driver", "./BrowserDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String url = "https://demoqa.com/browser-windows";
		driver.get(url);
		
		String mainwindowid = driver.getWindowHandle();
		
		System.out.println(mainwindowid+" ...................");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
		
		Set<String> setofwidnows = driver.getWindowHandles();
		System.out.println(setofwidnows.size());
		System.out.println(setofwidnows+" ...................");
		
		driver.switchTo().window(mainwindowid);
		driver.findElement(By.id("tabButton")).click();
		setofwidnows = driver.getWindowHandles();
		System.out.println(setofwidnows.size());
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(mainwindowid);
		driver.findElement(By.id("windowButton")).click();
		setofwidnows = driver.getWindowHandles();
		System.out.println(setofwidnows.size());
		
		driver.switchTo().window(mainwindowid);
		driver.findElement(By.id("messageWindowButton")).click();
		setofwidnows = driver.getWindowHandles();
		System.out.println(setofwidnows.size());

		
		
		
		
	
//		for( String  winid :setofwidnows){
//			
//			System.out.println(setofwidnows.size()+"............currently opened windows size");
//			driver.switchTo().window(winid);
//			System.out.println(driver.getTitle());
//			System.out.println(driver.getCurrentUrl());
//			
//		}
		
		
	for( String  winid :setofwidnows){
			
			
			if(!winid.equalsIgnoreCase(mainwindowid)){
				Thread.sleep(2000);
				driver.switchTo().window(winid);
				driver.close();
//				setofwidnows=driver.getWindowHandles();
			}
		}
		
		

		Thread.sleep(5000);
		System.out.println("=============================================");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
