package com.pack.day5.two;

import inheritanceExample.DefatultDemoPackOne;

//import inheritancedemo.DefatultDemoPackOne;

public class ChildOutSidePackage extends DefatultDemoPackOne{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChildOutSidePackage obj = new ChildOutSidePackage();
		
		
//		System.out.println(obj.getdefaultX());
		
		System.out.println(obj.getprotectedX());

		System.out.println(obj.getpublicX());
		
		

	}

}
