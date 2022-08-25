package com.pack.day13;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String args[]) {

		// Create a vector
		Vector<String> vec = new Vector<String>();

		System.out.println("Default capacity is: " + vec.capacity());
		System.out.println("size is: " + vec.size());

		// Adding elements using add() method of List
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("Elephant");
		vec.add("Tiger");
		vec.add(null);
		vec.add("Elephant");
		vec.add("Elephant");
		vec.add("Elephant");

		if (vec.add("Elephant")) {
			System.out.println("Element added succussfully");
		} else {
			System.out.println("Element is not added succussfully");
		}

		// System.out.println(vec.add("Elephant"));
		// System.out.println(vec.addElement("xyz"));
		// vec.add(100);

		// Adding elements using addElement() method of Vector
		vec.addElement("Rat");
		vec.addElement("Cat");

		System.out.println("capacity is: " + vec.capacity());
		System.out.println("size is: " + vec.size());
		vec.addElement("Deer");

		System.out.println(vec);
		System.out.println("capacity is: " + vec.capacity());
		System.out.println("size is: " + vec.size());

		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("Elephant");
		vec.add("Tiger");
		vec.add(null);
		vec.add("Elephant");
		System.out.println(vec);
		System.out.println("capacity is: " + vec.capacity());
		System.out.println("size is: " + vec.size());
		 vec.add("Elephant");
		 System.out.println("capacity is: " + vec.capacity());
		System.out.println("size is: " + vec.size());

		System.out.println(".............");
		 Enumeration<String> enumeration = vec.elements();
		 
		
//		 for( ; enumeration.hasMoreElements() ; ){
//		 System.out.println(enumeration.nextElement());
//		 }

//		 while (enumeration.hasMoreElements()) {
//		 System.out.println(enumeration.nextElement());
//		 }

//		 Iterator<String> iter = vec.iterator();
//		
//		 while( iter.hasNext()){
//		 System.out.print(iter.next()+" ");
//		 }
		//
		// System.out.println();
		// System.out.println("Size is: "+vec.size());
		// System.out.println("Default capacity is: "+vec.capacity());
		//
		 System.out.println(vec.contains("Tiger")+" .............................");

		 ArrayList<String> ar = new ArrayList<String>();
		 ar.add("Tutorials");
		 ar.add("And");
		 ar.add("Examples");
		 
		 System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		 
		// // creating default vector
		//
		 vec.addAll(ar);
		// // checking vector v
		// System.out.println("vector v:" + vec);
		//
		 ListIterator<String> listiter = vec.listIterator(vec.size());
		//
		 while (listiter.hasPrevious()) {
		 System.out.print(listiter.previous() + " ");
		 }
		 

	}
}