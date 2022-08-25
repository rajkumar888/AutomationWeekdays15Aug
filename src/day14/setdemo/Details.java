package day14.setdemo;

import java.util.ArrayList;
import java.util.Comparator;

public class Details  {

	public static void main(String args[]){
		
	   ArrayList<String> arraylist = new ArrayList<String>();
	   arraylist.add("AA");
	   arraylist.add("ZZ");
	   arraylist.add("CC");
	   arraylist.add("FF");
	   
	   System.out.println(arraylist);
	   
	  arraylist
	  .stream()
	  .sorted(Comparator.reverseOrder())	  
	  .forEach(s -> System.out.println(s));
	  
	  
	  
	   
//	   System.out.println(arraylist);

	   /*Unsorted List: ArrayList content before sorting*/
//	   System.out.println("Before Sorting:");
	   
//	   for(String str: arraylist){
//			System.out.println(str);
//		}
//
//	   System.out.println(".......................");
//	   
//	   
//	   /* Sorting in decreasing order*/
//	   Collections.sort(arraylist, Collections.reverseOrder());
//
//	   /* Sorted List in reverse order*/
//	   
//	   System.out.println("ArrayList in descending order:");
//	   for(String str: arraylist){
//			System.out.println(str);
//		}
	}
}