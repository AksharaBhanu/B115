package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
				
//		WebElement frameElement = driver.findElement(By.xpath("//iframe[@role='presentation']"));
//		driver.switchTo().frame(frameElement);
//		driver.findElement(By.xpath("//button[text()='Stay signed out']")).click();
//		Thread.sleep(2000);
//		driver.switchTo().defaultContent();
//		Thread.sleep(2000);
//		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
//		Thread.sleep(2000);
//		driver.quit();

	}

}
