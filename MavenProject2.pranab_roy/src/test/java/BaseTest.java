import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTest {
	WebDriver dr;
	@Before
	public void beforeTest()
	{
	
		dr=new FirefoxDriver();
		dr.get("http://www.target.com");
		
	}
	@After
	public void afterTest()
	{
	dr.quit();
	}

}
