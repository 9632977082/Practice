package RedBus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TwoStuffedFrog 
{
	@Test
	public void Two()
	{
		System.setProperty("webdriver.chrome.driver", "./Chrome/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://jupiter.cloud.planittesting.com/#/home");
		driver.findElement(By.xpath("//a[.='Start Shopping »']")).click();
		driver.findElement(By.xpath("//h4[.='Teddy Bear']/ancestor::li[@class='product ng-scope']/descendant::a[.='Buy']")).click();
		driver.findElement(By.xpath("//h4[.='Teddy Bear']/ancestor::li[@class='product ng-scope']/descendant::a[.='Buy']")).click();
		for(int i=0;i<5;i++)
		{
			driver.findElement(By.xpath("//div[@class='products ng-scope']/ul/descendant::li[4]/descendant::p/a[.='Buy']")).click();
		}
		for(int i=0;i<3;i++)
		{
			driver.findElement(By.xpath("//div[@class='products ng-scope']/ul/descendant::li[7]/descendant::p/a")).click();
		}
		driver.findElement(By.xpath("//li[@id='nav-cart']/a")).click();
		String subTotalForTeddyBear = "$25.98";

		String actSubTotalForTeddyBear = driver.findElement(By.xpath("//tbody/tr/td[4]")).getText();
		Assert.assertEquals(subTotalForTeddyBear, actSubTotalForTeddyBear);

		String subTottalForBluffBunny = "$49.95";
		String actsubTotalForBluffBunny = driver.findElement(By.xpath("//tbody/tr[2]/td[4]")).getText();
		Assert.assertEquals(subTottalForBluffBunny, actsubTotalForBluffBunny);
		
		String subTotalforValentineBear = "$44.97";
		String actSubTotalforValentineBear = driver.findElement(By.xpath("//tbody/tr[3]/td[4]")).getText();
		
		Assert.assertEquals(subTotalforValentineBear, actSubTotalforValentineBear);
		
	}

}
