package day28;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo5 {

	@Test
	public void testA()
	{
		Reporter.log("StepA1",true);
		Assert.assertEquals("hi","hi");
		Reporter.log("StepA2",true);
	}
	
	@Test
	public void testB()
	{
		Reporter.log("StepB1",true);
		Assert.assertEquals("hi","bye");//exit the test-it will not execute remaining code of the test
		Reporter.log("StepB2",true);
	}
	
	@Test
	public void testC()
	{
		Reporter.log("StepC1",true);
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals("hi","bye");
		Reporter.log("StepC2",true);
		softAssert.assertAll();
	}
}
