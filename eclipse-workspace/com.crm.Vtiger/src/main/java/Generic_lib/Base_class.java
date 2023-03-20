package Generic_lib;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class 
{
	File_utility flib = new File_utility();
	public  static WebDriver driver;
	@BeforeSuite
	public void BS()
	{
		System.out.println("data base connection");
	}
	@BeforeTest
	public void BT()
	{
		System.out.println("execute in parallel mode");
	}
	@Parameters("BROWSER")
	@BeforeClass
	public void BC() throws IOException
	{
		//System.out.println("launching Browser");
		//System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		// driver = new ChromeDriver();
		//;
		String Browser = flib.getValue("browser");
		if(Browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromiumdriver().setup();
			driver=new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else		
		{
			driver=new ChromeDriver();
		}
	}
	@BeforeMethod
    public void BM()
    {
    	System.out.println("login to application");
    }
	@AfterMethod
	public void AM()
	{
		System.out.println("logout from the application");
	}
	@AfterClass
	public void AC()
	{
		System.out.println("close the browser");
	}
	@Test
	public void AT()
	{
		System.out.println("close the application");
	}
	public void AS()	
	{
		System.out.println("close the data base");
	}
}
