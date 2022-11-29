package seleniumbrowser;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintLocatinAndSize {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Begining of program......................." + new Date());

		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		String url = "https://www.devlabsalliance.com/";

		driver.get(url);

//		List<WebElement> allelements = driver.findElements(By.xpath("//h3"));
//		System.out.println(allelements.size());
//
//		for (WebElement ele : allelements) {
//			System.out.println(ele.getText()+"....."+ele.getLocation()+"......"+ ele.getSize());
//		}

		String pagesource=driver.getPageSource();
		
		
		System.out.println(pagesource.contains("@media only screen and (min-width: 48em"));
		
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
