package day23;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//write a script to find the time taken to load the page
public class Demo9 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Duration defaultScriptTimeOut = driver.manage().timeouts().getScriptTimeout();
		System.out.println(defaultScriptTimeOut);
		
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(3));
		
		Duration modifiedScriptTimeOut = driver.manage().timeouts().getScriptTimeout();
		System.out.println(modifiedScriptTimeOut);
		
		driver.get("https://aksharatraining.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		//send JS code to browser and waiting for browser to complete the JS execution and then goto next step
		j.executeScript("window.scrollBy(0,1000)");
		driver.quit();
	}

}
