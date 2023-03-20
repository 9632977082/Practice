package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Yahoo2 
{
	@Test
	public void Yah()
	{
		System.setProperty("webdriver.chrome.driver", "./Chrome/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("//div[@class='compCardList ps-quicklinks yui3-skin-sam']/ul/li[@class='first']/following-sibling::li/descendant::span[.='Weather']"));
		String text = ele.getText();
		System.out.println(text);
		
	}

}
