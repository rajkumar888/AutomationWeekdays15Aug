package com.setandmapdemo;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Hashtable2{  
	 public static void main(String args[]){  
		 
	  Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
	  
	  hm.put(100,"Amit");  
	  hm.put(102,"Ravi");  
	  hm.put(101,"Vijay");  
	  hm.put(103,"Rahul"); 
	  hm.put(99,"Rahul111"); 
	  
	  
	  List<String> al = new ArrayList<String>();
	  
	  
	  al.addAll(hm.values());
	  
	  System.out.println(al);
	  
	  
//	  for(    String val :hm.values()){
//		  al.add(val);
//	  }
//	  
//	  System.out.println(al);
//	  
//	  
//	  ArrayList<String> arrlist = new ArrayList<String>(hm.values());
//	  
//	  System.out.println(arrlist);
//	  System.out.println("..........");
//	  
//	  
//	  List<String> customerIdList = hm.values()
//			  							.stream()
//			  							.collect(Collectors.toList());
//	  
//	  System.out.println(customerIdList);
	 }  
	}  