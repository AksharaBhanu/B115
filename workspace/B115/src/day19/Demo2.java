package day19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		//open chrome
		WebDriver driver1=new ChromeDriver();
		//go to google
		driver1.get("http://www.google.com");
		//open chrome
		WebDriver driver2=new ChromeDriver();
		//goto fb
		driver2.get("http://www.fb.com");
//		//close fb
		driver2.quit();
//		//close google
		driver1.quit();
		
	}

}
