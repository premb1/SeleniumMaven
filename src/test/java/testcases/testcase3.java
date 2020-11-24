package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.HomePage_PF;

public class testcase3 extends BaseTest{
	
	@Test
	public void skipsigin()
	{
		HomePage_PF hp=	PageFactory.initElements(d, HomePage_PF.class);
		hp.skipSiginIn();
	}

}
