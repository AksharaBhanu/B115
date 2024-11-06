package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B115%207PM%20Selenium/share/pages/Sample9.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);//go inside the frame
		driver.findElement(By.id("t2")).sendKeys("A");
		driver.switchTo().defaultContent();//exit from the frame
		driver.findElement(By.id("t1")).sendKeys("A");
		
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("B");
		driver.switchTo().defaultContent();//exit from the frame
		driver.findElement(By.id("t1")).sendKeys("B");
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@src='sample9b.html']"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.id("t2")).sendKeys("C");
		driver.switchTo().defaultContent();//exit from the frame
		driver.findElement(By.id("t1")).sendKeys("C");
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
