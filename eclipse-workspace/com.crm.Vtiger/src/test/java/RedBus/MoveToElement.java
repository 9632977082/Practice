package RedBus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop");
		driver.manage().window().maximize();
		for(int i=0;i<2;i++)
		{
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,200)");
		}
		
	//	WebElement src = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		WebElement dst = driver.findElement(By.xpath("//div[@id='trash']"));
		
		
		Actions a = new Actions(driver);
		a.moveToElement(dst).perform();
	}

}
