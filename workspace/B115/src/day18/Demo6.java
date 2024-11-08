package day18;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B115%207PM%20Selenium/share/pages/Sample11.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("A5")).click();
		Thread.sleep(1000);
		Set<String> allWindows = driver.getWindowHandles();
		/*iteration 1: parent to parent
		 * iteration 2:parent to child 1
		 * iteration 3:child1 to child 2
		 * 
		 */
		for(String wh:allWindows)
		{
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());
		}
		
		
		driver.quit();
	}

}
