package day30;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) {
		String columnName = "Cost";
		String subejct="Python";
		 
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B115%207PM%20Selenium/share/pages/Sample12.html");
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='t1']//th"));
       
        int columnIndex = -1;
        for (int i = 0; i < headers.size(); i++) {
            if (headers.get(i).getText().equalsIgnoreCase(columnName)) {
                columnIndex = i + 1; 
                break;
            }
        }

        String xpath="//td[text()='"+subejct+"']/../td["+columnIndex+"]";
        System.out.println(xpath);

        String cost = driver.findElement(By.xpath(xpath)).getText();
        System.out.println(cost);
        
        driver.quit();
     

	}

}
