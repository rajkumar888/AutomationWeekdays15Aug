package com.setandmapdemo;

import java.util.HashSet;
import java.util.Set;

public class Set_example_Integers {
	  
    public static void main(String[] args)
    {
        // Create a set
        Set<Integer> set = new HashSet<Integer>();
  
        // Add some elements to the set
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(3);
        set.add(null);
        
        System.out.println(set);
    }
}
