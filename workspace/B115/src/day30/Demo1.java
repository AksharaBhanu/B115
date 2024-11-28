package day30;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo1 {

	public static void main(String[] args) throws Exception {

		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.29.187:4444"),new ChromeOptions());
		driver.get("https://aksharatraining.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(5000);		
		driver.quit();


	}

}
