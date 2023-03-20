package com.crm.ObjectRespository;

import org.apache.poi.ss.formula.functions.NumericFunction.TwoArg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page 
{
	WebDriver driver;
	@FindBy(xpath ="//a[.='Organizations']")
	private WebElement Organisation;
	@FindBy(xpath ="//img[@title='Import Organizations']")
	private  WebElement importOrg;
	@FindBy(xpath ="//tbody/tr[@style='cursor: pointer;']/td[6]/img[@alt='Open Calculator...']")
	private WebElement OpenCalCulator;
	@FindBy(xpath ="//tbody/tr[@style='height:5']/following-sibling::tr[4]/td[2]/input[@name='calc7']")
	private  WebElement Seven;
	@FindBy(xpath = "//tbody/tr[@style='height:5']/following-sibling::tr[4]/td[3]/input[@name='calc8']")
	private WebElement Eight;
	@FindBy(xpath = "//tbody/tr[@style='height:5']/following-sibling::tr[7]/td[5]/input[@name='plus']")
	private  WebElement Plus;
	@FindBy(xpath = "//tbody/tr[@style='height:5']/following-sibling::tr[6]/td[3]")
	private	WebElement two;
	@FindBy(xpath ="//tbody/tr[@style='height:5']/following-sibling::tr[7]/td[4]/input[@name='equal']")
	private  WebElement equal;
	public WebDriver getDriver() {
		return driver;
	}




public Home_page(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public WebElement getOrganisation() {
	return Organisation;
}



public WebElement getImportOrg() 
{
	return importOrg;
}
public WebElement getOpenCalCulator() {
	return OpenCalCulator;
}

public WebElement getSeven() {
	return Seven;
}

public WebElement getEight() {
	return Eight;
}

public WebElement getPlus() {
	return Plus;
}

public WebElement getTwo() {
	return two;
}

public WebElement getEqual() {
	return equal;

}
public void Organisation()
{
	Organisation.click();
	importOrg.click();
}

public void Organisation_1()
{
	Organisation.click();
}

public void Calculator()
{
	OpenCalCulator.click();
	Seven.click();
	Eight.click();
	Plus.click();
	two.click();
	equal.click();
	
}

}
