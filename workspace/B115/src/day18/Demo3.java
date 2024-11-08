package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
//select future date: home work: take month and date from user
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String xp2="//span[@class='commonModal__close']";
		driver.findElement(By.xpath(xp2)).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		Thread.sleep(1000);
		String xp3="//div[contains(text(),'May')]/../..//p[text()='10']";
		for(int i=1;i<=11;i++) {
			try
			{
					driver.findElement(By.xpath(xp3)).click();
					System.out.println("Date found and selected");
					break;
			}
			catch (Exception e) 
			{
				System.out.println("Date Not found, hence clicking ->:"+i);
				String xp4="//span[@aria-label='Next Month']";
				driver.findElement(By.xpath(xp4)).click();
				Thread.sleep(500);
			}
		}
		Thread.sleep(3000);
		driver.quit();
		
	}

}
