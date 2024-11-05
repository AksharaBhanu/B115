package day15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();//No arg constructor
		driver.get("https://news.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		Actions actions=new Actions(driver);//parameterized constructor
		actions.scrollByAmount(0,1000).perform();
	
		Thread.sleep(2000);
		driver.quit();
		

	}

}
