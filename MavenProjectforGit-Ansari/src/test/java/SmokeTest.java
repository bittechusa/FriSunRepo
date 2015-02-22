import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;

import com.sun.jna.platform.win32.WinUser.KBDLLHOOKSTRUCT;


public class SmokeTest extends BaseTest
{
	@Test
	
	public void m2()
	{
		dr.manage().window().maximize();
		//dr.navigate().refresh();
		
		Keyboard kb = ((HasInputDevices)dr).getKeyboard();
		kb.sendKeys(Keys.F5);
		
		try
		{
			System.out.println(10/0);
			dr.findElement(By.xpath(".//*[@id='main-nav-shoes']/a/a")).click();
		}
		
		catch (NoSuchElementException c)
		{
			System.out.println("Element not found");
		}
		catch (ArithmeticException e)
		{
			System.out.println("not valid");
		}
		catch (Exception l)
		{
			
		}
		finally
		{
//			database connection close;
		}
		
		System.out.println("Passed");
//		database connection close;
		
	}
	

}
