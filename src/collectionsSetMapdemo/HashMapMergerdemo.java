package collectionsSetMapdemo;

import java.util.HashMap;

public class HashMapMergerdemo {
	
  public static void main(String[] args) {
    // create an HashMap
    HashMap<String, String> countries = new HashMap<>();

    countries.put("Washington", "America");
    countries.put("Canberra", "Australia");
    countries.put("Madrid", "Spain");
    System.out.println( countries+".................................");

    // merge mapping for key Washington
    String returnedValue = countries.merge("Washington", "USA",	(oldValue, newValue) -> oldValue + "/" + newValue);
    
    System.out.println("Washington: " + returnedValue);

    // print updated HashMap
    System.out.println("Updated HashMap: " + countries);
  }
}