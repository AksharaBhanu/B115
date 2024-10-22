package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo5 {
//As per java coding std, it is better to use interface over class
//	hence we use WebDriver (which has max methods)
	
	public static void test(WebDriver driver)
	{
		driver.get("http://www.google.com");
		driver.quit();
	}
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		Demo5.test(driver);
		
		WebDriver driver2=new FirefoxDriver();
		Demo5.test(driver2);
		
		WebDriver driver3=new EdgeDriver();
		Demo5.test(driver3);
	}
}
