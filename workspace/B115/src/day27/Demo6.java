package day27;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo6 {

	@DataProvider
	public String[][] getData()
	{
		String[][] a=new String[3][3];
		a[0][0]="UserA";
		a[0][1]="A1";
		a[0][2]="A2";
		
		a[1][0]="UserB";
		a[1][1]="B1";
		a[1][2]="B2";
		
		a[2][0]="UserC";
		a[2][1]="C1";
		a[2][2]="C2";
		
		return a;
	}
	@Test(dataProvider = "getData")
	public void testA(String s1,String s2,String s3)
	{
		
		Reporter.log(s1+s2+s3,true);
	}

}
