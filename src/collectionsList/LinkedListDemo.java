package collectionsList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String args[]) {

		LinkedList<String> al = new LinkedList<String>();
		
		
		System.out.println(al);
		System.out.println(".................");
		
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi111");
		al.add("Ajay111");
		al.addFirst("Ajay123");
		al.add(null);
		al.add("Ravi333");
		al.addLast("Ajaylast");

		System.out.println(al);
		
//		System.out.println(al.get(0));
//		
//		System.out.println(al.getFirst());
//		
//		System.out.println(al.getLast());
		
//		System.out.println(".................");
//		
		LinkedList<String> linklistdemo = new LinkedList<>(
				Arrays.asList("aa", "bbb", "cat", "dog", "Computer", "Mouse", "Keyboard", "dog", null, null));

		
		System.out.println(linklistdemo);
		
//		linklistdemo.addAll(al);
		
		linklistdemo.addAll(0,al);
//		
		System.out.println(".................................");
		System.out.println(linklistdemo);
		
		
//		System.out.println(linklistdemo.peek());
		
//		System.out.println(linklistdemo.poll());
		System.out.println(linklistdemo.pollFirst());
		System.out.println(".................................");
		System.out.println(linklistdemo);
		System.out.println(linklistdemo.pollLast());
		System.out.println(".................................");
		System.out.println(linklistdemo);
		
//		System.out.println(linklistdemo.element());
//		System.out.println(".................................");
//		System.out.println(linklistdemo.indexOf("Ravi333"));
		
		
		
		
//		Iterator<String> desciter = linklistdemo.descendingIterator();
//		
//		while(desciter.hasNext()){
//			
//			System.out.print(desciter.next()+" ");
//			
//		}
		
		
//		System.out.println(linklistdemo.contains("Ajay123"));
//		System.out.println(linklistdemo.contains("Ajay"));
		
//		linklistdemo.clear();
//		
//		System.out.println(".................................");
//		System.out.println(linklistdemo);
		
//		
		
//		LinkedList<String> llist2 = new LinkedList<String>(al);
//		
//		System.out.println(al);
//		System.out.println(llist2);
//		
//		System.out.println(al.equals(llist2));	
		
		
		
	}
}