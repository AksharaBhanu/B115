package day21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo5 {
//print only selected options 
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.get("file:///E:/B115%207PM%20Selenium/share/pages/Sample15.html");
		 driver.manage().window().maximize();
		
		 WebElement listBox = driver.findElement(By.id("A1"));
		 Select select=new Select(listBox);
		
		 List<WebElement> allOptions = select.getOptions();
		 for(WebElement option:allOptions)
		 {
			 if( option.isSelected())
			 {
				 String text=option.getText();
				 System.out.println(text);
			 }
		 }
		 
		 
		 Thread.sleep(1000);
		 driver.quit();
	}

}
