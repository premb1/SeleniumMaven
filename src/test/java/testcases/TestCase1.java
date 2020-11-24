package testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.relevantcodes.extentreports.LogStatus;

import drivers.Initialization;
import pages.HomePage;
import pages.Registration;

public class TestCase1 {
	
	WebDriver d;
	Logger log= Logger.getLogger(TestCase1.class);
	@BeforeTest
	public void setup()
	{
		log.info("**************pgm execution start**********");
	d=	Initialization.selectBrowser("chrome");
	log.debug("Runnig in chrome brower");
	}
	@Test
	public void skip()
	{
		log.error("Skip the sigin button");
		HomePage hp= new HomePage(d);
		hp.skipSiginIn();
	}
	
	@Test
	public void validate()
	{
		Registration r = new Registration(d);
		String title=r.getTitle();
		Assert.assertEquals("Register", title);
	}
	@AfterTest
	public void tearDown()
	{
		d.quit();
		log.info("*********************Finished test execution*************");
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
