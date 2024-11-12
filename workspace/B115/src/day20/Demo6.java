package day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.get("file:///E:/B115%207PM%20Selenium/share/pages/Sample13.html");
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 driver.findElement(By.id("A1")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//option[text()='Delhi']")).click();
		 Thread.sleep(2000);
		 

	}

}
