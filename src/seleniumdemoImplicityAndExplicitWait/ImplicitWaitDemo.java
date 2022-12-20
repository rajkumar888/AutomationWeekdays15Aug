package seleniumdemoImplicityAndExplicitWait;

import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ImplicitWaitDemo {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Begining of program......................." + new Date());
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		String url = "https://www.facebook.com/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebElement creatNewAccount = driver.findElement(By.linkText("Create New Account"));
		creatNewAccount.click();

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		Select selectDay = new Select(day);
		Select selectMonth = new Select(month);
		Select selectYear = new Select(year);
		
//		System.out.println(selectDay.isMultiple());
//		System.out.println(selectMonth.isMultiple());
//		System.out.println(selectYear.isMultiple());

//		selectDay.selectByVisibleText("15");
//		selectMonth.selectByVisibleText("Jan");
//		selectYear.selectByVisibleText("2001");
		
		
//		selectMonth.selectByIndex(0);Thread.sleep(2000);
//		selectMonth.selectByIndex(1);Thread.sleep(2000);
//		selectMonth.selectByIndex(2);Thread.sleep(2000);
//		selectMonth.selectByIndex(3);Thread.sleep(2000);
//		selectMonth.selectByIndex(11);Thread.sleep(2000);
		
		
//		selectMonth.selectByValue("8");Thread.sleep(2000);
//		selectMonth.selectByValue("1");Thread.sleep(2000);
//		selectMonth.selectByValue("5");Thread.sleep(2000);
//		selectMonth.selectByValue("2");Thread.sleep(2000);
		
		List<WebElement> monthlist = selectMonth.getOptions();
//		System.out.println(monthlist);
		
		for(WebElement mon: monthlist){
			System.out.println(mon.getAttribute("value")+" "+mon.getText());
		}
		
		

		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
