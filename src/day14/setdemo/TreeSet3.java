package day14.setdemo;

import java.util.TreeSet;

public class TreeSet3{  
	
	
	 public static void main(String args[]){  
		 
		 
	 TreeSet<Integer> set=new TreeSet<Integer>();  
	         set.add(24);  
	         set.add(66);  
	         set.add(12);  
	         set.add(20);  
	         set.add(18);  
	         set.add(16);  
	         set.add(11);  
	         
	         System.out.println(set);
	         
	         
	         
//	         Integer[] arr = (Integer[]) set.toArray();
//	         
//	         
//	         for(int i=0; i<arr.length; i++){
//	        	 System.out.println(arr[i]);
//	         }
	         
	         System.out.println("Lowest Value: "+set.pollFirst());  
	         System.out.println("Highest Value: "+set.pollLast());  
//	         
//	         System.out.println(".........");{
//	         
	         System.out.println(set);
	 }  
	}  