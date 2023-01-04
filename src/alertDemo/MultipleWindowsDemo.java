package alertDemo;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsDemo {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.println("Begining of program......................." + new Date());
		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		
		String url = "https://demoqa.com/browser-windows";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String mainwindow_id = driver.getWindowHandle();
		
		System.out.println(mainwindow_id+" ...................");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		System.out.println("=======================================");
		
		Set<String> setofwidnows = driver.getWindowHandles();
		System.out.println(setofwidnows.size());
		System.out.println(setofwidnows+" ...................");
		
		driver.switchTo().window(mainwindow_id);
		
		driver.findElement(By.id("tabButton")).click();
		
		setofwidnows = driver.getWindowHandles();
		
		System.out.println(setofwidnows.size());
		System.out.println(setofwidnows+" ...................");
		System.out.println("=======================================");
		
		
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		
//		System.out.println("=======================================");
//		
//		
//		for(String win_id:setofwidnows)
//		{
//			if(win_id!=mainwindow_id) {
//				driver.switchTo().window(win_id);
//			}
//		}
//		
//		System.out.println("=======================================");
//		System.out.println(driver.getTitle()+"..........................");
//		System.out.println(driver.getCurrentUrl()+"..........................");
		
		System.out.println("=======================================");
	
		driver.switchTo().window(mainwindow_id);
		driver.findElement(By.id("windowButton")).click();
		
		setofwidnows = driver.getWindowHandles();
		System.out.println(setofwidnows.size());
		System.out.println("=======================================");
	
		driver.switchTo().window(mainwindow_id);
		driver.findElement(By.id("messageWindowButton")).click();
		setofwidnows = driver.getWindowHandles();
		System.out.println(setofwidnows.size());
		System.out.println("=======================================");


//		for( String  winid :setofwidnows){
//			
//			System.out.println(setofwidnows.size()+"............currently opened windows size");
//			System.out.println(winid+"..................");
//			driver.switchTo().window(winid);
//			driver.manage().window().maximize();
//			Thread.sleep(2000);
//			
////			System.out.println(driver.getTitle()+"...............");
////			System.out.println(driver.getCurrentUrl()+"...............");
//			
//		}
//		
//		
	for( String  winid :setofwidnows){
		
			if(!winid.equalsIgnoreCase(mainwindow_id)){
				Thread.sleep(2000);
				driver.switchTo().window(winid);
				driver.close();
				setofwidnows=driver.getWindowHandles();
				
			}
			
			System.out.println("count of opened windows "+setofwidnows.size());
		}
		
		

		Thread.sleep(5000);
		System.out.println("=============================================");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
