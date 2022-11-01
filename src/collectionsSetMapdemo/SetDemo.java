package collectionsSetMapdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		System.out.println(set.isEmpty());

		set.add("One");
		System.out.println(set.isEmpty());
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
		set.add("Four");
		
		System.out.println(set.size());
		System.out.println(set);
		System.out.println("\n...................");
//			
//		Iterator<String> iter = set.iterator();
//		
//		while (iter.hasNext()) {
//			System.out.print(iter.next()+" ");
//		}
////		
//		System.out.println("\n...................");
//
//		for(String   s :set){
//			System.out.print(s+" ");
//		}
//		
//		System.out.println("\n...................");
		set.remove("One");  
		set.remove("Hello");  
		System.out.println(set);
////		
//		for(String   s :set){
//			System.out.print(s+" ");
//		}
////		
////	
		System.out.println("\n...................");
		System.out.println(set.contains("ADFASDFASD"));
		System.out.println(set.contains("Three"));
		System.out.println("\n...................");
		set.clear(); 
		System.out.println(set);
		System.out.println(set.isEmpty());
////		
//		System.out.println("\nAfter clearing "+set);
	}

}
