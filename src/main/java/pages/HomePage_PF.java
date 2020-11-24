package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage_PF {
	
	
	@FindBy(how=How.ID,using="btn1")
    private	WebElement sigin;
	
	public void siginIn()
	{
		sigin.click();
	}

	@FindBy(how=How.ID,using="btn2")
	@CacheLookup
	private WebElement skip;
	public void skipSiginIn()
	{
		skip.click();
	}
	
	@FindBy(how=How.XPATH,using="//input[@type='checkbox']")
	List<WebElement> radios;
	public void clikcrb()
	{
		for(WebElement r:radios)
		{
		String v=	r.getAttribute("value");
		if(v.equalsIgnoreCase("male"))
		{
			r.click();
		}
		}
	}
}
