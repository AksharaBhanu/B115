package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class POSLoginPage
{
	private WebElement userName;
	private WebElement password;
	private WebElement goButton;
	
	POSLoginPage(WebDriver driver)
	{
		userName=driver.findElement(By.id("input-username"));
		password=driver.findElement(By.id("input-password"));
		goButton=driver.findElement(By.name("login-button"));
	}
	
	public void setUserName()
	{
		userName.sendKeys("admin");
	}
	
	public void setPassword()
	{
		password.sendKeys("pointofsale");
	}
	
	public void clickGoButton()
	{
		goButton.click();
	}
	
}
public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/");
		POSLoginPage p=new POSLoginPage(driver);
		p.setUserName();
		p.setPassword();
		p.clickGoButton();
		Thread.sleep(2000);
		driver.quit();
	}

}
