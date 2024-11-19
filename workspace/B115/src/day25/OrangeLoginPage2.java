package day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeLoginPage2
{
	@FindBy(name="username")
	private WebElement userName;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginButton;
	
	OrangeLoginPage2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void setUserName(String un)
	{
		userName.sendKeys(un);
	}
	
	public void setPassword(String pw)
	{
		password.sendKeys(pw);
	}
	
	public void clickLoginButton()
	{
		loginButton.click();
	}
	
}