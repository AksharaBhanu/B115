package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String xp1 = "//input[@placeholder='Enter Mobile Number']";
		driver.findElement(By.xpath(xp1)).sendKeys("9481787493");
		
		String xp2="//span[@class='commonModal__close']";
		driver.findElement(By.xpath(xp2)).click();
		
	}

}
