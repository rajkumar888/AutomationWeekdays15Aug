package seleniumbrowserlaunchdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	
	
	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "./BrowserDriver/chromedriver.exe");
		
		
//		ChromeDriver chromebrowser		=	new ChromeDriver();
		
		WebDriver chromebrowser		=	new ChromeDriver();
		
		chromebrowser.manage().window().maximize();
		
		String url="https://www.devlabsalliance.com/";
		
		chromebrowser.get(url);
		
		
		String actualurl=chromebrowser.getCurrentUrl();
		
		String expectedUrl=url;
		
		System.out.println(actualurl+"  .....................");
		
		System.out.println(actualurl.equals(expectedUrl));
		
		
		String expectedTitle="Devlabs Alliance offers consulting & workshops "
				+ "on AI, RPA, DevOps, Big Data, Block Chain, Automation";
		
					
		String actualTitle = chromebrowser.getTitle();
		
		System.out.println(actualTitle+"  .....................");
		
		System.out.println(actualTitle.equals(expectedTitle));
		
		
		Thread.sleep(5000);
		chromebrowser.quit();
		
	}

}
