package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.FBPage;

public class Demo3 extends BaseTest
{

	@Test
	public void testDemo1()
	{
		Reporter.log("Code by Bhanu",true);
		String v=Utility.getExcelData(xlpath, "sheet1", 0, 0);
		Reporter.log("Data from xl:"+v,true);
		String title=driver.getTitle();
		Reporter.log(title,true);
		
		FBPage p=new FBPage(driver);
		p.setUN(v);
	}
}

