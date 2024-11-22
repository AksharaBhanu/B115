package day27;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo8 {

	@DataProvider
	public Iterator<String[]>  getData()
	{
	
		ArrayList<String[]> a=new ArrayList<String[]>();
		
		String[] row1= {"UserA","A1","A2"};
		a.add(row1);
		
		String[] row2= {"UserB","B1","B2"};
		a.add(row2);
		System.out.println("Array Size:"+row1.length);
		System.out.println("Collection Size:"+a.size());
		
		Iterator<String[]> v = a.iterator();
		return v;
	}
	@Test(dataProvider = "getData")
	public void testA(String s1,String s2,String s3)
	{
		Reporter.log(s1+s2+s3,true);
	}

}
