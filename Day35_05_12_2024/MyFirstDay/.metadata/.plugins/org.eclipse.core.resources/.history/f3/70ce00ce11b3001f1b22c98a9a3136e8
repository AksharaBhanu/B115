package script;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import page.LoginPage;

public class Invalid_Login extends BaseTest
{

	@Test(priority =2,groups={"login"})
	public void testInvalid_Login()
	{
//		1. enter invalid un
		LoginPage loginPage=new LoginPage(driver);
		loginPage.setUserName("abc");
//		2. enter invalid pw
		loginPage.setPassword("xyz");
//		3. click on go button
		loginPage.clickGoButton();
//		4. should display error msg
		boolean result = loginPage.verifyErrMsgIsDisplayed(wait);
		Assert.assertTrue(result);
	}
}
