package supportLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;

/**
 * @author Anagha.Ingle
 *
 */

public enum DriverType implements DriverInterface {


	
	CHROME("Chrome"){
		@Override
		public WebDriver getDriver() {
			WebDriver driver;
			System.out.println("SETUP CHROME DRIVER");

			WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
			driver = new ChromeDriver();

			//Set Implicit wait
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			//Set Page Load timeout
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

			//Maximize the browser
			driver.manage().window().maximize();

			return driver;

		}
	}, 
	FIREFOX("Firefox"){

		@Override
		public WebDriver getDriver() {
			System.out.println("SETUP FIREFOX DRIVER");
			WebDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
			return new FirefoxDriver();
		}
	};

	private String driverType;

	DriverType(String driverType) {
		this.driverType = driverType;
	}

	public String getDriverType() {
		return driverType;
	}

	


}
