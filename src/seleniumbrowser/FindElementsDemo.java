package seleniumbrowser;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.out.println("Begining of program......................." + new Date());
		Runtime.getRuntime().exec("taskkill /IM chromedriver");

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String url = "https://www.devlabsalliance.com/";

		driver.get(url);
//		 List<WebElement> links = driver.findElements(By.tagName("a"));

//		List<WebElement> links = driver.findElements(By.xpath("//a"));

		List<WebElement> links = driver.findElements(By.cssSelector("a"));

		System.out.println("Total no of links present " + links.size());

		for (WebElement ln : links) {
			if (!ln.getText().isEmpty()) {
				System.out.println(ln.getText() + " :............... " + ln.getAttribute("href"));
			}
		}

//		System.out.println("Title  "+driver.getTitle());

//		System.out.println("Current URL  "+driver.getCurrentUrl());

//		System.out.println("Window Id  "+driver.getWindowHandle());
		// System.out.println(driver.getTitle());

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
		Thread.sleep(5000);
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
