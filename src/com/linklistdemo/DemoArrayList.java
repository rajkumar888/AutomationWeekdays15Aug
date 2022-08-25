package com.linklistdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) {

		List<String> alphabets = new ArrayList<>(
				Arrays.asList("aa", "bbb", "cat", "dog", "Computer", "Mouse", "Keyboard", "dog", null, null));

		List<String> temp = new ArrayList<String>(alphabets);
		
		
		System.out.println(alphabets);

//		System.out.println(temp);
//
//		System.out.println(alphabets.equals(temp));
//
//		alphabets.remove(0);
//
//		System.out.println("...........................after removal....");
//
//		System.out.println(alphabets);
//
//		System.out.println(temp);
//
//		System.out.println(alphabets.equals(temp));
//		System.out.println("..............................");
//
//		System.out.println(temp.contains("dog"));
//		System.out.println(temp.contains("Dog"));
//		System.out.println(temp.contains("Hello"));

		// System.out.println("...........................after clear....");
		// System.out.println(temp.isEmpty());
		// temp.clear();
		//
		// System.out.println(temp.size());
		// System.out.println(temp);
		// System.out.println(temp.isEmpty());

//		String[] arr = (String[]) temp.toArray();
//
//		List<String> lst = Arrays.asList("aa", "bbb", "cat", "dog", "Computer");

		// System.out.println(alphabets.size());
		//
		// alphabets.forEach(s -> System.out.println(s));
		//
		// System.out.println(".....................");
		//
		//// alphabets.remove(0);
		//
		// alphabets.remove("Computer");
		//
		// System.out.println(alphabets.size());
		//
		// alphabets.forEach(s -> System.out.println(s));
		//
		// System.out.println(alphabets.indexOf("Mouse"));

	}

}
