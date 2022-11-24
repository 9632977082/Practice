package Generic_utilities;

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
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * it contains all the reusable actions of webdriver
 * @author SHIVA SHANKAR R
 */

public class Webdriver_utility 
{
	/*
	 * it makes the browser to wait till page got loaded
	 */
	public void waitForPageToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	/*
	 * it will make the browser till the element inspected
	 */

	public void waitForTheElementToInspect(WebDriver driver,String data)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains(data));
	}
	/*
	 * custom time
	 */
	
	public void  waitForTheElementToinspectWithCustomWait(WebDriver driver ,WebElement ele ,int pollingtime)
	{
		FluentWait wait = new FluentWait(driver);
		wait.pollingEvery(Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
	}
	/*
	 * to move the cursor to the particular element
	 */
	 
	public void ToHandleMouseActions(WebDriver driver,WebElement ele)
	{
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}
	/*
	 * to perform rightclick on the element
	 */
	public void ToPerformRightClickOnTheElement(WebDriver driver,WebElement ele)
	{
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
	}
	/*
	 * to perform DoubleClickActions
	 */
	public void ToPerformDoubleClickAction(WebDriver driver,WebElement ele)
	{
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
	}
	/*
	 * to move the cursor by x,y
	 */
	public void ToMoveCursorByXY(WebDriver driver,int x,int y)
	{
		Actions a = new Actions(driver);
		a.moveByOffset(x, y).click().perform();
	}
	/*
	 * handle alert and confirmation popup
	 * to accept 
	 */
	
	public void ToHandleAlertandConfirmationPopUpAccept(WebDriver driver)
	{
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	/*
	 * handle alert and confirmation popup
	 * dismiss
	 */
	public void ToHandleAlertandConfirmationPopUPDismiss(WebDriver driver)
	{
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}
	/*
	 * to handle dropdown by using index
	 */
	public void ToHandleDropdownByindex(WebElement ele,int index)
	{
		Select s = new Select(ele);
		s.selectByIndex(index);
	}
	/*
	 * to Handle dropdown by using value
	 */
	public void ToHandleDropdownByvalue(WebElement ele,String value)
	{
		Select s = new Select(ele);
		s.selectByValue(value);
	}
	/*
	 * to handle dropdown by using visible text
	 */
	
	public void ToHandleDropDownByselect(WebElement ele,String visibleText)
	{
		Select s = new Select(ele);
		s.selectByVisibleText(visibleText);
	}
	/*
	 * to handle dropdown
	 * to deselectall
	 */
	
	public void TohandleDropDownToDeselect(WebElement ele)
	{
		Select s = new Select(ele);
		s.deselectAll();
	}
	/*
	 * switch to window
	 * 
	 */
	
	public void ToSwitchingWindow(WebDriver driver,String title)
	{
		Set<String> all_id = driver.getWindowHandles();
		Iterator<String> id = all_id.iterator();
		while(id.hasNext())
		{
			String wid = id.next();
			driver.switchTo().window(wid);
			if(driver.getTitle().contains(title))
			{
				break;
			}
		}
	}
	/*
	 * used switch from one frame to another
	 */
	public void SwitchToFrame(WebDriver driver,String id_name)
	{
		driver.switchTo().frame(id_name);
	}
	/*
	 * used Switch from one frame to another
	 *   using  index
	 */
	public void SwitchToFrame(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	
	
	
}
