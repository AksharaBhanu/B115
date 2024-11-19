package day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class GooglePage1
{
	@FindBy(id="APjFqb")
	private WebElement searchBox;
	
	public void setSearchBox()
	{
		searchBox.sendKeys("akshara training");
	}
	
}
public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		GooglePage1 g=new GooglePage1();
		g.setSearchBox();
		
		Thread.sleep(1000);
		
		driver.quit();
	}

}
