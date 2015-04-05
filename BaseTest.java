package mavenFridayNight;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest
{
	WebDriver driver;
	@Before
	public void start()
	{
		String b=System.getProperty("browser");
		if(b.endsWith("f"))
		{
			driver=new FirefoxDriver();
			driver.get("http://www.facebook.com");
			
		}
		else if(b.equals("c"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asrafull\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver.get("http://www.eshopper24.com");
		}
		else if(b.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Asrafull\\Downloads\\IEDriverServer_x64_2.44.0\\IEDriverServer.exe");
			driver.get("http://www.bluefly.com");
		}
		else
		{
			driver=new FirefoxDriver();
			driver.get("http://www.facebook.com");
		}
	}
	@After
	public void off()
	{
		driver.quit();
	}

}
