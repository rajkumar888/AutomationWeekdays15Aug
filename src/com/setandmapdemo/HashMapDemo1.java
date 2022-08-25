package com.setandmapdemo;

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
		map.put("abc49", "value1");
		map.put("abc55", "value1");
		map.put("abc40", "value1");
		map.put(null, "value1");
		map.put("test", null);
		map.put("test1", null);
		
		System.out.println(map);
		
		
		
		
		
		
	}

}
