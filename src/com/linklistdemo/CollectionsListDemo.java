package com.linklistdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class CollectionsListDemo {

	public static void main(String[] args) {
		
          Vector<String> v = new Vector<String>();  
          v.add("AAAA");         
          v.add("BBBB");  
          v.add("CCCC");  
          v.add("DDDD");  
          v.add("EEEE");
          
          //Create enumeration  
          Enumeration<String> e = v.elements();  
          
          //Get the list  
          ArrayList<String> arrlist = Collections.list(e);
          
          System.out.println(arrlist);  

	}

}
