package RedBus;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchWindowFrom1stTo3rd 
{
	public static void main(String[] args) throws AWTException 
	{
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("https://www.selenium.dev");
		WebElement ele1 = driver.findElement(By.xpath("//span[.='Downloads']"));
		WebElement ele2 = driver.findElement(By.xpath("//span[.='Documentation']"));
		WebElement ele3 = driver.findElement(By.xpath("//span[.='Projects']"));

		ArrayList<WebElement> l = new ArrayList();
		l.add(ele1);
		l.add(ele2);
		l.add(ele3);

		Actions a = new Actions(driver);
		Robot r = new Robot();
		for (WebElement value : l) 
		{
			a.contextClick(value).perform();
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
		}
		String id = driver.getWindowHandle();
		Set<String> all_id = driver.getWindowHandles();
		Iterator<String> ids = all_id.iterator();
		while(ids.hasNext())
		{
			String id1 = ids.next();
			driver.switchTo().window(id1);
			if(driver.getTitle().contains("Projects|Selenium"))
			{
				System.out.println(driver.getTitle());
				break;
			}
			
		}

	}

}
