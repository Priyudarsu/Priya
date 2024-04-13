package prac.login.page;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import prac.locators.pack.PLPPageLocatorsEx;

public class PLPPageLoginex 
{
	public static void userredirectschk()
	{
		try {
	PLPPageLocatorsEx sby=new PLPPageLocatorsEx();
	WebElement SortBY=sby.getSortBy();
		if(SortBY.isDisplayed())
		{
			System.out.println("user redirected to the page");
		}}
		catch(NoSuchElementException e) {
			Assert.fail("user is not redirected to the page");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}}
		public static void clickonFirstProduct()
		{
		try {
			PLPPageLocatorsEx sby=new PLPPageLocatorsEx();
			WebElement rr=sby.getRedmiMob();
			rr.click();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}}


