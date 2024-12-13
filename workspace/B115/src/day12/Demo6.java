package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B115%207PM%20Selenium/share/pages/Sample8.html");
		
		boolean isEnabled = driver.findElement(By.id("A1")).isEnabled();
		System.out.println(isEnabled);//true--> it is enabled and we can perform action
		
		isEnabled = driver.findElement(By.id("A4")).isEnabled();
		System.out.println(isEnabled);//false--> it is disabled and we can't perform action
		
		driver.quit();
		
	}

}
