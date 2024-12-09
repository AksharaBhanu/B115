package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBPage {
	@FindBy(id="email")
	private WebElement email;

	public FBPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void setUN(String un)
	{
		email.sendKeys(un);
	}
	
	
}
