package pom.java.bitt;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.LoadableComponent;




public class Homepage extends LoadableComponent<Homepage>
{  
	
	
	
	ChromeDriver driver;
	
	/*@FindBy(how = How.XPATH, using= ".//*[@id='main-nav-men']/div/div[5]/ul/li[2]/a")
	public WebElement shoe;
	*/
	
	
	public Homepage(WebDriver x)
	
	{
		driver= (ChromeDriver) x;
	}
	
	
	
	public Manpage clickman()
	{
	//	shoe.click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div[5]/div[1]")).click();
		driver.findElement(By.xpath("/html/body/div/header/div[2]/div[1]/ul/li[7]/a")).click();
		return new Manpage(driver);
		
	}
	@Override
	protected void isLoaded() throws Error 
	{
		// TODO Auto-generated method stub
		//System.out.println(driver.getCurrentUrl());
		Assert.assertFalse(driver.getCurrentUrl().contains("http://www.google.com/"));
	}
	@Override
	protected void load() {
		driver.get("http://www.bluefly.com/");
		
		System.out.println("yahoo");
		
	}

}
