package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.CommonFunctionalities;
import utility.ProReader;

public class HomePage extends CommonFunctionalities {
	
WebDriver driver;
	public HomePage(WebDriver d)
	{
		super(d);
		this.driver=d;
	}
	public void siginIn()
	{
		click("siginin_id");
	}
	
	public void skipSiginIn()
	{
	click("skipsignin_id");
	}
	
	public void enterEmail()
	{
		type("email_id", "abc@gmail");
	}
	
	public void navigateRegPage()
	{
		click("submit_id");
	}

}
