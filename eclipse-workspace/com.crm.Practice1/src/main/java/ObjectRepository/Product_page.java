package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_page 
{
	//inititalization

	@FindBy(xpath = "//img[@title='Create Product...']")
	private  WebElement Product_btn;
	@FindBy(xpath = "//input[@name='productname']")
	private  WebElement productname;
	@FindBy(xpath ="//input[@class='crmbutton small save']" )
	private  WebElement save;

	//declaration
	public Product_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}



	//getters
	public WebElement getProduct_btn() 
	{
		return Product_btn;
	}

	public WebElement getProductname() 
	{
		return productname;
	}

	public WebElement getSave() 
	{
		return save;
	}

	//utilization
	public void CreateProduct(String data)
	{
		Product_btn.click();
		productname.sendKeys(data);
		save.click();
	}
}
