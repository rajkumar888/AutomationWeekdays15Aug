package day14.setdemo;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class HashMapDemoJava8 {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();// Creating

		map.put(1011, "Mango"); // Put elements in Map
		map.put(2222, "Apple");
		map.put(3333, "Banana");
		map.put(4444, "Grapes");
		map.put(null, null);
		map.put(4444, "Grapes123");
		map.put(1011, "Mango123");
		
		System.out.println(map);
		
		List<Integer> resultkey = map.keySet().stream().collect(Collectors.toList());
		System.out.println(resultkey);
		
		List<String> resultvalues = map.values().stream().collect(Collectors.toList());
		System.out.println(resultvalues);

	}

}
