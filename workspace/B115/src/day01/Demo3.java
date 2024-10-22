package day01;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) {
		//creating an object of ChromeDriver class
		ChromeDriver driver = new ChromeDriver();//Open Chrome Browser
		
		//calling a method -->get
		driver.get("http://www.google.com");//enter the url
		
		
		//calling a method -->close
		driver.close();//close the browser
	}

}
