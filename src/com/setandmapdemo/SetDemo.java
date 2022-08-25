package com.setandmapdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();

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
		set.add("Three");
		set.add("seven1");
		set.add("seven2");
		set.add("seven3");
		set.add("seven4");
		set.add("seven5");
		
		System.out.println(set.size());
		
//		System.out.println(set);

		Iterator<String> i = set.iterator();
//		
//		
		while (i.hasNext()) {
			
			System.out.print(i.next()+" ");
		}
		
		System.out.println("\n...................");
		
		for(String   s :set){
			System.out.print(s+" ");
		}
//		
		System.out.println("\n...................");
		set.remove("One");  

		set.remove("Hello");  
		System.out.println("\n........");
//		
		for(String   s :set){
			System.out.print(s+" ");
		}
//		
//		
		set.clear(); 
//		
		System.out.println("\nAfter clearing "+set);
	}

}
