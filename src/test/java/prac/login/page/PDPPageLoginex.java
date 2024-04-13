package prac.login.page;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import prac.junit.sam1.BaseClassMam;
import prac.locators.pack.PDPPageLocators;

public class PDPPageLoginex extends BaseClassMam
{
	public static void switchwd()
	{
		  Set<String> id=driver.getWindowHandles();
		   List<String> listwdw=new ArrayList(id);
		   driver.switchTo().window(listwdw.get(1));
	}
   public static void verifyredirects() {
	   try
		{
		   PDPPageLocators pdp=new PDPPageLocators();
			WebElement buy=pdp.getBuynow();
			if(buy.isDisplayed())
			{
				System.out.println("user redirected to addtocart page");
			}}
		catch(NoSuchElementException e)
		{
			Assert.fail("user not redirected to the page");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	public static void clicktoproduct()
	{
		try
		{
			PDPPageLocators pdp=new PDPPageLocators();
			WebElement pdp1=pdp.getAddcart();
			click(pdp1);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void checkredirects()
	{
		try
		{
			PDPPageLocators pdp=new PDPPageLocators();
			WebElement prc=pdp.getPrice();
			if(prc.isDisplayed())
			{
				System.out.println("user redirected");
			}}
		catch(NoSuchElementException e)
		{
			Assert.fail("user not redirected to the page");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void printamount()
	{
		try
		{
			PDPPageLocators pdp=new PDPPageLocators();
			WebElement pdp1=pdp.getAmount();
			String text=pdp1.getText();
			System.out.println("Total amount is "+text);
		}
		catch(Exception e)
		{
			System.out.println("invalid");
		}
	}
	}
	


