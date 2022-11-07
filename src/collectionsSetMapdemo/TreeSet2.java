package collectionsSetMapdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String args[]) {

		TreeSet<String> set = new TreeSet<String>();
//		set.add(null);
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ajay");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		set.add("six");
		set.add("seven");
		set.add("eight");
		set.add("nine");
		set.add("ten");
		set.add("Four1");
		set.add("Five1");
		set.add("six1");
		set.add("seven1");
		set.add("eight1");
		set.add("nine1");
		set.add("ten1");
		set.add("Vijay");
		set.add("Ajay");
		set.add("Two");
		

		System.out.println(set);
		
		System.out.println(".........................................");

//		System.out.println("Traversing element through Iterator in descending order");
//
//		Iterator<String> i = set.descendingIterator();
//
//		while (i.hasNext()) {
//			System.out.print(i.next() + " ");
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("Fan");
		list1.add("Table");
		list1.add("Java");
		list1.add("Microsoft");
		list1.add("Apple");
		list1.add("100");
		list1.add("Microsoft");
		list1.add("Apple");
		list1.add("100");
		System.out.println(list1);
		
		TreeSet<String> set1 = new TreeSet<String>(list1);
		System.out.println(".........................................");
		System.out.println(set1);
		
//		}
	}
}