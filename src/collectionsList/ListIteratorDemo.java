package collectionsList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
	
	public static void main(String[] args) {
		
		
		List<String> list1 = new ArrayList<String>();
		list1.add("Fan");
		list1.add("Table");
		list1.add("Java");
		list1.add("Microsoft");
		list1.add("Apple");

		System.out.println(list1);
		
		ListIterator<String> listIter = list1.listIterator();
		listIter.next();  
		
		listIter.set("Hello");
		System.out.println(list1);
		
		
		
		
		
		
//		listIter.next();  
//		listIter.remove();
//		System.out.println(list1);
//		listIter.next();  
//		listIter.remove();
//		System.out.println(list1);
//		while(listIter.hasNext()){
//			System.out.println(listIter.next());
//		}
//		
//		listIter.remove();
//		System.out.println(list1);
//		listIter.previous();  
//		listIter.remove();
//		System.out.println(list1);
		
//		listIter.add("Room1");
//		listIter.add("Room2");
//		
//		System.out.println(list1);
//		
//		while(listIter.hasNext()){
//			System.out.println(listIter.next());
//		}
//		
//		listIter.add("Room3");
//		listIter.add("Room4");
		
//		System.out.println(list1);
		
		
		
	}

}
