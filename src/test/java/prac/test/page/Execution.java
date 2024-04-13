package prac.test.page;

import org.junit.Test;

import prac.junit.sam1.BaseClassMam;
import prac.login.page.HomePageLogin1;
import prac.login.page.PDPPageLoginex;
import prac.login.page.PLPPageLoginex;

public class Execution extends BaseClassMam
{
	@Test
	public void validate() throws Exception
	{
		String data=getTestData("SearchData");
		HomePageLogin1.test();
		HomePageLogin1.clickclosebtn();
		HomePageLogin1.searchData(data);
		PLPPageLoginex.userredirectschk();
		PLPPageLoginex.clickonFirstProduct();
		PDPPageLoginex.switchwd();
		PDPPageLoginex.verifyredirects();
		PDPPageLoginex.clicktoproduct();
		PDPPageLoginex.checkredirects();
		PDPPageLoginex.printamount();
	}

}
