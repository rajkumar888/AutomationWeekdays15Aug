package sampleDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\EveningWS\\SeleniumJavaDemo\\BrowerDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com");

		WebElement element1 = driver.findElement(By.id("email"));
		element1.sendKeys("patil_y7@yahoo.com");

		WebElement element2 = driver.findElement(By.id("pass"));
		element2.sendKeys("pa$$word123");

		WebElement element3 = driver.findElement(By.name("login"));
		element3.click();

		System.out.println("End of program...................");

	}

}
