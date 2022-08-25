package com.pack.day9;

public class StringDemoMore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name="Computer";
	
//		String name1="computer";
//		String name2="computer";
		
		
//		System.out.println(name.equals(name1));
		
//		System.out.println(name.equalsIgnoreCase(name2));
		
//		System.out.println(name.toLowerCase());
//		System.out.println(name);
//		System.out.println(name.toUpperCase());
//		System.out.println(name);
		
//		name=name+" Testing";
//		System.out.println(name);
		
		String str="The quick brown fox jumps over the lazy dog";
		
//		System.out.println(str.substring(5));
//		System.out.println(str.substring(5,6));
		
//		System.out.println(str.charAt(str.length()-1));
//		
//		System.out.println(str.concat(str));
//		
//		System.out.println(str);
		
		
//		String str1="0123456789";
//		String strch="0abcdefghijklmnopqrstuvwxyz";
//		
////		System.out.println(str.indexOf("fox"));
//		
//		
//		System.out.println(str1.indexOf('4'));
//		System.out.println(strch.indexOf('z'));
		
		
		String test="    Hello World java welcome to java   ";
		
		System.out.println(test.indexOf("o",10));
		
		System.out.println(test.lastIndexOf("o"));
		
		
		String str8989 = "J";
		String str9999 = "H";
		
		System.out.println(str8989.compareTo(str9999));
		
//		System.out.println(test.length());
//		System.out.println(test);
//		System.out.println(test.trim());
//		System.out.println(test.trim().length());
		
		System.out.println(test.trim().replaceAll("a", "A"));
		
		System.out.println(test.contains("Welcome"));
		
		
		
		
	}

}
