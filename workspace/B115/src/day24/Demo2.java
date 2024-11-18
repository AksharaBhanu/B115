package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
//		driver.findElement(By.id("APjFqb")).sendKeys("akshara training");
		
//		WebElement searchBox = driver.findElement(By.id("APjFqb"));
//		searchBox.sendKeys("akshara training");
		
		WebElement searchBox;//declaration
		searchBox = driver.findElement(By.id("APjFqb"));//initialization
		searchBox.sendKeys("akshara training");//utilization

	}

}
