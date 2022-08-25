package day14.setdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ArrayListToSet {

	public static void main(String[] args) {

		
		List<String> list1 = new ArrayList<String>();
		list1.add("Fan");
		list1.add("Table");
		list1.add("Java");
		list1.add("Microsoft");
		list1.add("Apple");
		list1.add("Table");
		list1.add("Java");

		System.out.println(list1);
		
		System.out.println("...........unique values...............");
		
		HashSet<String> setdemo = new HashSet<String>(list1);
		
		System.out.println(setdemo);
		
		
		
		
		
	}

}
