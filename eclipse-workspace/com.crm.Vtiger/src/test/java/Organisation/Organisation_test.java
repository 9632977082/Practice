package Organisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.ObjectRespository.Home_page;
import com.crm.ObjectRespository.Login_page;
import com.crm.ObjectRespository.Organisation_page;

import Generic_lib.Base_class;
import Generic_lib.File_utility;
import Generic_lib.Webdriver_utility;

public class Organisation_test extends Base_class
{
	@Test
	public  void Organisation() throws IOException 
	{
		WebDriver driver=this.driver;
		Webdriver_utility wlib = new Webdriver_utility();
		File_utility flib = new File_utility();
		String URL = flib.getValue("url");
		String UN = flib.getValue("un");
		String PWD = flib.getValue("pw");
		System.out.println(URL);


		
		wlib.waitForPagetoLoad(driver);
		driver.get(URL);

		Login_page login = new Login_page(driver);
		login.login(UN, PWD);
		
		Home_page home = new Home_page(driver);
		home.Organisation_1();
		Organisation_page org = new Organisation_page(driver);
		org.DeleteRow();
		Alert a = driver.switchTo().alert();
		a.accept();

		org.SignOut();
		a.accept();

	}

}
