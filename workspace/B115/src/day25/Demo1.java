package day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/");
	
		WebElement userName=driver.findElement(By.id("input-username"));
		driver.navigate().refresh();
		
		userName.sendKeys("admin");


	}

}
