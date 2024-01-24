package Com.Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtilities 
{
	public String Read_Data_from_Prop(String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream(IPathConstant.PropPath);
		Properties prop = new Properties();
		prop.load(fis);
		
		String value = prop.getProperty(key);
		return value;
	}
}
