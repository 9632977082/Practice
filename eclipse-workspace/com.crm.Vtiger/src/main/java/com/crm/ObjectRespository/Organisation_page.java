package com.crm.ObjectRespository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organisation_page 

{
	WebDriver driver;




	@FindBy(xpath ="//input[@name='import_file']")
	private  WebElement Import;
	@FindBy(xpath ="//input[@name='next']")
	private  WebElement Next;
	@FindBy(xpath ="//select[@name='mapped_fields']")
	private WebElement createdBy;
	@FindBy(xpath ="//tbody/tr[@class='fieldIdentifier']/following-sibling::tr/td[3]/input[@type='hidden']/following-sibling::select[@name='mapped_fields']")
	private  WebElement projectName;
	@FindBy(xpath ="//tbody/tr[@class='fieldIdentifier']/following-sibling::tr[2]/td[3]/input[@type='hidden']/following-sibling::select[@name='mapped_fields']")
	private  WebElement CreatedBy1;
	@FindBy(xpath ="//tbody/tr[@class='fieldIdentifier']/following-sibling::tr[3]/td[3]/input/following-sibling::select")
	private  WebElement TeamSize;
	@FindBy(xpath ="//input[@name='import']")
	private  WebElement Import_button;
	@FindBy(xpath ="//span[.='Save as Custom Mapping']/preceding-sibling::input[@name='save_map']")
	private  WebElement Check;
	@FindBy(xpath ="//input[@value='Finish']")
	private WebElement finish;
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']" )
	private WebElement admin;
	@FindBy(xpath ="//a[.='Sign Out']")
	private WebElement sign_btn;
	@FindBy(xpath ="//td[.=' Administrator ']/preceding-sibling::td[6]")
	private WebElement AdministratorRow;
	@FindBy(xpath ="//input[@value='Delete']")
	private  WebElement DeleteRow;
	@FindBy(xpath ="//input[@name='search_text']")
	private   WebElement Search_text;
	@FindBy(xpath ="//input[@value=' Search Now ']")
	private WebElement  SearchNowButton;
	@FindBy (xpath ="//td[.=' Administrator ']/preceding-sibling::td[5]")
	private  WebElement Text;

	
	public Organisation_page(WebDriver driver)
	{ 
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}

	public WebElement getSearch_text() 
	{
		return Search_text;
	}



	public WebElement getSearchNowButton() 
	{
		return SearchNowButton;
	}

	public WebElement getProjectName() 
	{
		return projectName;
	}

	public WebElement getCreatedBy()
	{
		return createdBy;
	}

	public WebElement getNext() 
	{
		return Next;
	}

	public WebElement getImport() 
	{
		return Import;
	}
	public WebElement getTeamSize() 
	{
		return TeamSize;
	}
	public WebElement getCreatedBy1() 
	{
		return CreatedBy1;
	}

	public WebElement getImport_button() 
	{
		return Import_button;
	}
	public WebElement getCheck() 
	{
		return Check;
	}
	public WebElement getFinish() 
	{
		return finish;
	}
	public WebElement getAdmin() 
	{
		return admin;
	}



	public WebElement getSign_btn()
	{
		return sign_btn;
	}

	public WebElement getAdministratorRow() 
	{
		return AdministratorRow;
	}
	public WebElement getText()
	{
		return Text;
	}



	public WebElement getDeleteRow()
	{
		return DeleteRow;
	}
	public void importButton(String path)
	{
		Import.sendKeys(path);

	}
	public void NextButton()
	{
		Next.click();
	}

	public void checkBox()
	{
		Check.click();
	}
	public void Import()
	{
		Import_button.click();
	}
	public void Finish()
	{
		finish.click();
	}
	public void SignOut()
	{
		admin.click();
		sign_btn.click();
	}
	public void DeleteRow()
	{
		AdministratorRow.click();
		DeleteRow.click();
	}
	public void EnterTheValue(String id)
	{
		Search_text.sendKeys(id);
		SearchNowButton.click();
	}


}
