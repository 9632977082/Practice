package Generic_lib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class File_utility 
{
	public String getValue(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("./commondata.properties.txt");
		Properties pro = new Properties();
		pro.load(fis);
		String value = pro.getProperty(key);
		return value;
		
		
	}

}
