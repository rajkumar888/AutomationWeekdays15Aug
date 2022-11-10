package collectionsSetMapdemo;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapDemo1 {

	public static void main(String[] args) {

		LinkedHashMap<String,String> map= new LinkedHashMap<String,String>();
		
//		HashMap<String,String> map= new HashMap<String,String>();
		
		map.put("abc1", "value1");
		map.put("abc5", "value1");
		map.put("abc11", "value1");
		map.put("abc22", "value1");
		map.put("abc6", "value1");
		map.put("abc56", "value1");
		map.put("abc45", "value1");
		map.put("abc44", "value1");
		map.put("abc23", "value1");
		map.put("abc48", "value1");
		map.put("abc49", "Hello");
		map.put("abc55", "value1");
		
		
		System.out.println(map);
		System.out.println(map.size());
		System.out.println("===============================");
		
		
		
//		HashMap<String,String> map1= new HashMap<String,String>();
//		map1.put("abc55", "value1");
//		map1.put("abc40", "value1");
//		map1.put(null, "value1");
//		map1.put("test", null);
//		map1.put("test1", null);
//		map1.put("abc11", "value1");
//		map1.put("abc51", "value1");
//		map1.put("abc111", "value1");
//		map1.put("abc222", "value1");
//		map1.put("abc63", "value1");
//		map1.put("abc516", "value1");
//		map1.put("abc415", "value1");
//		map1.put("abc414", "value1");
//		System.out.println(map1);
//		System.out.println(map1.size());
//		System.out.println("===============================");
//		
//		map.putAll(map1);
//		
//		System.out.println(map);
//		System.out.println(map.size());
//		System.out.println("===============================");
//		
		
//		System.out.println(map.containsKey("abc6")+"...............................");
//		System.out.println(map.containsValue(null)+"...............................");
//		System.out.println("===============================");
//		System.out.println(map.containsKey("444444")+"...............................");
//		System.out.println(map.containsValue("TTTTTTTT")+"...............................");
////		map.clear();
////		System.out.println("===============================");
////		System.out.println(map);
////		System.out.println(map.size());
		
		
		
	}

}
