package day18;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B115%207PM%20Selenium/share/pages/Sample11.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("A5")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
