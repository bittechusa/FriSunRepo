package pom.java.bitt;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest
{
     WebDriver driver ; 
     
     @Before
     public void open()
     {
    	 System.setProperty("webdriver.chrome.driver","C://Driver//chromedriver.exe");
    	driver  = new ChromeDriver();
    	
    	driver.get("http://www.Bluefly.com"); 
     }
     @After
     public void close(){
     driver.quit();
     }
     
     
}
