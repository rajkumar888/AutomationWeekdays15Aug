package day14.setdemo;

import java.util.TreeMap;

public class TreeMap1{  
	 public static void main(String args[]){ 
		 
		 
		 
	   TreeMap<Integer,String> map=new TreeMap<Integer,String>();  
	   
	      map.put(100,"Amit");    
	      map.put(102,"Ravi");    
	      map.put(101,"Vijay");    
	      map.put(103,"Rahul");
	      map.put(99,"Rahul111");   
	      map.put(999,null);   
//	      map.put(null,"xyz");   
	      
	      System.out.println(map);  
	      
	      System.out.println(map.descendingMap());  
	      
	 }  
	}  