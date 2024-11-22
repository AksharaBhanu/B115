package day27;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo5 {

	@DataProvider
	public Object[] getData()
	{
		Object[] a= new Object[3];
		a[0]="Apple";
		a[1]=10;
		a[2]=true;
		
		return a;
	}
	@Test(dataProvider = "getData")
	public void testA(Object e)
	{
		String s=""+e;
		Reporter.log(s,true);
	}

}
