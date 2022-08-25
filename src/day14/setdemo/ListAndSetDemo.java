package day14.setdemo;

import java.util.ArrayList;

public class ListAndSetDemo {

	public static void main(String[] args) {
		
		
		 ArrayList<String> arraylist = new ArrayList<String>();
		   arraylist.add("AA");
		   arraylist.add("ZZ");
		   arraylist.add("CC");
		   arraylist.add("FF");
		   arraylist.add("AA");
		   arraylist.add("ZZ");
		   arraylist.add("CC");
		   arraylist.add("FF");
		   arraylist.add("CC");
		   arraylist.add("FF");
		   arraylist.add("AA");
		   
		   System.out.println(arraylist);
		   
//		   HashSet<String> listsetdemo = new HashSet<String>(arraylist);
//		   System.out.println(listsetdemo);
		   
		   ArrayList<String> arraylistunique = new ArrayList<String>();
		   
		   for(int i=0; i<arraylist.size(); i++){
			   
			   	if(!arraylistunique.contains(arraylist.get(i))){
			   		arraylistunique.add(arraylist.get(i));
			   	}
		   }
		   
		   System.out.println(arraylistunique);
		   
		   
		   
		

	}

}
