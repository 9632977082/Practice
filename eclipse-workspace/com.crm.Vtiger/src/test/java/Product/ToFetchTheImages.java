package Product;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToFetchTheImages 
{
	@Test
	public void ToFetchTheImage()
	{
		System.setProperty("webdriver.chrome.driver", "./Chrome/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.get("https://www.selenium.dev");
		List<WebElement> Images = driver.findElements(By.xpath("//img"));
		int count = Images.size();
		System.out.println(count);
		List<WebElement> LinImg = driver.findElements(By.xpath("//img|//a"));
		int count2 = LinImg.size();
		System.out.println(count2);
        for(int i=0;i<count2;i++)
        {
        	WebElement ele = LinImg.get(i);
        	String text = ele.getText();
        	System.out.println(text);
        }
		
		
	}

}
