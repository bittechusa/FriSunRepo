package pom.java.bitt;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SHOES
{	ChromeDriver driver;

	public SHOES(ChromeDriver d)
	{
		driver = d ;
	}
	public String clickShoes()
	{
		driver.findElement(By.xpath("")).click();
		
		return "yahoo";
		
	}

}
