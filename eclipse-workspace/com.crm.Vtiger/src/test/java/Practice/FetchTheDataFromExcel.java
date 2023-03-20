package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.cj.jdbc.Driver;

public class FetchTheDataFromExcel 
{
	public static void main(String[] args) throws IOException, SQLException 
	{
		//System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		//	WebDriver	driver=new ChromeDriver();
		FileInputStream fis = new FileInputStream("./commondata.properties.txt");
		Properties pro = new Properties();
		pro.load(fis);
		System.out.println( pro.getProperty("url"));

		FileInputStream fis1 = new FileInputStream("./DATA1.xlsx");
		Workbook book = WorkbookFactory.create(fis1);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		String data = cell.getStringCellValue();
		System.out.println(data);
		
	//	Driver driverref = new Driver();
	//	DriverManager.registerDriver(driverref);
	//	Connection con = DriverManager.getConnection("jdbc:mySql://localhost:3306/test_yantra","root","root");
	//	Statement stat = con.createStatement();
	//	String query = "select* from student";
	//	ResultSet result = stat.executeQuery(query);
	//	while(result.next())
	//	{
	//		System.out.println(result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getString(3)+result.getString(4));
	//	}

	}

}
