package day04;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
//set the location /position of the browser--move the browser
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");

		driver.manage().window().setSize(new Dimension(500,600));
	
		Thread.sleep(1000);
		
		Point p=new Point(300,200);
		driver.manage().window().setPosition(p);
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}
