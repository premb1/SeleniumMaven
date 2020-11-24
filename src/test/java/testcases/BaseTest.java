package testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import drivers.Initialization;

public class BaseTest {
	
	WebDriver d;
	@BeforeTest
	public void setup()
	{
	d=	Initialization.selectBrowser("chrome");
	
	}
	@AfterTest
	public void tearDown()
	{
		d.quit();
	}
	@AfterMethod
	public void takeSs(ITestResult result) throws IOException
	{
		if(result.isSuccess())
		{
			
		}
		else
		{
			File sc=	((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
			String filename="/screenshot/"+result.getName()+result.getStartMillis()+".png";
			FileUtils.copyFile(sc, new File(filename));
		
		}
	}

}
