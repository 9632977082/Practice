package RedBus;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WindowSwitching2 
{
	@Test
	public void WindowSwitching() throws AWTException
	{
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev");
		WebElement ele = driver.findElement(By.xpath("//span[.='Downloads']"));
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
		 
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Set<String> all_id = driver.getWindowHandles();
		Iterator<String> ids = all_id.iterator();
		while(ids.hasNext())
		{
		    String wid = ids.next();
		    driver.switchTo().window(wid);
		    String title = driver.getTitle();
		    System.out.println(title);
		    if(title.contains("Downloads | Selenium"))
		    {
		    	driver.close();
		    	break;
		    }
		}
		
	}

}
