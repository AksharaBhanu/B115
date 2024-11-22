package day27;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Demo11Parent {
	@BeforeClass
	public void openApp() {
		Reporter.log("openApp",true);
	}
	
	@AfterClass
	public void closeApp()
	{
		Reporter.log("closeApp",true);
	}
	
	@BeforeMethod
	public void login()
	{
		Reporter.log("Login",true);
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("Logout",true);
	}
	
}
