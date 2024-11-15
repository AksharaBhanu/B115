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

public class Demo6 {
	//Solution for NSEE:Solution 5
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		for(int i=1;i<=50;i++)
		{
			try 
			{
				driver.findElement(By.name("username")).sendKeys("admin");
				System.out.println("Username TB is present:"+i);
				break;
			}
			catch (Exception e) 
			{
				System.out.println("Username TB is not present:"+i);
			}
		}
		System.out.println("Done");
	}

}
