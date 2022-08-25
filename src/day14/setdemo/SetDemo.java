package day14.setdemo;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();

		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		set.add("six");
		set.add("seven");
		set.add("eight");
		set.add("nine");
		set.add("ten");
		set.add(null);
		set.add("Three");		// duplicate
		set.add("seven1");
		set.add("seven2");
		set.add("seven3");
		set.add("seven4");
		set.add("seven5");
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		
		
	
		
		System.out.println(set.size());
		
//		System.out.println(set);

		Iterator<String> iterationdemo = set.iterator();
//		
//		while (iterationdemo.hasNext()) {
//			System.out.println(iterationdemo.next());
//		}
		
		
//		Iterator<String> i = set.iterator();
		
//		while (i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		
		for(String   s :set){
			System.out.print(s+" ");
		}
		System.out.println("\n........");
		System.out.println(set.remove("One"));
		System.out.println(set.remove("Hello"));
		
		System.out.println("\n........");
		System.out.println(set.size()+"............ after removing");

		for(String   s :set){
			System.out.print(s+" ");
		}

		
		set.clear(); 
		System.out.println("\n........");
		System.out.println(set.size()+"............ after clearing everything");
		
		System.out.println("\nAfter clearing "+set);
	}

}
