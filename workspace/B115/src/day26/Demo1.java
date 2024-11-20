package day26;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class GooglePage
{
	@FindBy(xpath="//a")
	private List<WebElement> allLinks;
	
	GooglePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void printLinks()
	{
		int count=allLinks.size();
		System.out.println(count);
		
		for(WebElement link:allLinks)
		{
			System.out.println(link.getText());
		}
	}
	

}

public class Demo1 {


	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		GooglePage g=new GooglePage(driver);
		g.printLinks();
		driver.quit();

	}

}
