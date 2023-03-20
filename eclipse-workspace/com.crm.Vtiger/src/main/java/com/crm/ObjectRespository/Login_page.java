package com.crm.ObjectRespository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page 
{
	WebDriver driver;
	//declaration
	@FindBy(xpath ="//input[@name='user_name']")
	private WebElement un;
	@FindBy(xpath ="//input[@name='user_password']")
	private WebElement pwd;
	@FindBy(xpath ="//input[@id='submitButton']")
	private  WebElement button;

	public Login_page(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() 
	{
		return driver;
	}

	public WebElement getUn()
	{
		return un;
	}

	public WebElement getPwd()
	{
		return pwd;
	}

	public WebElement getButton() 
	{
		return button;
	}
	public void login(String UN,String PWD)
	{
		un.sendKeys(UN);
		pwd.sendKeys(PWD);
		button.click();
		
	}

}
