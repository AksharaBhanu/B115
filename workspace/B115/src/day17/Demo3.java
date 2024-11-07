package day17;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String xp="//span[text()='right click me']";
		WebElement button = driver.findElement(By.xpath(xp));
		
		Actions actions=new Actions(driver);
		actions.contextClick(button).perform();
		Thread.sleep(1000);
		WebElement copy = driver.findElement(By.xpath("//span[text()='Copy']"));
		actions.moveToElement(copy).perform();
		Thread.sleep(1000);
		
		copy.click();
		Thread.sleep(1000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		Thread.sleep(2000);
		driver.quit();
		

	}

}
