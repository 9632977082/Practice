package RedBus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://jupiter.cloud.planittesting.com/#/home");
		driver.findElement(By.xpath("//i[@class='icon icon-envelope icon-white']")).click();
		driver.findElement(By.xpath("//input[@id='forename']")).sendKeys("shiva");
		driver.findElement(By.xpath("//input[@name='surname']")).sendKeys("shankar");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shivashankarr36@gmail.com");
		driver.findElement(By.xpath("//input[@id='telephone']")).sendKeys("7204816510");
		driver.findElement(By.xpath("//textarea[@placeholder='Tell us about it..']")).sendKeys("good");
		driver.findElement(By.xpath("//a[.='Submit']")).click();
		String Act = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		String	 expected="Thanks shiva, we appreciate your feedback.";
		if(Act.contains(expected))
		{
			System.out.println("it is created");
		}
		else
		{
			System.out.println("not created");
		}

	}

}
