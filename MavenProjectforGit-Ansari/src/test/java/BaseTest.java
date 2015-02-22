import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTest 
{
	WebDriver dr;
	
	
	@Before
	
	public void m1()
	{
		dr = new FirefoxDriver();
		dr.get("http://www.bluefly.com");
	}
	
	@After
	
	public void end()
	{
		// dr.quit();
	}
	
	
	

}
