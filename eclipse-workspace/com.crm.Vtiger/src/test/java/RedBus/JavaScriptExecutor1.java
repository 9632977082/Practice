package RedBus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor1 
{
	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Shivashankar/Favorites/Desktop/xpath_html_documents/disabled.html");
		jse.executeScript("document.getElementById('a1').value='abc'");


	}

}
