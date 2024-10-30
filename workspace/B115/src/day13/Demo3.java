package day13;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
		Thread.sleep(1000);
		
		String a = loginButton.getScreenshotAs(OutputType.BASE64);
		System.out.println(a);
		
		byte[] b = loginButton.getScreenshotAs(OutputType.BYTES);
		for(byte c:b)
		{
			System.out.print(c);
		}
		
		File f = loginButton.getScreenshotAs(OutputType.FILE);
		System.out.println(f.getAbsolutePath());//png
		
		driver.quit();
	}

}
