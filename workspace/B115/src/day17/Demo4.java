package day17;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B115%207PM%20Selenium/share/pages/Sample10.html");
		Thread.sleep(1000);
		driver.findElement(By.id("A1")).click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());//get msg present on popup
		alert.accept();
		alert.dismiss();

		
		
	}
}
