package com.collectionsList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo1 {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<String>();
		
		
		Collections.addAll(fruits, "Apples", "Oranges", "Banana");
		
		Collections.addAll(fruits, "Grapes", "WaterMelon", "Kiwi");
		
		
		fruits.forEach(System.out::println);
//		
//		Collections.sort(fruits);
//		
//		System.out.println(fruits);
//		
		Collections.reverse(fruits);
//		
		System.out.println(fruits);
		
//		System.out.println(fruits);
//		Collections.sort(fruits, Comparator.reverseOrder());
//		System.out.println(fruits);
//		
//		Collections.fill(fruits, "Mango");
//		System.out.println(fruits);
		
		
		
	}

}
