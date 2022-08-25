package day14.setdemo;

import java.util.Hashtable;

public class Hashtable1{  
	 public static void main(String args[]){  
		 
	  Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
	  
	  hm.put(100,"Amit");  
	  hm.put(102,"Ravi");  
	  hm.put(101,"Vijay");  
	  hm.put(103,"Rahul"); 
	  hm.put(99,"Rahul111"); 
//	  hm.put(null,"Rahul111"); 
//	  hm.put(9999,null); 
	  
	  
	  
	  System.out.println(hm);
	  
//	  for(Map.Entry m:hm.entrySet()){  
//	   System.out.println(m.getKey()+" "+m.getValue());  
//	  }  
	 }  
	}  