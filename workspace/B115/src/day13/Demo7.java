package day13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo7 {

	public static void main(String[] args)  {
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd_MMMMM_yyyy_hh_mm_ss");
		String timestamp = dateFormat.format(new Date());
		System.out.println(timestamp);
	}

}
