package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();//No arg constructor
		driver.get("https://news.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement India = driver.findElement(By.xpath("(//a[text()='India'])[2]"));
		
		Actions actions=new Actions(driver);//parameterized constructor
		actions.scrollToElement(India).perform();
	
		Thread.sleep(4000);
//		driver.quit();
		

	}

}
