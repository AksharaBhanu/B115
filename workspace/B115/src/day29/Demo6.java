package day29;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo6 {

	public static void main(String[] args) throws Exception {
		String gridURL="https://oauth-crakhi.c2021-c306a:af9500f0-dafd-4e54-a787-49e332972909@ondemand.eu-central-1.saucelabs.com:443/wd/hub";
		URL url=new URL(gridURL);
		ChromeOptions options=new ChromeOptions();
		
		WebDriver driver=new RemoteWebDriver(url,options);
		driver.get("https://aksharatraining.com/");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
