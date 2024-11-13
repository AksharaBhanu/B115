package day21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo7 {
//print content of list box in sorted order
	public static void main(String[] args) throws InterruptedException {
		ArrayList<String> a=new ArrayList<String>();
		a.add("BreakFast");
		a.add("Lunch");
		a.add("Snacks");
		a.add("Dinner");;
		
		System.out.println(a);
		
		Collections.sort(a);
		
		System.out.println(a);
		
		
	}

}
