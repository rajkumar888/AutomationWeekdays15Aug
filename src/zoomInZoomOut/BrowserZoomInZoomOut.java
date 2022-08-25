package zoomInZoomOut;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserZoomInZoomOut {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.out.print("Start of the Program.........." + new Date());
		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		String url = "https://www.selenium.dev/";
		driver.get(url);

		((JavascriptExecutor) driver).executeScript("document.body.style.zoom='40%'");

		Thread.sleep(5000);

		((JavascriptExecutor) driver).executeScript("document.body.style.zoom='200%'");

		Thread.sleep(5000);

		((JavascriptExecutor) driver).executeScript("document.body.style.zoom='100%'");

		Thread.sleep(5000);
		driver.close();
		driver.quit();
		System.out.print("End of the Program.........." + new Date());
	}
}
