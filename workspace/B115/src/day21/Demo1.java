package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.get("file:///E:/B115%207PM%20Selenium/share/pages/Sample14.html");
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 WebElement listBox = driver.findElement(By.id("A1"));
		 Select select=new Select(listBox);
		 
		 System.out.println(select.getWrappedElement().getText());//print content of MSLB
		 System.out.println(select.isMultiple());//true--it is MSLB
		 
		 select.selectByIndex(0);
		 select.selectByIndex(0);
		 Thread.sleep(1000);
		 select.selectByValue("b");
		 Thread.sleep(1000);
		 select.selectByVisibleText("Snacks");
		 Thread.sleep(1000);
		 
		 if(select.isMultiple()) {
		 select.deselectByIndex(0);
		 select.deselectByIndex(0);
		 Thread.sleep(1000);
		 select.deselectByValue("b");
		 Thread.sleep(1000);
		 select.deselectByVisibleText("Snacks");
		 Thread.sleep(1000);
		 select.deselectAll();
		 }
		 else
		 {
			 System.out.println("Sorry we cant use any deselect method as this listbox is SSLB");
		 }
		 driver.quit();
	}

}
