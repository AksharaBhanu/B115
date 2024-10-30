package day13;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		File srcFile = loginButton.getScreenshotAs(OutputType.FILE);
		File dstFile= new File("./images/loginbutton.png");
		FileUtils.copyFile(srcFile,dstFile);
		driver.quit();
	}

}
