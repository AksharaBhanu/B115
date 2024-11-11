package day19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		//open chrome
		WebDriver driver1=new ChromeDriver();
		String parent=driver1.getWindowHandle();
		//go to google
		driver1.get("http://www.google.com");
		Thread.sleep(2000);
		//open chrome
		driver1.switchTo().newWindow(WindowType.WINDOW);
		//goto fb
		driver1.get("http://www.fb.com");
		Thread.sleep(2000);
//		//close fb
		driver1.close();
		Thread.sleep(2000);
		driver1.switchTo().window(parent).quit();
		

		
	}

}
