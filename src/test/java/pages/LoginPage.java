package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	@FindBy(id = "email") WebElement txt_userID_loginPg;
	@FindBy(id = "passwd") WebElement txt_password_loginPg;
	@FindBy() WebElement btn_signIn_LoginPg;
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String username) {
		txt_userID_loginPg.clear();
		txt_userID_loginPg.sendKeys(username);
	}
	
	public void setPassword(String password) {
		txt_password_loginPg.clear();
		txt_password_loginPg.sendKeys(password);
	}
	
	public void clickLogin() {
		btn_signIn_LoginPg.click();
	}
	
}
