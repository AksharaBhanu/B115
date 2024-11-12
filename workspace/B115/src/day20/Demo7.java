package day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo7 {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.get("file:///E:/B115%207PM%20Selenium/share/pages/Sample13.html");
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
			WebElement listBox = driver.findElement(By.id("A1"));
			Select select=new Select(listBox);
			select.selectByIndex(1);//2nd option
			Thread.sleep(1000);
			select.selectByValue("c");
			Thread.sleep(1000);
			select.selectByVisibleText("Delhi");
			Thread.sleep(1000);
			driver.quit();
		 

	}

}
