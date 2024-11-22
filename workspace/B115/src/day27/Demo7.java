package day27;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo7 {

	@DataProvider
	public Iterator<String>  getData()
	{
		Set<String> a=new HashSet<String>();
		a.add("Apple");
		a.add("Banana");
		a.add("Chiku");
		a.add("Grapes");
		Iterator<String> v = a.iterator();
		return v;
	}
	@Test(dataProvider = "getData")
	public void testA(String s)
	{
		Reporter.log(s,true);
	}

}
