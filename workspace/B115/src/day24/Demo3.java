package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class GooglePage
{
	private WebElement searchBox;
	
	GooglePage(WebDriver driver)
	{
		searchBox = driver.findElement(By.id("APjFqb"));
	}
	
	public void setSearchBox()
	{
		searchBox.sendKeys("akshara training");
	}
	
}
public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		GooglePage g=new GooglePage(driver);
		g.setSearchBox();
		
		Thread.sleep(1000);
		
		driver.quit();
	}

}
