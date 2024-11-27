package day29;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo7 {

	public static void main(String[] args) throws MalformedURLException {
		
		FirefoxOptions browserOptions = new FirefoxOptions();
		browserOptions.setPlatformName("Linux");
		browserOptions.setBrowserVersion("latest");
		Map<String, Object> sauceOptions = new HashMap<>();
		sauceOptions.put("username", "");
		sauceOptions.put("accessKey", "");
		sauceOptions.put("build", "B115");
		sauceOptions.put("name", "TestAkshara");
		browserOptions.setCapability("sauce:options", sauceOptions);

		URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
		WebDriver driver = new RemoteWebDriver(url, browserOptions);
		
		driver.get("https://aksharatraining.com/");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
