package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		String xp="(//span[text()='Required'])[1]";
		WebElement errMsg = driver.findElement(By.xpath(xp));
		System.out.println(errMsg.getTagName());
		System.out.println(errMsg.getText());
		
		String c = errMsg.getCssValue("color");
		System.out.println(c); //RGB
		
		String colorinHexa = Color.fromString(c).asHex();
		System.out.println(colorinHexa);
		
		driver.quit();
		
	}

}
