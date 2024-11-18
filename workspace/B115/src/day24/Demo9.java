package day24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo9 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/");
		//driver.navigate().refresh();
		WebElement userName=driver.findElement(By.id("input-username"));
		driver.navigate().refresh();
		userName.sendKeys("admin");
		//driver.navigate().refresh();
	}
}
