package day15;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	
	public static void takeScreenshot(WebDriver driver,String imageName) throws Exception
	{
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd_MMMMM_yyyy_hh_mm_ss");
		String timestamp = dateFormat.format(new Date());
		TakesScreenshot page=(TakesScreenshot)driver;
		File srcFile = page.getScreenshotAs(OutputType.FILE);
		File dstFile= new File("./images/"+imageName+timestamp+".png");
		FileUtils.copyFile(srcFile,dstFile);
	}
	
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://aksharatraining.com/");
		driver.manage().window().maximize();
		JavascriptExecutor j=(JavascriptExecutor)driver;
		for(int i=1;i<=10;i++) {
			Demo1.takeScreenshot(driver, "akshara");
			j.executeScript("window.scrollBy(0,700)");
			Thread.sleep(500);
		}
		driver.quit();
	}
}
