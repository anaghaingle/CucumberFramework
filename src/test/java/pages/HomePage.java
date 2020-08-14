package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	private WebDriver driver;

	@FindBy(linkText = "Sign in") WebElement btn_signIn_homePg;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		System.out.println(this.getClass());
		PageFactory.initElements(this.driver,this);
	}
	
	public void clickSignIn() {
		btn_signIn_homePg.click();
	}
	
}
