package day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class GooglePage3
{
	@FindBy(id="APjFqb")
	private WebElement searchBox;
	
	GooglePage3(WebDriver driver)
	{
		PageFactory.initElements(driver, this );
	}
	public void setSearchBox()
	{
		searchBox.sendKeys("akshara training");
	}
	
}
public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		GooglePage3 g=new GooglePage3(driver);
		
		g.setSearchBox();
		
		Thread.sleep(1000);
		
		driver.quit();
	}

}
