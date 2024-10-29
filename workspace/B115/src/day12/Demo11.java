package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo11 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B115%207PM%20Selenium/share/pages/Sample8.html");
		WebElement okButton = driver.findElement(By.id("A7"));
		
		int h = okButton.getRect().getHeight();
		System.out.println("Height:"+h);
		
		int w = okButton.getRect().getWidth();
		System.out.println("Width:"+w);
		
		int x= okButton.getRect().getX();
		System.out.println("x:"+x);
		
		int y= okButton.getRect().getY();
		System.out.println("y:"+y);
		
		driver.quit();
		
		
		
	}

}
