package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B115%207PM%20Selenium/share/pages/Sample8.html");
		
		driver.findElement(By.id("A1")).sendKeys(".");
		try 
		{
			driver.findElement(By.id("A4")).sendKeys(".");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		driver.quit();
	}

}
