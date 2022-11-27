package seleniumdemoday1;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentLocatorsWithFindElement {

	public static void main(String[] args) throws InterruptedException, IOException  {
		System.out.print("Start of the Program.........."+new Date());
		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		String url = "http://automationpractice.com/";
		driver.get(url);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println("===================================================");
		
		
		
//		driver.findElement(By.name("search_query")).sendKeys("Dress",Keys.ENTER);
		
//		driver.findElement(By.cssSelector("input[name='search_query']")).sendKeys("Dress",Keys.ENTER);
		
//		driver.findElement(By.cssSelector("#search_query_top")).sendKeys("Dress",Keys.ENTER);
		
//		driver.findElement(By.linkText("Sign in")).click();
		
//		driver.findElement(By.partialLinkText("personal")).click();
		
		
//		List<WebElement> all_links = driver.findElements(By.tagName("a"));
//		System.out.println(all_links.size());
//		
//		
//		for(int i=0; i<all_links.size() ; i++){
//			
//			if(!all_links.get(i).getText().isEmpty()){
//				System.out.println(all_links.get(i).getText()+" ........"+all_links.get(i).getAttribute("href"));
//			}
//		}
		
		
//		List<WebElement> all_links = driver.findElements(By.xpath("//a"));
//		System.out.println(all_links.size());
//		
//		
//		for(int i=0; i<all_links.size() ; i++){
//			
//			if(!all_links.get(i).getText().isEmpty()){
//				System.out.println(all_links.get(i).getText()+" ........"+all_links.get(i).getAttribute("href"));
//			}
//		}
		
		
		List<WebElement> all_links = driver.findElements(By.cssSelector("a"));
		System.out.println(all_links.size());
		
		for(int i=0; i<all_links.size() ; i++){
			
			if(!all_links.get(i).getText().isEmpty()){
				System.out.println(all_links.get(i).getText()+" ........"+all_links.get(i).getAttribute("href"));
			}
		}
		
		
		
		
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println("===================================================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(5000);
		System.out.println("===================================================");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.print("End of the Program.........."+new Date());
	}
}
