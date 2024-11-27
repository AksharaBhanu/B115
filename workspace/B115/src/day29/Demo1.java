package day29;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {

	@Test
	public void createCustomer()
	{
		Reporter.log("Create Customer",true);
		Assert.fail();
	}
	
	@Test(dependsOnMethods = "createCustomer")
	public void deleteCustomer()
	{
		Reporter.log("Delete Customer",true);
	}
}
