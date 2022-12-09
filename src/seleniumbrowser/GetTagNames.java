package seleniumbrowser;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagNames {

	public static void main(String[] args) throws IOException, InterruptedException  {
		System.out.println("Begining of program......................." + new Date());
		Runtime.getRuntime().exec("taskkill /IM chromedriver");

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String url = "https://www.facebook.com/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));  // global wait or implicit wait
		
		
		List<WebElement> allelementslist = driver.findElements(By.xpath("//*"));
	
		System.out.println("Total count "+allelementslist.size());
		
		for( WebElement ele : allelementslist){
			
			if(!ele.getText().isEmpty()) {
				System.out.println(ele.getTagName()+" ....................... "+ele.getText());
			}
			
		}
		System.out.println("===================================================");
		
		WebElement Facebookheadertext = driver.findElement(By.xpath("//h2"));
		
		System.out.println(Facebookheadertext.getText());
		
		
		Thread.sleep(5000);
		System.out.println("===================================================");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.print("End of the Program.........."+new Date());
	}
}
