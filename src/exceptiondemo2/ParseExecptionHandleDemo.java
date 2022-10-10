package exceptiondemo2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseExecptionHandleDemo {

	public static void main(String[] args) throws ParseException, InterruptedException  {

		String inputdate = "22/11/2022";

		SimpleDateFormat output = new SimpleDateFormat("dd/MM/yyyy");
		Date testdateoutput = output.parse(inputdate);
		System.out.println("Parsing done successfully");

		String resultdate = new SimpleDateFormat("yyyy/MM/dd").format(testdateoutput);
//
		System.out.println(resultdate);
		
		Thread.sleep(1000);
//		
//		
		System.out.println("............................");
		Date date = new Date();
		
		System.out.println(date);
//
		SimpleDateFormat formatter = new SimpleDateFormat("MMM/dd/yyyy");
//
		System.out.println(formatter.format(date));
	}

}
