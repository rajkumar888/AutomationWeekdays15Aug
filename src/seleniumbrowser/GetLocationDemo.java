package seleniumbrowser;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationDemo {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Begining of program......................." + new Date());
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.devlabsalliance.com/";
		
//		https://www.firstflight.com.sg/
		driver.get(url);

//		List<WebElement> allelements = driver.findElements(By.xpath("//a"));
//		System.out.println(allelements.size());
//
//		for (WebElement ele : allelements) {
//			System.out.println(ele.getText() + "....." + ele.getRect().getHeight() + " " + ele.getRect().getWidth()
//					+ " " + ele.getRect().getX() + " " + ele.getRect().getY());
//		}

		
		
		WebElement logoEle = driver.findElement(By.xpath("(//img[@class='skip-lazy'])[1]"));
		
		System.out.println(logoEle.isDisplayed());
		
		
		
		
		
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
