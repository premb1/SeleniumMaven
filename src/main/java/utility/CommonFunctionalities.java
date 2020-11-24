package utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.html5.GetLocalStorageItem;

public class CommonFunctionalities {
	
	WebDriver driver;
	
	public CommonFunctionalities(WebDriver d)
	{
		this.driver=d;
	}
	
	public void click(String loc)
	{
		driver.findElement(getLcatorType(loc)).click();
	}
	
	
	public void clear(String loc)
	{
		driver.findElement(getLcatorType(loc)).clear();
	}
	
	public void type(String loc,String val)
	{
		driver.findElement(getLcatorType(loc)).sendKeys(val);
	}
	
	
	public By getLcatorType(String key)
	{
	String[] v=	key.split("_");
	switch(v[1])
	{
	case "id":return  By.id(ProReader.getLocator(key));
				
	case "name": return By.name(ProReader.getLocator(key));
	
	case "xpath":return By.xpath(ProReader.getLocator(key));

	case "link":return By.linkText(ProReader.getLocator(key));
	
	case "css":return By.cssSelector(ProReader.getLocator(key));
	
	
	default: System.out.println("Not valid locators");
	
	}
	return null;
	
	}
	
	public void radioBtnValue(String value)
	{
		List<WebElement>	 rb=	driver.findElements(By.xpath("//input[@type='radio']"));
		for(WebElement r:rb)
		{
		String val=	r.getAttribute("value");
		if(val.equalsIgnoreCase(value))
		{
		r.click();	
		}
		}
	}
	
	public void checkboxwithtwovalue(String val1,String val2)
	{
		List<WebElement> cb =driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement c:cb)
		{
		String val=	c.getAttribute("value");
		if(val.equalsIgnoreCase(val1)||val.equalsIgnoreCase(val2))
		{
			c.click();
		}
		}
	}

}
