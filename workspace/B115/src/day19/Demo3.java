package day19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) {
		//open chrome
		WebDriver driver1=new ChromeDriver();
		String parent=driver1.getWindowHandle();
		//go to google
		driver1.get("http://www.google.com");
		//open new tab in same browser-not possible in selenium 3
		driver1.switchTo().newWindow(WindowType.TAB);//only in selenium 4
		//go to fb.com
		driver1.get("http://www.fb.com");
		//close fb
		driver1.close();
		//close google
		driver1.switchTo().window(parent);
		driver1.quit();
		
		
	}

}
