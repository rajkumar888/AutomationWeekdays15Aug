package pagemodeldemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	WebDriver driver;
	
	public SignInPage(WebDriver driver ){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement textEmail;
	
	@FindBy(id="passwd")
	private WebElement textPassword;
	
	@FindBy(xpath="//span[contains(.,'Sign in')]")
	private WebElement btnSignIn;
	
	public void LoginWithUserIdAndPassword(String userid, String password){
		textEmail.sendKeys(userid);
		textPassword.sendKeys(password);
		btnSignIn.click();
	}

}
