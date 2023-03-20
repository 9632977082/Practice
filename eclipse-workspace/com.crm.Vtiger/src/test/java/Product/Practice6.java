package Product;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

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
import org.testng.annotations.Test;

import Generic_lib.Java_lib;

public class Practice6 
{
	@Test
	public void Practice() throws EncryptedDocumentException, IOException
	{
		Java_lib jlib = new Java_lib();
		System.setProperty("webdriver.chrome.driver", "./Chrome/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("phones");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		List<WebElement> phones = driver.findElements(By.xpath("//div[@class='_4rR01T']"));	
		TreeSet set = new TreeSet();
		for (WebElement webelement : phones) 
		{
			set.add(webelement);
		}
		for (Object object : set) 
		{
			System.out.println(object);
		}
	//	for (Object webElement1 : set) 
		{
			
		//	webElement1.
		//	int count = phones.size();

		//	FileInputStream fis = new FileInputStream("./Grooming.xlsx");
		//	Workbook book = WorkbookFactory.create(fis);
		//	Sheet sheet = book.createSheet("Sheet1"+jlib.getRandom());
		//	for(int i=0;i<count;i++)
		//	{
		//		Row row = sheet.createRow(i);
		//		Cell cell = row.createCell(0);
		//		cell.setCellValue(webElement1.getText());
		//	}

		//	FileOutputStream fos = new 	FileOutputStream("./Grooming.xlsx");
		//	book.write(fos);
		}
	}

}
