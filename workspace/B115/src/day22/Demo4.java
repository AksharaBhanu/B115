package day22;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo4 {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	
	driver.get("file:///E:/B115%207PM%20Selenium/share/pages/Sample17.html");
	
	driver.findElement(By.id("ok")).click();
	wait.until(ExpectedConditions.alertIsPresent());
	System.out.println("Hi");
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	
	driver.quit();

	}

}
