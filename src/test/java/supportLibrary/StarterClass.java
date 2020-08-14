package supportLibrary;

import java.util.Properties;
import supportLibrary.CommonFunctionLibrary;;

public class StarterClass {

	public Properties globalProp = null;
	public CommonFunctionLibrary cf;
	
	public void setGlobalProp() {
		globalProp = cf.readPropertiesFile(System.getProperty("user.dir") + "/src/test/resources/config/config.properties");
		//return globalProp;
	}

	public String returnParameterValue() {
		String value = globalProp.getProperty("browser", "FF").toUpperCase();
		return value;		
	}

	
}
