package supportLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CommonFunctionLibrary {
	
	Properties globalProp = null;

	public void setupDriver() {
		
	}
	
	public static Properties readPropertiesFile(String filePath) {
		File file = new File(filePath);
		FileInputStream fis = null;
		Properties prop = null;
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
		
		/*String browser = prop.getProperty("browser").toUpperCase();
		System.out.println("----Browser : " +browser+"-----");
		System.out.println("DriverType : "+DriverType.valueOf(browser));
		driverType = DriverType.valueOf(browser);*/


		return prop;
	}
}
