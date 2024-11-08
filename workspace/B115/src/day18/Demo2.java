package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String xp2="//span[@class='commonModal__close']";
		driver.findElement(By.xpath(xp2)).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		Thread.sleep(1000);
		String xp3="//div[contains(text(),'December')]/../..//p[text()='9']";
		driver.findElement(By.xpath(xp3)).click();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
