package com.demo.seleniumbrowser;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintLinks {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Begining of program......................." + new Date());

		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		String url = "https://www.devlabsalliance.com/";

		driver.get(url);

		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println(links.size());

		// for(WebElement lnk:links){
		// System.out.println(lnk.getText()+"..........."+lnk.getAttribute("href"));
		//
		//// if(lnk.getText().length()>0){
		//// }
		// }

		for (WebElement lnk : links) {
			
			if(!lnk.getText().isEmpty()){
				System.out.println(lnk.getText()+" "+lnk.getCssValue("font-family") + "  " + lnk.getCssValue("color") + " "
						+ lnk.getCssValue("text-align")+"  " + lnk.getCssValue("font-size") );
			}
		}
		
		
		
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
