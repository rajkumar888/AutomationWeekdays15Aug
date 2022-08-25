package com.demo.fileuploaddemo;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFomatDemo {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.println("Begining of program......................." + new Date());
		SimpleDateFormat dateformat = new SimpleDateFormat("E dd_MMM_yyyy hh_mm_ss aa");
		
		System.out.println(dateformat.format(new Date()));
	}

}
