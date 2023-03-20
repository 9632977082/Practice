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

public class FecthTheParent_id 
{
	public static void main(String[] args) throws AWTException
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		String parent_id = driver.getWindowHandle();
		System.out.println(parent_id);
		WebElement ele = driver.findElement(By.xpath("//span[.='Downloads']"));
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		
		Set<String> all_id = driver.getWindowHandles();
		all_id.remove(parent_id);
		Iterator<String> ids = all_id.iterator();
		while(ids.hasNext())
		{
			String wid = ids.next();
			driver.switchTo().window(wid);
			String title = driver.getTitle();
			System.out.println(title);
			for(int i=0;i<1;i++)
			{
				driver.close();
			}
		}


	}

}
