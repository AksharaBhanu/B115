package day27;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo4 {

	@DataProvider
	public String[] getData()
	{
		String[] a= new String[4];
		a[0]="Apple";
		a[1]="Mango";
		a[2]="Banana";
		a[3]="Grapes";
		
		return a;
	}
	@Test(dataProvider = "getData")
	public void testA(String fruit)
	{
		Reporter.log(fruit,true);
	}

}
