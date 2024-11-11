package day19;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo8 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);//1-- allow 2- block
		options.setExperimentalOption("prefs", prefs);
		WebDriver driver=new ChromeDriver(options);//select block notification
		driver.get("https://pushalert.co/demo");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		try {
		driver.findElement(By.xpath("//a[text()='Later']")).click();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		Thread.sleep(2000);
		driver.findElement(By.id("send-button")).click();
		Thread.sleep(2000);
		String msg = driver.findElement(By.id("pa_class-blocked-info")).getText();
		System.out.println(msg);
		driver.quit();
	}

}
