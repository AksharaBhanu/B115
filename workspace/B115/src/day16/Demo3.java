package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B115%207PM%20Selenium/share/pages/Sample9.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("t1")).sendKeys("ABC");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("XYZ");
	}

}
