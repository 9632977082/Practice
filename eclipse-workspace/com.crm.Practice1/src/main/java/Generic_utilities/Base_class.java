package Generic_utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import ObjectRepository.LogIn_page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class 
{

	WebDriver driver;
	Excel_utility elib = new Excel_utility();
	File_utility flib = new File_utility();
	Java_utility jlib = new Java_utility();
	Webdriver_utility wlib = new Webdriver_utility();
	@BeforeSuite
	public void BS()
	{
		System.out.println("connect to database");
	}
	@BeforeTest
	public void BT()
	{
		System.out.println("execute in parallel mode");
	}
	@BeforeClass
	public void BC() throws IOException
	{
		Webdriver_utility wlib = new Webdriver_utility();
		System.out.println("launch the browser");
		//System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		//wlib.waitForPageToLoad(driver);
		//}

	}
	@BeforeMethod
	public void BM() throws IOException
	{
		System.out.println("login to application");

	}
	@AfterMethod
	public void AM(ITestResult result) throws IOException
	{
		System.out.println("logout from the application");

	}
	@AfterClass
	public void AC()
	{
		System.out.println("close the browser");
	}
	@AfterTest
	public void AT()
	{
		System.out.println("execute successfully");
	}
	public void AS()
	{
		System.out.println("close data base");
	}
}
