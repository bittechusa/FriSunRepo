package pom.java.bitt;




import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Manpage 

{
	ChromeDriver driver;
	
	
	public Manpage(ChromeDriver x)
	{
		 driver=x;
		
		 
	}
	public SHOES clickMan()
	{
		driver.findElement(By.xpath(".//*[@id='main-nav-men']/div/div[4]/ul[1]/li[1]/a")).click();
		return new SHOES(driver);
	}
	 
	
	
}
