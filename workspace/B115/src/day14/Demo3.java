package day14;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://aksharatraining.com/");
		JavascriptExecutor j=(JavascriptExecutor)driver;
		
		for(int i=1;i<=5;i++) {
		j.executeScript("window.scrollBy(0,500)");//scroll down
		Thread.sleep(1000);
		}
		
		for(int i=1;i<=5;i++) {
			j.executeScript("window.scrollBy(0,-500)");//scroll up
			Thread.sleep(1000);
			}
		driver.quit();
	}
}
