package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScroldownThePagel 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in");
		WebElement ele = driver.findElement(By.xpath("//button[.='Search Buses']"));
		Point loc = ele.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		jse.executeScript("window.ScrollBy("+x+","+y+")");
		
	}

}
