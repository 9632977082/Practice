package RedBus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyErrorMessages 
{
	@Test
	public  void VerifyMessages1()
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://jupiter.cloud.planittesting.com/#/home");
		driver.findElement(By.xpath("//li[@id='nav-contact']/a/i")).click();
		driver.findElement(By.xpath("//a[.='Submit']")).click();
		String act_data1= driver.findElement(By.xpath("//strong[contains(text(),'We welcome your feedback')]")).getText();
		String expected1= "We welcome your feedback";
		Assert.assertEquals(act_data1, expected1);
		String act_data2 = driver.findElement(By.xpath("//span[.='Forename is required']")).getText();
		String	expected2="Forename is required";
		Assert.assertEquals(act_data2, expected2);
		String exp = driver.findElement(By.xpath("//span[.='Message is required']")).getText();
		String act = "Message is required";
		Assert.assertEquals(exp, act);

	}


}
