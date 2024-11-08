package day18;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.out.println(driver);
		String wh = driver.getWindowHandle();
		System.out.println(wh);
		
		driver.get("file:///E:/B115%207PM%20Selenium/share/pages/Sample11.html");
		Thread.sleep(1000);
		driver.findElement(By.id("A5")).click();
		Thread.sleep(1000);
		
		Set<String> whs = driver.getWindowHandles();
		System.out.println(whs.size());
		
		for(String s:whs)
		{
			System.out.println(s);
		}
		driver.quit();
	}

}
