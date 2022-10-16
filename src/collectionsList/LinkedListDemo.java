package collectionsList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String args[]) {

		LinkedList<String> al = new LinkedList<String>();
		System.out.println(al);
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		al.addFirst("Ajay123");
		al.add(null);

		System.out.println(al);
		
		System.out.println(al.get(0));
		
		System.out.println(".................");
		
		List<String> linklistdemo = new LinkedList<>(
				Arrays.asList("aa", "bbb", "cat", "dog", "Computer", "Mouse", "Keyboard", "dog", null, null));

		
		System.out.println(linklistdemo);
//		
//		System.out.println(".................................");
//		
//		
//	
		
		
		
	}
}