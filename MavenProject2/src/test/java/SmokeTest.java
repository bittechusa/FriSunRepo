import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;


public class SmokeTest extends BaseTest {
	@Test
	
	public void Method1()
	{
		try
		{
			System.out.println(10/0);
			dr.findElement(By.xpath("html/body/div[4]/div/div[1]/div[4]/div[1]/ul/li[2]/span/b")).click();
			
		}
		
		catch (ArithmeticException e1)
		{
			System.out.println("Invalid entry");
		}
		catch (NoSuchElementException e)
	
		{
			System.out.println("Element does not Exit");
		}
		catch (Exception e2)
		{
			System.out.println("Parent Exception");
		}
		finally
		{
			System.out.println("finally --------");
			
		}
		
	}

}
