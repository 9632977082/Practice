package Generic_utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class File_utility 
{
	/*
	 * this method is used to launch the application
	 * PRAM KEY
	 * RETURN THROWS
	 * @THROWS
	 */
	public String getPropertyKeyValue(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(ipathConstant.PROPERTYFILE_PATH);
		Properties pro = new Properties();
		pro.load(fis);
		String value = pro.getProperty(key);
		return value;

	}
	
}
