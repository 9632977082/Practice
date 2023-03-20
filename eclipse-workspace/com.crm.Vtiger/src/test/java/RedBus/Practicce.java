package RedBus;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practicce 
{
	public static void main(String[] args) throws AWTException 
	{
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("https://www.redbus.in");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@data-message='Please enter a source city']")).sendKeys("bangalore");
		driver.findElement(By.xpath("//ul[@class='autoFill homeSearch']/li[2]")).click();
        driver.findElement(By.xpath("//input[@data-message='Please enter a destination city']")).sendKeys("mysore");
     //   driver.findElement(By.xpath(null))

	}

}
