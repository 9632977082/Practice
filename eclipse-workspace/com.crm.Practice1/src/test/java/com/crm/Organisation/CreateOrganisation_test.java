package com.crm.Organisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Generic_utilities.Base_class;
import Generic_utilities.Java_utility;
import Generic_utilities.Webdriver_utility;
import ObjectRepository.Home_page;
import ObjectRepository.LogIn_page;
import ObjectRepository.Organisation_page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrganisation_test extends Base_class
{
	@Test(groups = {"smoke_test"})
	public  void CreateOrganisationTest() throws IOException 
	{

		Generic_utilities.File_utility flib = new Generic_utilities.File_utility();
		Generic_utilities.Excel_utility elib = new Generic_utilities.Excel_utility();
		Java_utility jlib = new Java_utility();
		int num = jlib.getRanDomNUM();
		Webdriver_utility wlib = new Webdriver_utility();
		
		
		String Browser = flib.getPropertyKeyValue("browser");
		String URL = flib.getPropertyKeyValue("url");
		String UN = flib.getPropertyKeyValue("un");
		String PWD = flib.getPropertyKeyValue("pw");
		
		WebDriver driver = null;
		if(Browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(Browser.equalsIgnoreCase("msedge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}
		//System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		
		wlib.waitForPageToLoad(driver);
		
		driver.get(URL);
		LogIn_page login = new LogIn_page(driver);
		login.Login(UN, PWD);
		
		String data = elib.getExcelValue("Sheet1",0,0)+num;
	
		

		
	
		Home_page home = new Home_page(driver);
		home.Organisations();
		
		Organisation_page org = new Organisation_page(driver);
		org.createOrganisation(data);
		
		//driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		//driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(data);
		//driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
		//driver.switchTo().alert().accept();
		
		String actdata = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		if(actdata.contains(data))
		{
			System.out.println("created");
		}
		else
		{
			System.out.println("not created");
			
		}
	
		home.SignOut();
		





	}
}
