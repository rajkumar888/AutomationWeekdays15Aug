package com.pack.day12;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LinkedListDemo {

	public static void main(String args[]) {

		LinkedList<String> al = new LinkedList<String>();
			
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		al.addFirst("Ajay123");
		al.add(null);

		System.out.println(al);
		
		
		List<String> linklistdemo = new LinkedList<>(
				Arrays.asList("aa", "bbb", "cat", "dog", "Computer", "Mouse", "Keyboard", "dog", null, null));

		
		System.out.println(linklistdemo);
		
		System.out.println(".................................");
		
		
		Vector<String> vect = new Vector<String>();
		
		vect.add("Ravi");
		vect.add("Vijay");
		vect.add("Ravi");
		vect.add("Ajay");
		vect.add(null);
		vect.add(null);

		System.out.println(vect);
		
		
//		Iterator<String> itr = al.iterator();
//		
//		
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		
		
	}
}