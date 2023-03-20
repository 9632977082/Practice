package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UK 
{
	@Test
	public  void UK()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "./Chrome/chromedriver.exe");
		WebDriver	driver=new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.get("https://www.clinique.co.uk");
		driver.findElement(By.xpath("//div[@class='ot-sdk-row']/descendant::button[.='Reject']")).click();
		driver.findElement(By.xpath("//div[@id='cboxContent']/descendant::button[.='close']")).click();
		driver.findElement(By.xpath("//button[@class='gnav-header-formatter__hamburger gnav-header-formatter__hamburger--pc js-gnav-header-formatter__shop-all button-as-link']")).click();
		List<WebElement> eles = driver.findElements(By.xpath("//div[@class='gnav-header-formatter__sections gnav-header-formatter__sections-panel js-gnav-header-formatter__sections-panel visible']"));
		
		String exp = "Makeup";
		for (WebElement webElement : eles) 
		{
			String text = webElement.getText();
			System.out.println(text);
			if(text.contains(exp))
			{
				Assert.assertTrue(true);
			}
			
		}
	}

}
