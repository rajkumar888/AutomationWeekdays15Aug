package day14.setdemo;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();// Creating
																		// HashMap

		map.put(1011, "Mango"); // Put elements in Map
		map.put(2222, "Apple");
		map.put(3333, "Banana");
		map.put(4444, "Grapes");
		map.put(null, null);
		map.put(4444, "Grapes123");
		map.put(1011, "Mango123");

//		System.out.println(map.containsKey(4444));
//		System.out.println(map.containsValue("Apple"));

		ArrayList<String> valueList = new ArrayList<String>(map.values());
		System.out.println("contents of the list holding values of the map ::" + valueList);

		// System.out.println(map);
		// map.remove(1011,"Mango");
		// System.out.println(map);

		// map.replace(2222, "Apple", "Mapple");
		// System.out.println(map);

		// for(Integer m : map.keySet()){
		//
		// System.out.println(m +" "+map.get(m));
		// }
		// System.out.println("....................");
		//
		//
		// for( Map.Entry<Integer, String> m: map.entrySet()){
		// System.out.println(m.getKey()+" "+m.getValue());
		// }

		// System.out.println(map.get(3333));

		//
		//
		// for( Integer xyz :map.keySet() ){
		// System.out.println(xyz);
		// }

		// map.remove(1,"Mango123");
		// System.out.println(map);
		//
		// map.replace(2, "Apple", "Ravi");
		// System.out.println(map);

		//
		//

		//

	}

}
