package day31;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo2 {

	public static void main(String[] args) throws Exception {
		//opening the excel file
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/Book1.xlsx"));
		//go to sheet1
		Sheet s = wb.getSheet("Sheet1");
		//go to 1st row->1st col-> get value & print it
		String v = s.getRow(0).getCell(0).getStringCellValue();
		System.out.println(v);
		//close the excel file
		wb.close();
	}

}
