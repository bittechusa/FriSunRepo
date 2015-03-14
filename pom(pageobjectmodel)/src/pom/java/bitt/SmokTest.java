package pom.java.bitt;

import org.junit.Test;




public class SmokTest extends BaseTest
{
	//FirefoxDriver driver;
	Homepage hp;
	Manpage ma;
	
	@Test
	
	public void bangla()
	
	{
		hp=new Homepage(driver);
		hp.get();
		ma=hp.clickman();
		   //(new Manpage return)
		
		
	}

}
