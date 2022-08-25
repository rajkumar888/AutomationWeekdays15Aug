package com.setandmapdemo;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet<String> treesetexample = new TreeSet<String>();
		
		
		treesetexample.add("Ravi");
		treesetexample.add("Vijay");
		treesetexample.add("Ravi");
		treesetexample.add("Ajay");
		treesetexample.add("ajay");
		treesetexample.add("One");
		treesetexample.add("Two");
		treesetexample.add("Three");
		treesetexample.add("Four");
		treesetexample.add("Five");
		treesetexample.add("six");
		treesetexample.add("seven");
		treesetexample.add("eight");
		treesetexample.add("nine");
		treesetexample.add("ten");
		treesetexample.add("Vijay");
		treesetexample.add("Ravi");
//		treesetexample.add(null);
		
		System.out.println(treesetexample);
		

		// Traversing elements
//		Iterator<String> itr = treesetexample.iterator();
//		
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		
		System.out.println("....................");
		treesetexample.remove("Vijay");
//		
		Iterator<String> itr = treesetexample.iterator();
//		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
