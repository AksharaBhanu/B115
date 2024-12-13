package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B115%207PM%20Selenium/share/pages/Sample8.html");
		
		boolean visible = driver.findElement(By.id("A1")).isDisplayed();
		System.out.println(visible);//true --> element is displayed/visible
		
		visible = driver.findElement(By.id("A3")).isDisplayed();
		System.out.println(visible);//false --> element is not displayed/invisible
		
		driver.findElement(By.id("A3")).click();
		
		driver.quit();
	}

}
