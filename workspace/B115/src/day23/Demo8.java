package day23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//write a script to find the time taken to load the page
public class Demo8 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		long start = System.currentTimeMillis();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		long end = System.currentTimeMillis();
		double diff=(end-start)/1000.0;
		System.out.println("Time taken to load the page is:"+diff+"s");
		driver.quit();
	}

}
