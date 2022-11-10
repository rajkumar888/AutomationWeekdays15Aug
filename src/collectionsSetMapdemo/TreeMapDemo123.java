package collectionsSetMapdemo;

import java.util.TreeMap;

public class TreeMapDemo123 {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> numbers = new TreeMap<>();
		numbers.put("Third", 3);
        numbers.put("First", 1);
        numbers.put("Second", 2);
        
        
        System.out.println("TreeMap: " + numbers);

        System.out.println("First Key: " + numbers.firstKey());
        System.out.println("Last Entry: " + numbers.lastEntry());
        
        
////
////        // Using the lastKey() method
//        String lastKey = numbers.lastKey();
//        System.out.println("Last Key: " + lastKey);
////
////        // Using firstEntry() method
//        System.out.println("First Entry: " + numbers.firstEntry());
////
////
////        // Using the lastEntry() method
//        System.out.println("Last Entry: " + numbers.lastEntry());
////        
////        // TODO Auto-generated method stub

	}

}
