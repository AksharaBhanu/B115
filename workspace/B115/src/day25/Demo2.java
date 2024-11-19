package day25;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		OrangeLoginPage p=new OrangeLoginPage(driver);//findElement
		p.setUserName("abcd");
		p.setPassword("xyz");
		p.clickLoginButton();//refresh
		Thread.sleep(4000);
		p.setUserName("admin");//try to perform action
		p.setPassword("admin123");
		p.clickLoginButton();
		Thread.sleep(4000);
		driver.quit();

	}

}
