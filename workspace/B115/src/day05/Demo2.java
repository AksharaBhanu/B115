package day05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B115%207PM%20Selenium/share/pages/Sample2.html");

		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(2000);
		driver.quit();
	}

}
