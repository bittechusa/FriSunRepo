import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;


public class SmokTest extends AppelTest

 {
	@Test
	public void red()
	
	{
		//dr.navigate().refresh();
		Keyboard kb = ((HasInputDevices)dr).getKeyboard();
		kb.sendKeys(Keys.F5);// without touch they keyboard refresh comment;
		
		try
		{   System.out.println(10/0);
			//dr.findElement(By.xpath("/*[@id='main-n-woman")).click();
			
		}
		
		catch(NoSuchElementException e)
		{
			System.out.println("passed");
		}
		catch(ArithmeticException e1)
		{
			System.out.println("Is not found");
		}
		
		finally
		{
			System.out.println("final positio");
		}
		
	}
	
	
	

}
