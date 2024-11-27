package day29;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo2 {

	@Parameters("city")
	@Test
	public void testA(String c)
	{
		Reporter.log("testA:"+c,true);
	}
}
