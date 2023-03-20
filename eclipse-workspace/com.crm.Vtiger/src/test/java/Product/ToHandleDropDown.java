package Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ToHandleDropDown 
{
	@Test(invocationCount = 0)
	public void ToHandleDropDown1()
	{
		System.setProperty("webdriver.chrome.driver", "./chrome/chromedriver.exe");
		WebDriver   driver=new ChromeDriver();
		driver.get("file:///C:/Users/Shivashankar/Favorites/Desktop/xpath_html_documents/multiSelectDropdown.html");
		WebElement ele = driver.findElement(By.xpath("//select[@id='hotel']"));
		Select s = new Select(ele);
		s.selectByIndex(0);
		s.selectByValue("j");
		s.selectByVisibleText("biryani");
		s.deselectAll();
		List<WebElement> options = s.getOptions();
		int count = options.size();
		System.out.println(count);

	}
	@Test(invocationCount = 0)
	public void FetchTheTextofDrop()
	{
		System.setProperty("webdriver.chrome.driver", "./chrome/chromedriver.exe");
		WebDriver   driver=new ChromeDriver();
		driver.get("file:///C:/Users/Shivashankar/Favorites/Desktop/xpath_html_documents/multiSelectDropdown.html");
		WebElement ele = driver.findElement(By.xpath("//select[@id='hotel']"));
		Select s = new Select(ele);
		List<WebElement> options = s.getOptions();
		for (WebElement ele1 : options) 
		{
			String text = ele1.getText();
			System.out.println(text);
		}

	}
	@Test(invocationCount = 0)
	public void ToFetchTheAllTextINAscendingOrder()
	{
		System.setProperty("webdriver.chrome.driver", "./chrome/chromedriver.exe");
		WebDriver   driver=new ChromeDriver();
		driver.get("file:///C:/Users/Shivashankar/Favorites/Desktop/xpath_html_documents/multiSelectDropdown.html");
		WebElement ele = driver.findElement(By.xpath("//select[@id='hotel']"));
		ArrayList<String>a = new ArrayList<String>();
		Select s = new Select(ele);
		List<WebElement> options = s.getOptions();
		for (WebElement value : options) 
		{
			a.add(value.getText());			
		}
		Collections.sort(a);
		for (String o : a) 
		{
			System.out.println(o);

		}

	}
	@Test(invocationCount = 0)
	public void Treeset1()
	{
		System.setProperty("webdriver.chrome.driver", "./chrome/chromedriver.exe");
		WebDriver   driver=new ChromeDriver();
		driver.get("file:///C:/Users/Shivashankar/Favorites/Desktop/xpath_html_documents/multiSelectDropdown.html");
		WebElement ele = driver.findElement(By.xpath("//select[@id='hotel']"));
		Select s = new Select(ele);
		List<WebElement> options = s.getOptions();
		TreeSet<String> set = new TreeSet<String>(Collections.reverseOrder());
		for (WebElement string : options) 
		{
			set.add(string.getText());
		}
		for (String string1 : set)
		{
			System.out.println(string1);
		}
	}
	@Test(invocationCount = 1)
	public void Arraylist()
	{
		System.setProperty("webdriver.chrome.driver", "./chrome/chromedriver.exe");
		WebDriver   driver=new ChromeDriver();
		driver.get("file:///C:/Users/Shivashankar/Favorites/Desktop/xpath_html_documents/multiSelectDropdown.html");
		WebElement ele = driver.findElement(By.xpath("//select[@id='hotel']"));
		Select s = new Select(ele);
		List<WebElement> options = s.getOptions();
		ArrayList<String> a = new ArrayList<String>();

		for (WebElement string : options) 
		{
			a.add(string.getText());
		}
		TreeSet<String> t = new TreeSet(a);
		for (String string : t) 
		{
			System.out.println(string);
		}		
	}
	@Test
	public void remove()
	{
		System.setProperty("webdriver.chrome.driver", "./chrome/chromedriver.exe");
		WebDriver   driver=new ChromeDriver();
		driver.get("file:///C:/Users/Shivashankar/Favorites/Desktop/xpath_html_documents/multiSelectDropdown.html");
		WebElement ele = driver.findElement(By.xpath("//select[@id='hotel']"));
		Select s = new Select(ele);
		List<WebElement> options = s.getOptions();
		ArrayList<String> a = new ArrayList<String>();

		for (WebElement string : options) 
		{
			a.add(string.getText());
		}
		boolean b = a.contains("fried momos");
		if(b)
		{
			a.remove("fried momos");
		}
		else
		{
			System.out.println("no momo");
		}
		for (String b1 : a) 
		{
               System.out.println(b1);
		}
	}
}
