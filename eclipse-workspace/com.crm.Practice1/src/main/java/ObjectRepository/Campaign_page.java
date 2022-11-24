package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Campaign_page 
{
	//declaration
	@FindBy(xpath = "//img[@title='Create Campaign...']")
	private  WebElement Camapign_btn;
	@FindBy(xpath = "//input[@name='campaignname']")
	private WebElement campaign_name;
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement save;
	@FindBy(xpath = "//img[@title='Select']")
	private  WebElement select;
	@FindBy(xpath = "//input[@id='search_txt']")
	private   WebElement Search_text;
	@FindBy(xpath = "//input[@value='  Search Now  ']")
	private  WebElement Search_now;
	@FindBy(xpath = "//a[.='TEST YANTRA201']")
	private   WebElement Test_yantra;





	//initialization
	public Campaign_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}



	//getters
	public WebElement getCamapign_btn() 
	{
		return Camapign_btn;
	}

	public WebElement getCampaign_name()
	{
		return campaign_name;
	}

	public WebElement getSelect() {
		return select;
	}



	public WebElement getSearch_text() {
		return Search_text;
	}



	public WebElement getSearch_now() {
		return Search_now;
	}



	public WebElement getTest_yantra() {
		return Test_yantra;
	}



	public WebElement getSave()
	{
		return save;
	}

	//utilization
	public void create_campaign(String data)
	{
		Camapign_btn.click();
		campaign_name.sendKeys(data);
		save.click();
	}
	public void Create_campaignwithProduct(String data)
	{
		Camapign_btn.click();
		campaign_name.sendKeys(data);
		select.click();
	}
	public void addProductIntoCampaign(String data1)
	{
		Search_text.sendKeys(data1);
		Search_now.click();
		Test_yantra.click();
	}
	public void Save()
	{
		save.click();
	}


}
