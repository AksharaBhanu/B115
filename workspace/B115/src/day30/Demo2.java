package day30;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo2 {
	//LG---> Local Grid
	//SG-->Saucelabs Grid
	String LG="";
	String SG="";
	
	@Parameters({"system","browser"})
	@Test
	public void testA(String system, String browser) throws Exception
	{
		WebDriver driver;
		URL gridURL;
		String sys="";
		if(system.equals("LG"))
		{
			sys="Akashara Grid";
			gridURL=new URL(LG);
		}
		else
		{
			sys="Saucelabs Grid";
			gridURL=new URL(SG);
		}
		
		if(browser.equals("chrome"))
		{
			Reporter.log("Open Chrome Browser in "+sys,true);
			driver=new RemoteWebDriver(gridURL, new ChromeOptions());
		}
		else
		{
			Reporter.log("Open Edge Browser in "+sys,true);
			driver=new RemoteWebDriver(gridURL, new EdgeOptions());
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
