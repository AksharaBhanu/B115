package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo13 {
//write a script to verify that submit button is bigger than ok button
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B115%207PM%20Selenium/share/pages/Sample8.html");
		int w_OK=driver.findElement(By.id("A7")).getSize().getWidth();
		int w_Submit=driver.findElement(By.id("A8")).getSize().getWidth();
		if(w_OK<w_Submit)
		{
			System.out.println("PASS:Submit button is bigger than ok button");
		}
		else
		{
			System.out.println("FAIL:Submit button is Not bigger than ok button");
		}
		
		driver.quit();
		
	}

}
