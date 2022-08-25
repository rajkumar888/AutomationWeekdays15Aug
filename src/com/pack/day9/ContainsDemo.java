package com.pack.day9;

public class ContainsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "    Welcome to Hello World   ";
//		String[] abc = {"Welcome To", "Testing", "SDET" };

		String find = "Hello";

		System.out.println(str.contains(find));

		System.out.println(str.substring(8));

		char[] ch = str.toCharArray();
		
		System.out.println(ch.length);
		
		System.out.println(str.length());
		
		str= str.trim();
		System.out.println(str.length());
		
		

	}

}
