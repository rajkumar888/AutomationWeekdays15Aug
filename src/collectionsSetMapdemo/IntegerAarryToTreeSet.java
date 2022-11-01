package collectionsSetMapdemo;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class IntegerAarryToTreeSet {

	public static void main(String[] args) {
		
        Integer arr[] = { 5, 6, 7, 8, 1, 2, 3, 4, 3 };
  
        Set<Integer> set = new TreeSet<Integer>(Arrays.asList(arr));
  
        System.out.println(set);

	}

}
