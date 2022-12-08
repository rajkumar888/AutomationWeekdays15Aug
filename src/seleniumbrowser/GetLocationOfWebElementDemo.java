package seleniumbrowser;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationOfWebElementDemo {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.println("Begining of program......................." + new Date());
		Runtime.getRuntime().exec("taskkill /IM chromedriver");

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String url = "https://www.facebook.com/";

		driver.get(url);

		WebElement emailelement = driver.findElement(By.xpath("//*[@id='email']"));

		System.out.println(emailelement.getLocation());
		System.out.println(emailelement.getLocation().getX());
		System.out.println(emailelement.getLocation().getY());
		
		WebElement passwordelement = driver.findElement(By.xpath("//*[@id='pass']"));

		System.out.println(passwordelement.getLocation());
		System.out.println(passwordelement.getLocation().getX());
		System.out.println(passwordelement.getLocation().getY());
		

//		List<WebElement> allelements = driver.findElements(By.xpath("//a"));
//		System.out.println(allelements.size());
//
//		for (WebElement ele : allelements) {
//			System.out.println(ele.getText() + "....." + ele.getRect().getHeight() + " " + ele.getRect().getWidth()
//					+ " " + ele.getRect().getX() + " " + ele.getRect().getY());
//		}

//		WebElement logoEle = driver.findElement(By.xpath("(//img[@class='skip-lazy'])[1]"));
//		
//		System.out.println(logoEle.isDisplayed());

		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
