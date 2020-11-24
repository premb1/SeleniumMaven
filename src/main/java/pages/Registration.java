package pages;

import org.openqa.selenium.WebDriver;

import utility.CommonFunctionalities;

public class Registration extends CommonFunctionalities{
	
	WebDriver driver;
	
	public Registration(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}
	
	public String getTitle()
	{
	return	driver.getTitle();
	}
	
	public void fullname(String fn,String ln)
	{
		type("firstname_xpath", fn);
		type("lastname_xpath",ln);
	}
	
	public void gender(String gen)
	{
		radioBtnValue(gen);
	}
	
	public void hobbies()
	{
		checkboxwithtwovalue("cricket", "hockey");
	}
	

}
