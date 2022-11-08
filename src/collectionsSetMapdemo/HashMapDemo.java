package collectionsSetMapdemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();// Creating
																		// HashMap

		map.put(1, "Mango"); // Put elements in Map
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(4, "Grapes");
		System.out.println(map);
		System.out.println("...................");

		// map.put(4,"Grapes123");
		// map.put(1,"Mango123");

		System.out.println(map);
		System.out.println("...................");
		//
		// System.out.println(map.get(3));
		// System.out.println("...................");
		// map.remove(3);
		//// map.remove(3);
		// map.remove(1,"Mango");
		// map.remove(1,"Mango");
		//
		// System.out.println(map);
		// System.out.println("...................");

		// map.replace(2, "Apple", "Ravi");
		// map.replace(2, "hello", "Ravi");
		// map.put(2,"Ravi");
		// System.out.println(map);
		// System.out.println("...................");

		for (Integer xyz : map.keySet()) {

			System.out.println(xyz + " " + map.get(xyz));
		}
		System.out.println("...................");
		

		for (Map.Entry<Integer, String> m : map.entrySet()) {

			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("...................");

		
		 map
		 .keySet()
		 .stream()
		 .forEach( el -> System.out.println(el + " "+map.get(el)));
		 
		 System.out.println("...................");
		 
		 map
		 .keySet()
		 .forEach( el -> System.out.println(el + " "+map.get(el)));
		 
		 System.out.println("...................");
		
		 map
		 .entrySet()
		 .forEach(m -> System.out.println(m.getKey() + " " + m.getValue()));
		 System.out.println("...................");

		 map
		 .entrySet()
		 .forEach(System.out::println);
		 System.out.println("...................");
	}

}
