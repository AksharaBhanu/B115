package day06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//NoSuchElementException
public class Demo2 
{//run this code and post the screenshot in zoom chat
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B115%207PM%20Selenium/share/pages/Sample3.html");
		WebElement element = driver.findElement(By.tagName("xyz"));
		element.click();
	}

}
