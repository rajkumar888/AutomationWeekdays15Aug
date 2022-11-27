package comparatordemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo1 {

	
	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();

		al.add(new Employee(101, "Vijay", 23));
		al.add(new Employee(106, "Ajay", 27));
		al.add(new Employee(105, "Jai", 21));
		al.add(new Employee(100, "Rai", 24));
		
		System.out.println(al);
		
		Collections.sort(al, new EmpAgeComparator());
		System.out.println("....................................");
		System.out.println(al);
		System.out.println("....................................");
		Collections.sort(al, new EmpNoComparator());
		System.out.println("....................................");
		System.out.println(al);
		
		System.out.println("....................................");
		Collections.sort(al, new EmpNameComparator());
		System.out.println("....................................");
		System.out.println(al);
		
	}
	
	
}
