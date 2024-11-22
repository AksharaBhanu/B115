package day27;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo9 {

	@Test(invocationCount = 3)
	public void m1()
	{
		Reporter.log("m1",true);
	}
}
