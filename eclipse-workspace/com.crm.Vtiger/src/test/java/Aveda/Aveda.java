package Aveda;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Aveda 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Chrome/chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.aveda.com");
		WebElement ele = driver.findElement(By.xpath("//div[@trackname='Site Header - Desktop|site_header_menu_category_v1|FY23_HolidayRemoval']/div/ul/li[5]"));
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		List<WebElement> eles = driver.findElements(By.xpath("//div[@trackname='Site Header - Desktop|site_header_menu_category_v1|FY23_HolidayRemoval']/div/ul/li[5]/descendant::div[@class='content']"));


		for (WebElement webElement : eles) 
		{
			System.out.println(webElement.getText());

		}
	}

}
