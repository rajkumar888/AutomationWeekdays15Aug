package pagemodelTests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pagemodeldemo.HomePage;
import pagemodeldemo.SignInPage;

public class HomePageDemo {

	WebDriver driver;

	@BeforeClass()
	public void init() throws IOException {

		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void testCaseforHomePage() throws InterruptedException {

		driver.get("http://automationpractice.com/");
		
		HomePage homepage = new HomePage(driver);

		homepage.searchForText("Shirt");
		
		Thread.sleep(5000);

	}
	
	
	@Test
	public void testCaseforSignInPage() throws InterruptedException {

		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		SignInPage signInpage = new SignInPage(driver);

		signInpage.LoginWithUserIdAndPassword("hello@gmail.com", "testPassword");
		Thread.sleep(5000);
	}
}
