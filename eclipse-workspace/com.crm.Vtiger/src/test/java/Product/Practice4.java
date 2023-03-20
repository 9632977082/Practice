package Product;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice4 
{
	@Test
	public void Practice() throws AWTException
	{
		System.setProperty("webdriver.chrome.driver", "./Chrome/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("Iphone");
		WebElement ele = driver.findElement(By.xpath("//button[@type='submit']"));
		Point loc = ele.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		Robot r = new Robot();
		r.mouseMove(x, y);
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']"));
		for (WebElement webElement : elements) 
		{
			System.out.println(webElement.getText());
			
		}
	

	}
}
