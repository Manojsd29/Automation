package GenericLib;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {

	public String getPropertyValue(String value) throws Throwable {
		
		FileInputStream Fis =new FileInputStream("C:\\Users\\sd007\\eclipse-workspace\\Automation\\src\\test\\resources\\Testdata\\Testdata.properties");
		Properties p =new Properties();
		p.load(Fis);
		String key=p.getProperty(value);
		return key;
		
	}
}
