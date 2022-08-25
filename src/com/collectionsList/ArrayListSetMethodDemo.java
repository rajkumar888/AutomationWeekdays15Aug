package com.collectionsList;

import java.util.ArrayList;

public class ArrayListSetMethodDemo {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		System.out.println(list.isEmpty());
		
		
		list.add("JavaFx");
		System.out.println(list.isEmpty());
		
		list.add("Java");
		list.add("WebGL");
		list.add("OpenCV1");
		list.add("OpenCV2");
		list.add("OpenCV3");
		list.add("OpenCV4");
		list.add("OpenCV5");
		list.add("OpenCV6");
		list.add("OpenCV7");
		
		System.out.println(list);
		
		Object[] arr =  list.toArray();
		
		
		for(	Object	a	:arr){
			System.out.println(a);
		}
		
//		ArrayList<String> list666 = new ArrayList<String>(list);
//		
//				System.out.println(list666);
//				
//				System.out.println(list.equals(list666));
//				
//				list666.remove("OpenCV7");
//				System.out.println(list666);
//				System.out.println(list.equals(list666));
		
//		List<String> newlist = list.subList(list.size()/2, list.size());
////		System.out.println(newlist);
//		List<String> l4 = list.subList(list.indexOf("OpenCV3"), list.size());
//		System.out.println(l4);
		
//		list.remove(list.size()-list.size());
//		System.out.println(list);
//		list.remove(list.size()-1);
//		System.out.println(list);
		
//		list.set(2, "HBase");
//		System.out.println(list);
		
		
//		System.out.println(list.contains("Java"));
	}
}