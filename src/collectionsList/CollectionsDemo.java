package collectionsList;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {

	public static void main(String[] args) {

		ArrayList<String> arrlist = new ArrayList<String>();

		arrlist.add("str1");
		arrlist.add("str2");
		arrlist.add("str3");
		arrlist.add("str4");
		arrlist.add("str5");

		System.out.println(arrlist);

		// Collections
		boolean b = Collections.addAll(arrlist, "abc1", "abc2", "abc3", "abc4", "abc5");

		System.out.println(b);

		System.out.println(arrlist);
		
		System.out.println("==========================================");

		ArrayList<Integer> arrlistInt = new ArrayList<Integer>();
		arrlistInt.add(330);
		arrlistInt.add(10);
		arrlistInt.add(20);
		arrlistInt.add(50);
		arrlistInt.add(70);
		
		
		System.out.println("Max value is: " + Collections.max(arrlistInt));
		System.out.println("Min value is: " + Collections.min(arrlistInt));
		
		System.out.println(arrlistInt);
		
		Collections.sort(arrlistInt);
		
		System.out.println(arrlistInt);
		
		Collections.reverse(arrlistInt);
		System.out.println(arrlistInt);
		System.out.println("==========================================");

		
		ArrayList<Integer> arrlistInt2 = new ArrayList<Integer>();
		arrlistInt2.add(400);
		arrlistInt2.add(1);
		arrlistInt2.add(2);
		arrlistInt2.add(3);
		arrlistInt2.add(4);
		
		
		System.out.println(arrlistInt2);
		
		if(arrlistInt2.size()==arrlistInt.size()){
			Collections.copy(arrlistInt2, arrlistInt);
		}else
		{
			System.out.println(" size is not matching for given arraylist....");
		}
		
		
		System.out.println(arrlistInt2);
		
		ArrayList<String> arrString = new ArrayList<String>();
		
		arrString.add("str1");
		arrString.add("str2");
		arrString.add("str3");
		arrString.add("str4");
		arrString.add("str5");
		
		if(arrString.size()==arrlistInt.size()){
//			Collections.copy(arrString, arrlistInt);
		}else
		{
			System.out.println(" size is not matching for given arraylist....");
		}
		
	}

}