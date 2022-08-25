package seleniumbrowserlaunchdemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	
	
	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "./BrowserDriver/chromedriver.exe");
		
		
		WebDriver chromebrowser		=	new ChromeDriver();
		
		chromebrowser.manage().window().maximize();
		
		String url="https://www.google.com/";
		
		chromebrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		
		chromebrowser.get(url);
		
	
//		System.out.println(chromebrowser.getPageSource());
		System.out.println(chromebrowser.getPageSource().contains("Copyright The Closure Library Authors."));
		
		
		
		Thread.sleep(5000);
		chromebrowser.quit();
		
	}

}
