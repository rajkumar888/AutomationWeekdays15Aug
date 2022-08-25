package pagemodeldemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="search_query_top")
	private WebElement textboxSearch;
	

	@FindBy(name="submit_search")
	private WebElement btnSearch;
	
	public void searchForText(String texttosearch){
		textboxSearch.sendKeys(texttosearch);
		btnSearch.click();
	}
}
