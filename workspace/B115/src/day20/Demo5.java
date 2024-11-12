package day20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.get("file:///E:/B115%207PM%20Selenium/share/pages/Sample12.html");
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 String xp="//input[@type='checkbox']";
		 List<WebElement> allCBS = driver.findElements(By.xpath(xp));
		 int count=allCBS.size();
		 System.out.println(count);
		 for(WebElement cb:allCBS)
		 {
		  cb.click();
		  Thread.sleep(500);
		 }
		 
		 for(int i=count-1;i>=0;i--)
		 {
			 allCBS.get(i).click();
			 Thread.sleep(500);
		 }
		 
		 for(int i=0;i<count;i+=2)
		 {
			 allCBS.get(i).click();
			 Thread.sleep(500);
		 }

	}

}
