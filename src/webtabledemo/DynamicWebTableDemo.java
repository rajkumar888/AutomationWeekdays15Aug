package webtabledemo;

import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableDemo {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Begining of program......................." + new Date());
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String url = "https://demo.guru99.com/test/table.html";
		driver.get(url);

		// WebElement tablecell =
		// driver.findElement(By.xpath("//table//tbody//tr[2]//td[3]"));
		//
		// System.out.println(tablecell.getText());

		List<WebElement> listofrows = driver.findElements(By.xpath("//table//tbody//tr"));
		for (int i = 1; i <= listofrows.size(); i++) {

			List<WebElement> listofColumns = driver.findElements(By.xpath("//table//tbody//tr[" + i + "]//td"));

			for (int c = 1; c <= listofColumns.size(); c++) {

				WebElement tablecell = driver.findElement(By.xpath("//table//tbody//tr[" + i + "]//td[" + c + "]"));

				System.out.print(tablecell.getText() + " ");

			}
			System.out.println();
		}

		Thread.sleep(5000);
		System.out.println("=============================================");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
