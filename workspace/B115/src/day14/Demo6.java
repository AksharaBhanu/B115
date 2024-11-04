package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {
	public static void main(String[] args) throws Exception {
		
		int y=2147;
		System.out.println(y);
		//use y in JS
		System.out.println("window.scrollBy(0,y)");

		System.out.println("window.scrollBy(0,"+ y+")");
	}
}
