package day20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.google.com/");
	 driver.manage().window().maximize();
	 Thread.sleep(1000);
	 driver.findElement(By.id("APjFqb")).sendKeys("selenium");
	 Thread.sleep(1000);
	 
	 String xp="//span[contains(text(),'selenium')]";
	 List<WebElement> allAutoSuggestions = driver.findElements(By.xpath(xp));
	 int count=allAutoSuggestions.size();
	 System.out.println(count);
	 for(WebElement suggestion:allAutoSuggestions)
	 {
		 System.out.println(suggestion.getText());
	 }
	 
	 driver.quit();
	 
	}

}
