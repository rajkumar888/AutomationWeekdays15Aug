package com.collectionsList;

import java.util.ArrayList;
import java.util.List;

public class ListStreamDemo {

	
	public static void main(String[] args) {
		List<String> stringList = new ArrayList<String>();

		stringList.add("one");
		stringList.add("two");
		stringList.add("three");
		stringList.add("one");

		stringList
		.stream()
		.distinct()
		.forEach( element -> { System.out.println(element); });
		
		System.out.println("....................");
		
		stringList.stream().distinct().forEach(System.out::println);
	}
}


