package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/");
		Thread.sleep(1000);
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		driver.quit();
		
		driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/");
		Thread.sleep(1000);
		driver.findElement(By.name("login-button")).submit();
		Thread.sleep(2000);
		driver.quit();
	}

}
