package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		String textColorInRGB=loginButton.getCssValue("color");
		String textColorinHexa=Color.fromString(textColorInRGB).asHex();
		System.out.println(textColorInRGB+"-"+textColorinHexa);
		
		String backgroundColorInRGB=loginButton.getCssValue("background-color");
		String backgroundColorInHexa=Color.fromString(backgroundColorInRGB).asHex();
		System.out.println(backgroundColorInRGB+"-"+backgroundColorInHexa);
		
		String fontType=loginButton.getCssValue("font-family");
		System.out.println(fontType);
		
		String fontSize=loginButton.getCssValue("font-size");
		System.out.println(fontSize);
		
		driver.quit();
	}

}
