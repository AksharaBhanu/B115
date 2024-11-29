package day31;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {

	@Test
	public  void testA() {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.quit();

	}

}
