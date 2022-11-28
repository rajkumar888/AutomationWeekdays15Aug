package collectionsSetMapdemo;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.stream.Collectors;

public class Hashtable2 {
	public static void main(String args[]) {

		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();

		hm.put(100, "Amit");
		hm.put(102, "Ravi");
		hm.put(101, "Vijay");
		hm.put(103, "Rahul");
		hm.put(99, "Rahul111");
		System.out.println(hm);
		System.out.println("===================================================");
		
//		List<String> al = new ArrayList<String>();
//
//		al.addAll(hm.values());
//
//		System.out.println(al);

//	  for( String val :hm.values()){
////		  al.add(val);
//		  System.out.println(val);
//	  }
//	  
//	  System.out.println(al);
//	  
	  
	  System.out.println("===================================================");
//	  
//	  ArrayList<String> arrlist = new ArrayList<String>(hm.values());
	  
	  ArrayList<Integer> arrlist = new ArrayList<Integer>(hm.keySet());
//	  
//	  System.out.println(arrlist);
//	  System.out.println("..........");
//	  
//	  
	  List<String> customerIdList = hm.values()
			  							.stream()
			  							.collect(Collectors.toList());
	  
	  System.out.println(customerIdList);
	}
}