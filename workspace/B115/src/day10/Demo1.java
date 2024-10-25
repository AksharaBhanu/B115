package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B115%207PM%20Selenium/share/pages/Sample6.html");
		
		String xp="//td[text()='Java']/../td[3]";
		WebElement cost = driver.findElement(By.xpath(xp));
		
		String value = cost.getText();
		System.out.println(value);
		
		driver.quit();
	}

}
