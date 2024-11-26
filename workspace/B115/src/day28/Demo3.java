package day28;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo3 {

	@BeforeMethod(alwaysRun = true)
	public void login()
	{
		Reporter.log("login",true);
	}
	
	@AfterMethod(alwaysRun = true)
	public void logout()
	{
		Reporter.log("logout",true);
	}
	
	@Test(priority = 1,groups= {"customer","smoke"})
	public void createCustomer()
	{
		Reporter.log("createCustomer",true);
	}
	@Test(priority = 2,groups= {"customer"})
	public void editCustomer()
	{
		Reporter.log("editCustomer",true);
	}
	@Test(priority = 3,groups= {"customer"})
	public void deleteCustomer()
	{
		Reporter.log("deleteCustomer",true);
	}
	
	@Test(priority = 4,groups= {"product","smoke"})
	public void createProduct() 
	{
		Reporter.log("createProduct",true);
	}
	@Test(priority = 5,groups= {"product"})
	public void editProduct()
	{
		Reporter.log("editProduct",true);
	}
	@Test(priority = 6,groups= {"product"},enabled = false)
	public void deleteProduct()
	{
		Reporter.log("deleteProduct",true);
	}
}
