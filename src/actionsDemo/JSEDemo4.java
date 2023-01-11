package actionsDemo;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSEDemo4 {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.println("Begining of program......................." + new Date());
		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");	
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		
		String url = "http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement eleLicense = driver.findElement(By.xpath("//a[text()='MIT License']"));
		
		js.executeScript("arguments[0].scrollIntoView(true);",eleLicense);
		Thread.sleep(5000);
		js.executeScript("arguments[0].click();", eleLicense);
		
		Thread.sleep(5000);
		//page refresh
		js.executeScript("history.go(0)");
		System.out.println(js.executeScript("return document.title;").toString()+"=======");
		System.out.println(driver.getTitle()+"-----------------------");
//		
		
		Thread.sleep(5000);
		System.out.println("=============================================");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
