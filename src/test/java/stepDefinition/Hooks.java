/*package stepDefinition;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.project.qa.sharedSteps.CommonPage;


import com.project.qa.reporting.ExtentManager;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Hooks   {

	public static CommonPage cp;
	public static int counter = 1;
	public static String timeStamp = new SimpleDateFormat("dd.MMM.yyyy_HH.mm").format(new Date());
	public static WebDriver driver;
	public static String scenarioName;


	@Before
	public void setup(Scenario scenario) throws IOException {
		
		try {
			
//			ExtentManager.startTest(scenario.getName());
			scenarioName = scenario.getName();
	
			DesiredCapabilities capabilities=DesiredCapabilities.chrome();
            ChromeOptions options=new ChromeOptions();
            options.addArguments("--incognito");
            
            options.setPageLoadStrategy(PageLoadStrategy.NONE); // https://www.skptricks.com/2018/08/timed-out-receiving-message-from-renderer-selenium.html
            options.addArguments("start-maximized"); 
            options.addArguments("enable-automation"); 
//            options.addArguments("--headless"); // only if you are ACTUALLY running headless
            options.addArguments("--no-sandbox"); 
            options.addArguments("--disable-infobars"); 
            options.addArguments("--disable-dev-shm-usage"); 
            options.addArguments("--disable-browser-side-navigation"); 
            options.addArguments("--disable-gpu");
            options.addArguments("--disable-notifications");
         WebDriverManager.chromedriver().setup();
            capabilities.setCapability(ChromeOptions.CAPABILITY, options);
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            cp = new CommonPage(driver);
		}

		catch (Exception e) { 
			e.printStackTrace(); 

		}      

	}


	@After
	public void terminateSession(Scenario scenario) {
		
		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			
			String path_screenshot = System.getProperty("user.dir") + "/target/ivl-Cluecumber-report/attachments/" +timeStamp + "/" + counter ;
			String path = path_screenshot.concat(".png");
			scenario.embed(screenshot, path); 
			counter ++;

		    }

		driver.quit();
	}

	}
*/