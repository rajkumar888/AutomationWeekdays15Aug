package collectionsSetMapdemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapQuestion {

	public static void main(String[] args) {

		String str = "hello world hello hello";

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		 for(int i=0; i< str.length(); i++){
		
		 if(map.containsKey(str.charAt(i))){
		
		 map.put(str.charAt(i), (map.get(str.charAt(i))+1));
		 }else{
		 map.put(str.charAt(i), 1);
		 }
		 }

//		for (char ch : str.toCharArray()) {
//			
//			if (map.containsKey(ch)) {
//				map.put( ch, map.get(ch) + 1);
//			} else {
//				map.put(ch, 1);
//			}
//		}

//		System.out.println(map);
		 
		 for(  Map.Entry<Character, Integer> m: map.entrySet()){
			 
			 if(m.getValue()>1){
				 System.out.println(m.getKey()+" "+m.getValue());
			 }
		 }
		
		

	}

}
