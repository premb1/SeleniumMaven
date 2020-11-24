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
import org.testng.annotations.Test;

import drivers.Initialization;
import pages.HomePage;
import pages.Registration;

public class Testcase2 extends BaseTest {
	

	
	@Test(priority=1)
	public void skip()
	{
		HomePage hp= new HomePage(d);
		hp.skipSiginIn();
	}
	
	@Test(priority=2)
	public void fillForm() throws InterruptedException
	{
		//Thread.sleep(3000);
		Registration r= new Registration(d);
		r.fullname("prem","kumar");
		r.gender("male");
		r.hobbies();
	}
	
}
