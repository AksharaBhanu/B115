package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.switchTo().frame("callout");
		driver.findElement(By.xpath("//button[text()='Stay signed out']")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
