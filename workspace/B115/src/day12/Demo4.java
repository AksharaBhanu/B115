package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B115%207PM%20Selenium/share/pages/Sample8.html");
		Thread.sleep(1000);
		driver.findElement(By.id("A7")).submit();
		System.out.println("Clicked on OK Button");
		Thread.sleep(1000);
		driver.quit();
		
		
		
	}

}
