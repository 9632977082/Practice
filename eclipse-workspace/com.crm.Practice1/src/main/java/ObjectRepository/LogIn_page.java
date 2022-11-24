package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn_page 
{
	//declaration
	@FindBy(xpath = "//input[@name='user_name']")
	private  WebElement User_name;
	@FindBy(xpath = "//input[@name='user_password']")
	private WebElement password;
	@FindBy(xpath = "//input[@id='submitButton']")
	private WebElement Btn;
	
	//initialization
	public LogIn_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//getters
	public WebElement getUser_name() 
	{
		return User_name;
	}

	public WebElement getPassword() 
	{
		return password;
	}

	public WebElement getBtn() 
	{
		return Btn;
	}
	
	//utilization
	
	public void Login(String UN,String PWD)
	{
		User_name.sendKeys(UN);
		password.sendKeys(PWD);
		Btn.click();
	}
	
	
	
	
	
	

}
