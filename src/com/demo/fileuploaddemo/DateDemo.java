package com.demo.fileuploaddemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {

		System.out.println(new Date());
		
		SimpleDateFormat dateformat = new SimpleDateFormat("E dd_MMM_yyyy HH_mm_ss");
		
		String filename= dateformat.format(new Date());
		
		System.out.println(filename);
	}

}
