package com.day1;

import com.day2.MethodDemo;

public class MethodDemoImpl {

	public static void main(String[] args) {

	MethodDemo obj = new MethodDemo();
	
	System.out.println(obj.getAddition(100, 20));
	System.out.println(obj.getSubraction(100, 20));
	System.out.println(obj.getProduct(100, 20));
	System.out.println(obj.getDivQuotient(100, 20));
	System.out.println(obj.getDivRemainder(101, 20));
		
	}
	
	
	

}
