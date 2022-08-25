package com.setandmapdemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapCharCountDemo {

	public static void main(String[] args) {
		
		String str = "ramakoteswararao";

    Map<Character, Integer> charCounter = new HashMap<Character, Integer>();

        for (char i : str.toCharArray()) {

        	charCounter.put(i,charCounter.get(i) == null ? 1 : charCounter.get(i) + 1);

        }

   System.out.println(charCounter);


	}

}
