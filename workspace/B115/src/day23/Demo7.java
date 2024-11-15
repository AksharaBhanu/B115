package day23;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
//write a script to check if page is loaded or not with in 3s
public class Demo7 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Duration defaultPageLoadTimeOut = driver.manage().timeouts().getPageLoadTimeout();
		System.out.println(defaultPageLoadTimeOut);
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
		Duration modifiedPageLoadTimeOut = driver.manage().timeouts().getPageLoadTimeout();
		System.out.println(modifiedPageLoadTimeOut);
		
		//enter the url in address bar & wait till the page is loaded
		try 
		{
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			System.out.println("Page is loaded within 3s");
		}
		catch (Exception e) 
		{
			System.out.println("Page is NOT loaded within 3s");
		}
		driver.quit();
	}

}
