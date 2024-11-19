package day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrangeLoginPage
{
	private WebElement userName;
	private WebElement password;
	private WebElement loginButton;
	
	OrangeLoginPage(WebDriver driver)
	{
		userName=driver.findElement(By.name("username"));
		password=driver.findElement(By.name("password"));
		loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
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