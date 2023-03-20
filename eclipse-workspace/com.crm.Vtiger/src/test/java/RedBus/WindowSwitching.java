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

public class WindowSwitching
{

	public static void main(String[] args) throws AWTException 
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
		String parent_id = driver.getWindowHandle();
		Set<String> all_id = driver.getWindowHandles();
		all_id.remove(parent_id);
		Iterator<String> id = all_id.iterator();
		while(id.hasNext())
		{
			String wid = id.next();
			driver.switchTo().window(wid);
			driver.close();
		}
	}

}
