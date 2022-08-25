package alertDemo;

import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsDemo2 {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Begining of program......................." + new Date());
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String url = "https://demoqa.com/browser-windows";
		driver.get(url);

		String mainwindow = driver.getWindowHandle();

		Set<String> setofwidnows = driver.getWindowHandles();
		System.out.println(setofwidnows.size());

		driver.findElement(By.id("tabButton")).click();

		setofwidnows = driver.getWindowHandles();
		System.out.println(setofwidnows.size());

		driver.findElement(By.id("tabButton")).click();

		setofwidnows = driver.getWindowHandles();
		System.out.println(setofwidnows.size());

		driver.findElement(By.id("windowButton")).click();

		setofwidnows = driver.getWindowHandles();
		System.out.println(setofwidnows.size());

		Iterator<String> iter = setofwidnows.iterator();

		while (iter.hasNext()) {
			String winid = iter.next();
			driver.switchTo().window(winid);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println(winid);
		}

		Thread.sleep(5000);
		System.out.println("=============================================");
		// System.out.println(driver.getTitle());
		// System.out.println(driver.getCurrentUrl());
		// driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
