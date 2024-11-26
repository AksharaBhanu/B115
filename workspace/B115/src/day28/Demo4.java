package day28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo4 {

	@Test
	public void testA()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.fb.com");
		String actual=driver.getTitle();
		String expected="Google";
//		if(title.equals("Google"))
//		{
//			Reporter.log("Pass: Google page is displayed",true);
//		}
//		else
//		{
//			Reporter.log("Fail: Google page is Not displayed",true);
//			Assert.fail();
//		}
		Assert.assertEquals(actual,expected);
	
		
	}
}
