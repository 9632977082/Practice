package RedBus;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedBus 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Chrome/chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='https://www.redbus.in/bus-tickets/']")).click();
		driver.findElement(By.xpath("//input[@style='position:absolute;height:98%;padding-left:35px;border:none;outline:none']")).sendKeys("bangalore");
		driver.findElement(By.xpath("//div[.='Anand Rao Circle, Bangalore']")).click();
		driver.findElement(By.xpath("//input[@id='txtDestination']")).sendKeys("Mysore");
		driver.findElement(By.xpath("//div[.='KSRTC Bus Stand, Mysore']")).click();
		driver.findElement(By.xpath("//input[@id='txtOnwardCalendar']")).click();
		driver.findElement(By.xpath("//span[.='Feb']/../ancestor::div[@id='rb-calmiddle']/ul[2]/descendant::li[@data-date='18']")).click();
		driver.findElement(By.xpath("//button[@class='D120_search_btn searchBuses']")).click();  
		String busfound = driver.findElement(By.xpath("//span[@class='f-bold']")).getText();
		String[] sep = busfound.split(" ");
		String count = sep[0];
		System.out.println(count);
		driver.findElement(By.xpath("//div[.='IMPORTANT TIP']/div[@class='fr']/i")).click();
		driver.findElement(By.xpath("//div[@class='w-14 fl']/div[2]")).click();
		for(int i=0;i<3;i++)
		{
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(3000);
		}
		List<WebElement> buses = driver.findElements(By.xpath("//div[@class='group-data clearfix']"));
		WebElement data = buses.get(0);
		String bus = data.getText();
		System.out.println(bus);
		int num=0;
		for (WebElement b : buses) 
		{
			System.out.println(b.getText());
			num++;
		}
		System.out.println(num);
		int val = Integer.parseInt(count);
		if(val==num)
		{
			System.out.println("passs");
		}
		else
		{
			System.out.println("fail");
		}

	}

}
