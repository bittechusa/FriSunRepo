import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AppelTest {
	
	FirefoxDriver dr = new FirefoxDriver();
	
	@Before
	public void open()
	{
		dr.get("http://www.bluefly.com");
		dr.manage().window().maximize();
	}
	
	@After
	public void end() throws InterruptedException
	
	{   Thread.sleep(3000);
		dr.quit();
		
	}

}
