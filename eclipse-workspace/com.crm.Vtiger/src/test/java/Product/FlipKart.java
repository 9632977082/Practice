package Product;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlipKart 
{
	@Test
	public void Flip()
	{
		System.setProperty("webdriver.chrome.driver","./Chrome/chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		 WebElement ele = driver.findElement(By.xpath("//a[.='Facebook']"));
		//int x = loc.getX();
		//int y = loc.getY();
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
	//	jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		ele.click();
		String exp = "Amazon India - Home | Facebook";
		String act = driver.getTitle();
		Assert.assertEquals(exp, act);
		
	}

}
