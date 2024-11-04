package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo9 {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://aksharatraining.com/");
		driver.manage().window().maximize();
		JavascriptExecutor j=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		//find the element
		WebElement button = driver.findElement(By.xpath("//span[text()='Contact us']"));
		
		//get its y value
		int y=button.getLocation().getY()-150;
		//use y in JS
		j.executeScript("window.scrollBy(0,"+y+")");
		
		Thread.sleep(2000);
		button.click();
		
	}
}
