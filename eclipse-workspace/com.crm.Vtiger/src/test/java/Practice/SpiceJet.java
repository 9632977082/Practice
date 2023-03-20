package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SpiceJet 
{
	public static void main(String[] args) 
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "./Chrome/chromedriver.exe");
		WebDriver	driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com");
		//	Alert a = driver.switchTo().alert();
		//	a.dismiss();

		driver.findElement(By.xpath("//div[.='one way']")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-1g40b8q']/descendant::div[@data-testid='to-testID-origin']/div/div[.='From']")).sendKeys("Bengaluru");
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-1g40b8q']/descendant::div[@data-testid='to-testID-destination']/div/descendant::input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']")).sendKeys("Mumbai");
		//	driver.findElement(By.xpath("//div[@data-testid='departure-date-dropdown-label-test-id']")).click();

		driver.findElement(By.xpath("//div[contains(text(),'March ')]/ancestor::div[@data-testid='undefined-month-March-2023']/descendant::div[@class='css-1dbjc4n r-6koalj r-18u37iz r-d0pm55']/div[.='2']")).click();
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
		for(int i=0;i<3;i++)
		{
			driver.findElement(By.xpath("//div[.='Adult']/../../div[2]/div[3]")).click();
		}

		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1pcd2l5 r-1uwte3a r-m611by r-bnwqim']/div[6]/descendant::div[@class='css-1dbjc4n r-18u37iz r-1w6e6rj']/div[3]")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-1wtj0ep r-1lgpqti']/div[2]")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1uavh4e r-18u37iz r-4nltbq r-12oa4ik r-tv6buo r-d9fdf6 r-9qu9m4']/descendant::div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73']")).click();

		WebElement ele = driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1uavh4e r-18u37iz r-4nltbq r-12oa4ik r-tv6buo r-d9fdf6 r-9qu9m4']/div/div[3]"));
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		ele.click();
		//ele.click();
	//	JavascriptExecutor jse = (JavascriptExecutor)driver;
	//	jse.executeScript("arguments[0].click();", ele);

	}

}
