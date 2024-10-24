package day04;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo9 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement username = driver.switchTo().activeElement();
		username.sendKeys("admin");
		Thread.sleep(1000);
		
		username.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(1000);
		username.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(1000);
		username.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		
		WebElement password = driver.switchTo().activeElement();
		password.sendKeys(Keys.CONTROL+"v");
		password.sendKeys("123");
		password.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		
		WebElement login = driver.switchTo().activeElement();
		login.sendKeys(Keys.ENTER);
		Thread.sleep(7000);
		
		driver.quit();
		
		
	}

}
