package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organisation_page 
{
	//declaration

	@FindBy(xpath = "//img[@title='Create Organization...']")
	private  WebElement Org_btn;
	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement Act_name;
	@FindBy(xpath = "//input[@class='crmbutton small save']")
	private  WebElement save;

	
	//initialization
	public Organisation_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	
	
	//getters
	public WebElement getOrg_btn() 
	{
		return Org_btn;
	}


	public WebElement getAct_name()
	{
		return Act_name;
	}


	public WebElement getSave() 
	{
		return save;
	}
	
	//utilization
	public void createOrganisation(String data)
	{
		Org_btn.click();
		Act_name.sendKeys(data);
		save.click();
		
	}
	
	
}
