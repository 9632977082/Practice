package Import;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.ObjectRespository.Home_page;
import com.crm.ObjectRespository.Login_page;
import com.crm.ObjectRespository.Organisation_page;

import Generic_lib.Base_class;
import Generic_lib.File_utility;
import Generic_lib.Webdriver_utility;

public class ImportOrganisation extends Base_class
{
	@Test(groups = {"smoke_testing","Regression_test"})
	public  void Import() throws IOException, InterruptedException
	{
		WebDriver driver =this.driver ;
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
		home.Organisation();

		String path = "C:\\Users\\Shivashankar\\Favorites\\Desktop\\test yantra notes\\post_man\\Ddt\\EXCEL.csv";

		Organisation_page org = new Organisation_page(driver);
		org.importButton(path);
		org.NextButton();

		WebElement ele1 = org.getCreatedBy();

		Select s = new Select(ele1);
		s.selectByIndex(1);

		WebElement ele2 = org.getProjectName();


		Select s1 = new Select(ele2);
		s1.selectByIndex(2);
		//Thread.sleep(2000);
		WebElement ele3 = org.getCreatedBy1();


		Select s2 = new Select(ele3);
		s2.selectByIndex(4);

		WebElement ele4 = org.getTeamSize();

		Select s3 = new Select(ele4);
		s3.selectByIndex(3);
		org.checkBox();
		org.checkBox();
		org.Import();
		org.Finish();
		org.SignOut();
	}
	@Test(groups ="Regression_test")
	public void Sample()
	{
		System.out.println("hi");
	}



}
