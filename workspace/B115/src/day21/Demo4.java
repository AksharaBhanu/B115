package day21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo4 {
//print list box options in reverse order
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.get("file:///E:/B115%207PM%20Selenium/share/pages/Sample14.html");
		 driver.manage().window().maximize();
		
		 WebElement listBox = driver.findElement(By.id("A1"));
		 Select select=new Select(listBox);
		
		 List<WebElement> allOptions = select.getOptions();
		 int count=allOptions.size();
		 //print all options 1st to last
		 for(int i=0;i<count;i++) {
		 WebElement option = allOptions.get(i);
		 String text= option.getText();
		 System.out.println(text);
		 }
		 System.out.println("-----");
		 //print all options reverse order
		 for(int i=count-1;i>=0;i--) {
			 WebElement option = allOptions.get(i);
			 String text= option.getText();
			 System.out.println(text);
			 }
		 Thread.sleep(1000);
		 driver.quit();
	}

}
