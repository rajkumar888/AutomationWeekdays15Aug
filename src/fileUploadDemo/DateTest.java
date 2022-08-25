package fileUploadDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println(new Date());
		
		SimpleDateFormat dateformat = new SimpleDateFormat("EEEE dd_MMM_yyyy HH_mm_ss");
		
		System.out.println(dateformat.format(new Date()));
		
		
	
	}

}
