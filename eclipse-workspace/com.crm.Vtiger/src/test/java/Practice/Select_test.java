package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import sun.awt.SunHints.Value;

public class Select_test 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.get("file:///C:/Users/Shivashankar/Favorites/Desktop/xpath_html_documents/dropdown_grooming.html");
		FileInputStream fis = new FileInputStream("./mock.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet1");
		int lastrow = sheet.getLastRowNum();
		WebElement ele = driver.findElement(By.xpath("//select[@id='hotel']"));
		Select s = new Select(ele);
		List<WebElement> options = s.getOptions();
		ArrayList a = new ArrayList();
		for (WebElement value : options) 
		{
			a.add(value.getText());
		}
		for (Object o : a) 
		{
			System.out.println(o);
			String O = o.toString();
		}  
		String b1;
		for(int i=0;i<=lastrow;i++)
		{
			Row row = sheet.getRow(i);
			b1 = row.getCell(0).getStringCellValue();
			System.out.println(b1);
		}
	
	}

}


