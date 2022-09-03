package com.pack.exceptiondemo;


import java.io.FileNotFoundException;

public class Child extends Parent{
	
		public void m1() throws FileNotFoundException{
		
		System.out.println("inside parent m1");
	}
}
