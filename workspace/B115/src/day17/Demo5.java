package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B115%207PM%20Selenium/share/pages/Sample10.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("A2")).sendKeys("E:/MyCV.docx");
	}
}
