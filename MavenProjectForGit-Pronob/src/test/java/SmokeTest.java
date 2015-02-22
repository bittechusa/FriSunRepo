import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;



public class SmokeTest extends Basetest  {
	@Test
	public void mai()
	{
	
		//dr.navigate().refresh();
		Keyboard kb=((HasInputDevices)dr).getKeyboard();
		kb.sendKeys(Keys.F5);
		try{
			System.out.println(10/0);
		//dr.findElement(By.xpath("html/body/div[1]/header/div[2]/div[1]/ul/li[7]/22")).click();
		}
		
		
		catch(NoSuchElementException e)
		{
			System.out.println("Element not found");
		}
		
		catch(ArithmeticException e1)
		{
			System.out.println("not vaild");
		}
		
		catch(Exception e2)
		{
			System.out.println("Parent exception");
		}
		finally
		{
			System.out.println("This is finally");
		}
		
		
		}
	}

	
	


