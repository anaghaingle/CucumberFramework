package supportLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

/**
 * @author Anagha.Ingle
 *
 */

public class DriverFactory {

	public static Properties prop;
	public  static DriverType driverType;
	public static WebDriver driver;
	public static CommonFunctionLibrary cf;
	
	public static void main (String[] args) {
		driverType = null;
		//prop = 
		cf.readPropertiesFile(System.getProperty("user.dir") + "/src/test/resources/config/config.properties");
		driver = driverType.getDriver();
		// DriverType.getDriver();
		driver.get("https://www.google.com/");
		driver.close();
		driver.quit();
	}

/*	static void readPropertiesFile(String filePath) {
		File file = new File(filePath);
		FileInputStream fis = null;
		try {
			
			fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
	         try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     }
		
		String browser = prop.getProperty("browser").toUpperCase();
		System.out.println("----Browser : " +browser+"-----");
		System.out.println("DriverType : "+DriverType.valueOf(browser));
		driverType = DriverType.valueOf(browser);


		//return null;
	}*/

}
