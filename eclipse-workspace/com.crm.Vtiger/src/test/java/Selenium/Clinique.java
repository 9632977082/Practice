package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Clinique 
{

	public static void main(String[] args) 

			throws InterruptedException 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "./Chrome/chromedriver.exe");
		WebDriver	driver=new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.get("https://www.clinique.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='banner-content']/div[2]")).click();
		driver.findElement(By.xpath("//div[@class='outer-wrap signup jquery-once-1-processed']/div")).click();
		WebElement ele = driver.findElement(By.xpath("//button[@class='gnav-header-formatter__hamburger gnav-header-formatter__hamburger--pc js-gnav-header-formatter__shop-all button-as-link']/span"));
		ele.click();
		List<WebElement> eles = driver.findElements(By.xpath("//div[@class='gnav-header-formatter__sections gnav-header-formatter__sections-panel js-gnav-header-formatter__sections-panel visible']"));
		String exp = "Makeup";
		for (WebElement webElements : eles) 
		{
			String text = webElements.getText();
			System.out.println(text);

			if(text.contains(exp))
			{
				System.out.println("tc is pass");
			}


		}

	}

}
