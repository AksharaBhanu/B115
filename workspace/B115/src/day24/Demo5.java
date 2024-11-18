package day24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class OrangeLoginPage
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
public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		OrangeLoginPage p=new OrangeLoginPage(driver);
		p.setUserName("admin");
		p.setPassword("admin123");
		p.clickLoginButton();
		Thread.sleep(2000);
		driver.quit();
	}

}
