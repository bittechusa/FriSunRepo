import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Basetest {
	
	WebDriver dr;
	@Before
	public void bfore()
	{
		dr =new  FirefoxDriver();
		dr.get("http://www.bluefly.com");
	}
	
	/*@After
	public void after() throws Exception
	{
		Thread.sleep(3000);
		dr.quit();
	
	
	}*/
}
