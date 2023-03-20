package RedBus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.get("file:///C:/Users/Shivashankar/Favorites/Desktop/xpath_html_documents/noramlize_contains.html");
	}

}
