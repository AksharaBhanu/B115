package day21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo9 {
//	print content of list box in sorted order
	public static void main(String[] args) {

		 
		 WebDriver driver=new ChromeDriver();
		 driver.get("file:///E:/B115%207PM%20Selenium/share/pages/Sample16.html");
		 driver.manage().window().maximize();
		
		 WebElement listBox = driver.findElement(By.id("A1"));
		 Select select=new Select(listBox);
		 List<WebElement> allOptions = select.getOptions();

		 
		 LinkedHashMap<String, Integer> map=new LinkedHashMap<String, Integer>();
			
			for(WebElement option:allOptions)
			{
				String key=option.getText();
				
				if(map.containsKey(key))
				{
					Integer v = map.get(key);
					v++;
					map.put(key, v);
				}
				else
				{
					map.put(key,1);
				}
				
			}
			
			System.out.println(map);
			
			//print only duplication option
			//print only unique option
			
		 driver.quit();
	}

}
