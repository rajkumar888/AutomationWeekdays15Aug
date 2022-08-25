package com.pack.day9;

public class MoreStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Welcome to Hello World";

		for (int i = str.length() - 1; i >= 0; i--) {

			System.out.print(str.charAt(i));
		}

		System.out.println("..............................");

		String[] splittedstr = str.split(" ");

		for (int i = splittedstr.length - 1; i >= 0; i--) {
			System.out.print(splittedstr[i] + " ");
		}
		
		
		// count the character in any sentence
		System.out.println("..............................");
		
		int count=0;
		
		for (int i = str.length() - 1; i >= 0; i--) {

//			System.out.print(str.charAt(i));
			
			if(str.charAt(i)=='o'){
				count++;
			}
		}
		System.out.println("Count of o is "+count);
		
		
		// count without loop - hint - with replaceAll()
		System.out.println(".....___________..............");
		
		count=str.length() - str.replaceAll("o", "").length();
		System.out.println("Count of o is "+count);

	}

}
