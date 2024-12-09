package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id="input-username")
	private WebElement userNameTB;
	
	@FindBy(id="input-password")
	private WebElement passwordTB;
	
	@FindBy(name="login-button")
	private WebElement goButton;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void setUserName(String un)
	{
		userNameTB.sendKeys(un);
	}
	
	public void setPassword(String pw)
	{
		passwordTB.sendKeys(pw);
	}
	
	public void clickGoButton()
	{
		goButton.click();
	}
	
	
}
