package prac.locators.pack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.PageFactory;

import prac.junit.sam1.BaseClassMam;

public class PLPPageLocatorsEx extends BaseClassMam
{
	public PLPPageLocatorsEx()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[text()='Sort By']") 
	private WebElement sortbybtn;
	
	public WebElement getSortBy()
	{
		return sortbybtn;
	}
	@FindAll({
		@FindBy(xpath="//*[@loading='eager']"),
		@FindBy(xpath="//*[contains(@alt, 'REDMI')]")
	})
	private WebElement redmiMob;

	
	public WebElement getRedmiMob() {
		return redmiMob;
	}

}
