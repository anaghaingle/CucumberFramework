package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;

import pages.HomePage;
import pages.LoginPage;

public class LoginStepDefn {

	WebDriver driver;
	HomePage homePg ;
	LoginPage loginPg ;
	
	@Given("User is at home page")
	public void user_is_at_home_page() throws PendingException {

		System.out.println("Step : User is at home page");
		
		WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
		driver = new ChromeDriver();
		
		//Set Implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Set Page Load timeout
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php?");
		
		homePg = new HomePage(driver);
		loginPg = new LoginPage(driver);
		
	}

	@When("user navigate to login page")
	public void user_navigate_to_login_page() throws InterruptedException {
		System.out.println("Step : user navigate to login page");
		
		//Find and click on Sign in button
		homePg.clickSignIn();		
		
		//assert for Login form page
		Assert.assertEquals("Login - My Store", driver.getTitle());
		
	}

	@And("^user enter Username(.*)$")
	public void user_enter_Username(String username) throws PendingException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
	    System.out.println("Step : user enter Username \n Parameter : "+username);
		//Enter UserID and Password
		/*driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(username);*/
	    loginPg.setUserName(username);
	}

	@And("^user enter Password(.*)$")
	public void user_enter_password(String password) throws PendingException{
	    System.out.println("Step : user enter Password \n Parameter : "+password);
	    loginPg.setPassword(password);
	}

	@Then("message dispayed is successful login")
	public void message_dispayed_is_successful_login() throws PendingException{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step : message dispayed is successful login ");
		
	}

/*	@When("User LogOut from the Application")
	public void user_LogOut_from_the_Application() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Message displayed {string}")
	public void message_displayed(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}*/

	
}
