package Generic_lib;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

public class Webdriver_utility 
{
	public void waitForPagetoLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public void waitForElementCustomTimeout(WebDriver driver,WebElement ele)
	{
		FluentWait wait = new FluentWait(driver);
		wait.pollingEvery(Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	public void toHandleMouseActions(WebDriver driver,WebElement ele)
	{
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
	}
	public void moveByoffset(WebDriver driver,int x,int y)
	{
		Actions a= new Actions(driver);
		a.moveByOffset(x, y).click().perform();
	}
	public void toHandleAlertAndConfirmationToAccept(WebDriver driver)
	{
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	public void toHandleAlertAndConfirmationDismiss(WebDriver driver)
	{
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}
	public void SwitchingWindow(WebDriver driver,String partialWindowText)
	{
		Set<String> all_id = driver.getWindowHandles();
		Iterator<String> id = all_id.iterator();
		while(id.hasNext())
		{
			String wid = id.next();
			driver.switchTo().window(wid);
			if(driver.getTitle().contains(partialWindowText))
			{
				break;
			}
		}
	}
	public void  SwitchtoFrame(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	public void toHandleDropDown(WebElement ele ,int index)
	{
		Select s = new Select(ele);
		s.selectByIndex(index);
	}
	public void toHandleDropDownbyVissibleText(WebElement ele, String value)
	{
		Select s = new Select(ele);
		s.selectByValue(value);
	}
	public void toHandleDropDownByVisibleText(WebElement ele,String text)
	{
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}
}
