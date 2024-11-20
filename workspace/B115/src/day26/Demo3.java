package day26;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
class Sample8 //POM class
{
	@FindBy(id="A8")
	private WebElement submitButton;
	
	
	Sample8(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickSubmit()
	{
		submitButton.click();
	}
	
	public void handleAlert(WebDriver driver) throws InterruptedException
	{
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.accept();	
	}
}

public class Demo3 {//Test Class

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///E:/B115%207PM%20Selenium/share/pages/Sample8.html?");
		driver.manage().window().maximize();
		
		Sample8 s=new Sample8(driver);
		s.clickSubmit();
		
		s.handleAlert(driver);
		
		driver.quit();
		

	}

}
