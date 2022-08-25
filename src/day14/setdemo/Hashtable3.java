package day14.setdemo;

import java.util.Hashtable;

public class Hashtable3 {

	public static void main(String args[]) {
		
		Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		
		
		map.put(100, "Amit");
		map.put(102, "Ravi");
		map.put(101, "Vijay");
		map.put(103, "Rahul");
		
		
		 map.putIfAbsent(104,"Gaurav");  
		 
		 System.out.println(map.getOrDefault(104, "Not Found the key in the map"));
		 
		 map.putIfAbsent(101,"Vijay111"); 
		 System.out.println(map);
//		
//		// Here, we specify the if and else statement as arguments of the method
//		System.out.println(map.getOrDefault(101, "Not Found the key in the map"));
//		
//		System.out.println(map.getOrDefault(105, "Not Found the key in the map"));
	}
}