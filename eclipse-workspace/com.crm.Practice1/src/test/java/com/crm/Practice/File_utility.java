package com.crm.Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class File_utility 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("./commondata.properties.txt");
		Properties pro = new Properties();
		pro.load(fis);
		String URL = pro.getProperty("url");
		String UN = pro.getProperty("un");
		String PWD = pro.getProperty("pw");
		System.out.println(UN);

	}

}
