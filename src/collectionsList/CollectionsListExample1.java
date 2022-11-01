package collectionsList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class CollectionsListExample1 { 
	
	
    public static void main(String[] args) { 
    	
    	
    	
        //Create vector and array list  
    	ArrayList<String> arrlist = new ArrayList<String>(); 
          
          
          Vector<String> v = new Vector<String>(); 
          
          //Populate the vector  
          v.add("A1");         
          v.add("B1");  
          v.add("C1");  
          v.add("D1");  
          v.add("E1");  
          
          
          //Create enumeration  
          Enumeration<String> enumer = v.elements(); 
          
//          while(enumer.hasMoreElements()){
//        	  System.out.println(enumer.nextElement()+" ");
//          }
          
          
          arrlist = Collections.list(enumer); 
          
          System.out.println(arrlist);
          
          }     
}  