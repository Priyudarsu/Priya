package prac.locators.pack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import prac.junit.sam1.BaseClassMam;

public class HomePageLocators1 extends BaseClassMam
{
	public HomePageLocators1()
	{
		PageFactory.initElements(driver, this);
	}
	//WebElement closebtn=driver.findElement(null);
	@FindBy(xpath="//*[text()='✕']")
	private WebElement closebtn;
    @FindBy(name="q")
    private WebElement searchinputField;
    
	public WebElement getClosebtn()
	{
	return closebtn;
	}
	public WebElement getSearchfield()
	{
		return searchinputField;
	}
	
}


