package prac.login.page;

import java.util.NoSuchElementException;

import org.openqa.selenium.Keys;

import prac.junit.sam1.BaseClassMam;
import prac.locators.pack.HomePageLocators1;

public class HomePageLogin1 extends BaseClassMam
{
	public static void test()
	{
		try {
			browserOpen("chrome");
			loadUrl("https://www.flipkart.com");
			driver.manage().window().maximize();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
public static void clickclosebtn()
{
try {
	HomePageLocators1 hpl=new HomePageLocators1();
	click(hpl.getClosebtn());
}catch(NoSuchElementException e) {
	System.out.println("close button is not visible");
}
catch(Exception e)
{
	System.out.println(e.getMessage());
}
}
public static void searchData(String data)
{
	try {
		HomePageLocators1 hpl=new HomePageLocators1();
		hpl.getSearchfield().sendKeys(data,Keys.ENTER);
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}
}
