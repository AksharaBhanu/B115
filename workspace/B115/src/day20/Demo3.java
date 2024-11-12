package day20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.google.com/");
	 driver.manage().window().maximize();
	 Thread.sleep(1000);
	 driver.findElement(By.id("APjFqb")).sendKeys("selenium");
	 Thread.sleep(1000);
	 
	 String xp="//span[contains(text(),'selenium')]";
	 List<WebElement> allAutoSuggestions = driver.findElements(By.xpath(xp));
	 int count= allAutoSuggestions.size();
	 //select the 1st AS
//	 allAutoSuggestions.get(0).click();
	 
	//select the 5th AS
//	 allAutoSuggestions.get(4).click();
	 
	 //select last one
//	 allAutoSuggestions.get(count-1).click();
	 
	 //select last but one
	 allAutoSuggestions.get(count-2).click();
	 Thread.sleep(3000);
	 driver.quit();
	 
	}

}
