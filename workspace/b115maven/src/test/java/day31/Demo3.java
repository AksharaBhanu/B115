package day31;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo3 {
	//write data to excel sheet
	public static void main(String[] args) throws Exception {
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/Book1.xlsx"));
		Sheet s = wb.getSheet("Sheet1");
		s.getRow(0).getCell(0).setCellValue("Bhanu");
		wb.write(new FileOutputStream("./data/Book2.xlsx"));
		wb.close();
	}

}
