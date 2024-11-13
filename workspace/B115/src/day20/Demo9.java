package day20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo9 {

	public static void main(String[] args) throws Exception {
		 WebDriver driver=new ChromeDriver();
		 driver.get("file:///E:/B115%207PM%20Selenium/share/pages/Sample13.html");
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 WebElement listBox = driver.findElement(By.id("A1"));
		 Select select=new Select(listBox);
		 System.out.println(select.isMultiple());//false
		 select.deselectByIndex(0);
		 System.out.println(select.getWrappedElement().getText());
		 Thread.sleep(1000);
		 driver.quit();
		 

	}

}
