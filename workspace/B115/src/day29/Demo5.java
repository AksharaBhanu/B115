package day29;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo5 {

	@Parameters({"browser"})
	@Test
	public void testA(@Optional("edge") String browser) throws InterruptedException
	{
		WebDriver driver;
		
		if(browser.equals("chrome"))
		{
			Reporter.log("Open Chrome Browser",true);
			driver=new ChromeDriver();
			driver.manage().window().setPosition(new Point(800,10));
		}
		else
		{
			Reporter.log("Open Edge Browser",true);
			driver=new EdgeDriver();
		}
		
		
		driver.get("https://pos.aksharatraining.in/pos/public/");
		for(int i=1;i<=10;i++) {
		driver.findElement(By.id("input-username")).sendKeys("admin");
		Thread.sleep(500);
		driver.findElement(By.id("input-username")).clear();
		Thread.sleep(500);
		}
		driver.quit();
	}
}
