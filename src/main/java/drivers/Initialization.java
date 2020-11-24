package drivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Initialization {

	
	static WebDriver driver;
	
	public static  WebDriver selectBrowser(String bname)
	{
		if(bname.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(bname.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "");
			driver= new FirefoxDriver();
		}
		driver.get("http://demo.automationtesting.in/Index.html");
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		return driver;
	}
}
