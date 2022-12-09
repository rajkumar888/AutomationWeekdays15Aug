package seleniumbrowser;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDimensionOfWebElement {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.println("Begining of program......................." + new Date());
		Runtime.getRuntime().exec("taskkill /IM chromedriver");

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String url = "https://www.facebook.com/";

		driver.get(url);

		WebElement facebooklogo = driver.findElement(By.xpath("//img[@alt='Facebook']"));

		System.out.println(facebooklogo.getSize());
		System.out.println(facebooklogo.getSize().getWidth());
		System.out.println(facebooklogo.getSize().getHeight());
		System.out.println("===================================================");
		System.out.println(facebooklogo.getLocation());
		System.out.println(facebooklogo.getLocation().getX());
		System.out.println(facebooklogo.getLocation().getY());
		System.out.println("===================================================");
		
		System.out.println(facebooklogo.getRect().getWidth());
		System.out.println(facebooklogo.getRect().getHeight());
		System.out.println(facebooklogo.getRect().getX());
		System.out.println(facebooklogo.getRect().getY());
		
		

//		WebElement emailelement = driver.findElement(By.xpath("//*[@id='email']"));
//
//		System.out.println(emailelement.getSize());
//		System.out.println(emailelement.getSize().getWidth());
//		System.out.println(emailelement.getSize().getHeight());
//		System.out.println("===================================================");
//
//		System.out.println(emailelement.getLocation());
//		System.out.println(emailelement.getLocation().getX());
//		System.out.println(emailelement.getLocation().getY());
//		System.out.println("===================================================");
//
//		WebElement passwordelement = driver.findElement(By.xpath("//*[@id='pass']"));
//
//		System.out.println(passwordelement.getSize());
//		System.out.println(passwordelement.getSize().getWidth());
//		System.out.println(passwordelement.getSize().getHeight());
//		System.out.println("===================================================");
//
//		System.out.println(passwordelement.getLocation());
//		System.out.println(passwordelement.getLocation().getX());
//		System.out.println(passwordelement.getLocation().getY());
//		System.out.println("===================================================");

		
		Thread.sleep(5000);
		System.out.println("===================================================");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
