package GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

	public String getPropertyData(String Key) throws IOException {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream(AutoConstant.propertyfilepath);
		p.load(fis);
		return p.getProperty(Key);
		
	}
}
