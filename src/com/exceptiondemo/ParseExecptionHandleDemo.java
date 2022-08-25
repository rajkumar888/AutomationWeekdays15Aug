package com.exceptiondemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseExecptionHandleDemo {

	public static void main(String[] args) throws ParseException, InterruptedException {

		String inputdate = "21/02/2021";

		Date output = new SimpleDateFormat("dd/MM/yyyy").parse(inputdate);

		String resultdate = new SimpleDateFormat("yyyy/MM/dd").format(output);

		System.out.println(resultdate);
		
		Thread.sleep(1000);
		
		
		System.out.println("............................");
		Date date = new Date();

		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");

		System.out.println(formatter.format(date));
	}

}
