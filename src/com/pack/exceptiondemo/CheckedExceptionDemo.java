package com.pack.exceptiondemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {

		File newFile = new File("test.txt");
		FileInputStream stream = new FileInputStream(newFile);

		Thread.sleep(5000);

		System.out.println("End of program....");
	}
}