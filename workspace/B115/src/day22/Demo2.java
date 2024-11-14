package day22;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Duration defaultTime = driver.manage().timeouts().getImplicitWaitTimeout();
		System.out.println(defaultTime);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Duration modifiedTime = driver.manage().timeouts().getImplicitWaitTimeout();
		System.out.println(modifiedTime);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.cssSelector("li.oxd-userdropdown")).click();
		
		driver.findElement(By.linkText("Logout")).click();
		
		driver.quit();
	}

}
