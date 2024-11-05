package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo5 {
//how do u right click on the element using selenium?
	public static void main(String[] args) throws InterruptedException {
		//note: right click--> context click
		//when we right click we get list of options--> context menu
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String xp="//span[text()='right click me']";
		WebElement button = driver.findElement(By.xpath(xp));
		
		Actions actions=new Actions(driver);
		actions.contextClick(button).perform();
		
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		Thread.sleep(4000);
		driver.quit();

	}

}
