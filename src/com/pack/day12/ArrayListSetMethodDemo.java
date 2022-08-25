package com.pack.day12;

import java.util.ArrayList;

public class ArrayListSetMethodDemo {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("JavaFx");
		list.add("Java");
		list.add("WebGL");
		list.add("OpenCV");
		
		System.out.println(list);
		
		
		list.set(2, "HBase");
		System.out.println(list);
		
		
		System.out.println(list.contains("Java"));
	}
}