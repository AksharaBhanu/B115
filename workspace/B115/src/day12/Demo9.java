package day12;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo9 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B115%207PM%20Selenium/share/pages/Sample3.html");
		WebElement link = driver.findElement(By.id("a1"));
		
		String tag = link.getTagName();
		System.out.println(tag);// a
		
	
		String url = link.getAttribute("href");
		System.out.println(url);
		
		String title = link.getAttribute("title");
		System.out.println(title);
		
		String text = link.getText();
		System.out.println(text);
		
		driver.quit();
		
	}

}
