package seleniumbrowser;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("Begining of program......................." + new Date());

		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		String url = "https://www.devlabsalliance.com/";

		driver.get(url);
		
		System.out.println("Current URL  "+driver.getCurrentUrl());
		
		System.out.println("Window Id  "+driver.getWindowHandle());
		
		System.out.println("Title  "+driver.getTitle());
		
		
		
		// System.out.println(driver.getTitle());
		// List<WebElement> links = driver.findElements(By.xpath("//a"));
		// List<WebElement> links = driver.findElements(By.tagName("a"));
		// List<WebElement> links = driver.findElements(By.cssSelector("a"));

		// System.out.println(links.size());

		// List<WebElement> words =
		// driver.findElements(By.xpath("//*[contains(text(),'live')]"));

		// List<WebElement> words =
		// driver.findElements(By.xpath("//*[contains(.,'live')]"));

		// List<WebElement> words =
		// driver.findElements(By.xpath("//*[text()='Hands-on Workshop']"));
		//
		// System.out.println(words.size());

//		WebElement test;
//		try {
//			test = driver.findElement(By.xpath("//*[text()='Hands-on']"));
//			System.out.println(test);
//		} catch (Exception e) {
//			// e.printStackTrace();
//			System.out.println(e.getMessage());
//		} finally {
//			Thread.sleep(5000);
//			driver.quit();
//		}
		
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
