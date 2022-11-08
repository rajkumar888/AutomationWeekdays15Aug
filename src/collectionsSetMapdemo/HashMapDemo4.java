package collectionsSetMapdemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo4 { 
	
public static void main(String[] args) {    
    //Creating map of Books   
	
    Map<Integer,Book> map=new HashMap<Integer,Book>();   
    
    //Creating Books    
    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);    
    //Adding Books to map   
    
    
    map.put(1,b1);  
    map.put(2,b2);  
    map.put(3,b3);  
      
    //Traversing map  
    for(Map.Entry<Integer, Book> entry:  map.entrySet()){    
    	
//    	System.out.println(entry.getKey()+" "+entry.getValue());	
    	
        System.out.println(entry.getKey()+", "+entry.getValue().getId()
        		+"\t"+entry.getValue().getName()+"\t"+entry.getValue().getAuthor()+"\t"+entry.getValue().getQuantity()
        		+"\t"+entry.getValue().getPublisher());   
    }    
}    
}    