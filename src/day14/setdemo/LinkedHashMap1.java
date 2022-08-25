package day14.setdemo;

import java.util.LinkedHashMap;

public class LinkedHashMap1 {

	public static void main(String[] args) {

		LinkedHashMap<String,String> linkedhmapdemo= new LinkedHashMap<String,String>();
		
		linkedhmapdemo.put("abc1", "value1");
		linkedhmapdemo.put("abc5", "value1");
		linkedhmapdemo.put("abc11", "value1");
		linkedhmapdemo.put("abc22", "value1");
		linkedhmapdemo.put("abc6", "value1");
		linkedhmapdemo.put("abc56", "value1");
		linkedhmapdemo.put("abc45", "value1");
		linkedhmapdemo.put("abc44", "value1");
		linkedhmapdemo.put("abc23", "value1");
		linkedhmapdemo.put("abc48", "value1");
		linkedhmapdemo.put("abc49", "value1");
		linkedhmapdemo.put("abc55", "value1");
		linkedhmapdemo.put("abc40", "value1");
		linkedhmapdemo.put(null, "value1");
		linkedhmapdemo.put("test", null);
		linkedhmapdemo.put("test1", null);
		
		System.out.println(linkedhmapdemo);
		
		
		
		
	}

}
