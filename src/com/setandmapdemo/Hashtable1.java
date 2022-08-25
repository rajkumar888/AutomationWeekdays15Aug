package com.setandmapdemo;

import java.util.Hashtable;
import java.util.Map;

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
	  
	  
	  
//	  System.out.println(hm);
	  
//	  for(Map.Entry<Integer,String> m :hm.entrySet()){  
//	   System.out.println(m.getKey()+" "+m.getValue());  
//	  }  
	  for(Integer m :hm.keySet()){
		   System.out.println(m);  
		  } 
	  
//	  hm.remove(99);
	  
	  hm.remove(103,"Rahul");
	  for(Map.Entry<Integer,String> m :hm.entrySet()){  
	   System.out.println(m.getKey()+" "+m.getValue());  
	  }  
	  
	  
	 }  
	}  