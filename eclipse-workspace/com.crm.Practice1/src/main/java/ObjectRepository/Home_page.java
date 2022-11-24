package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page 
{
	//declaration
	@FindBy(xpath = "//a[.='More']")
	private WebElement More;
	@FindBy(xpath = "//a[.='Campaigns']")
	private  WebElement Campaigns;
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private  WebElement Administrator;
	@FindBy(xpath = "//a[.='Sign Out']")
	private WebElement signout;
	@FindBy(xpath = "//a[.='Organizations']")
	private  WebElement Organisation;
	@FindBy(xpath = "//a[.='Products']")
	 private  WebElement Product;
	
	

	

	//initialization
	public Home_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//getters
	public WebElement getMore()
	{
		return More;
	}

	public WebElement getOrganisation() 
	{
		return Organisation;
	}

	public WebElement getCampaigns() 
	{
		return Campaigns;
	}

	public WebElement getAdministrator() 
	{
		return Administrator;
	}

	public WebElement getSignout() 
	{
		return signout;
		
	}
	
	public WebElement getProduct() 
	{
		return Product;
	}
	
	
	
	//utilization
	public void Campaign()
	{
		More.click();
		Campaigns.click();
	}
	
	public void SignOut()
	{
		Administrator.click();
		signout.click();
	}
	public void Organisations()
	{
		Organisation.click();
	}
	public void Product()
	{
		Product.click();
	}
	
}
