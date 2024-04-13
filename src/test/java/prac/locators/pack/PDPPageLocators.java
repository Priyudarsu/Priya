package prac.locators.pack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import prac.junit.sam1.BaseClassMam;

public class PDPPageLocators extends BaseClassMam
{
	public PDPPageLocators()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='Add to cart']")	
	private WebElement addcart;
	@FindBy(xpath="//*[text()='Buy Now']")
	private WebElement buynow;
	@FindBy(xpath="//*[text()='Price details']")
	private WebElement price;
	@FindBy(xpath="(//*[text()='Total Amount']/parent::div/following-sibling::div/span/div/div/div)[2]/span")
	private WebElement amt;
	

	public WebElement getAddcart() {
		return addcart;
	}

    public WebElement getBuynow() {
		return buynow;
	}
    
	public WebElement getPrice()
	{
		return price;
	}
	public WebElement getAmount()
	{
		return amt;
	}

}
