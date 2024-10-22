package day04;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
//Set the size of the browser (resize the browser)
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		Dimension d=new Dimension(500,600);
		driver.manage().window().setSize(d);
	
		Thread.sleep(3000);
	
		driver.quit();
	}
}
