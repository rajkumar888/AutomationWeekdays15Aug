package comparatordemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo2 {

	
	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();

		al.add(new Employee(101, "Vijay", 23));
		al.add(new Employee(106, "Ajay", 27));
		al.add(new Employee(105, "Jai", 21));
		al.add(new Employee(100, "Rai", 24));
		
		System.out.println(al);
		
//		Collections.sort(al, Comparator.comparing(Employee::getName));
//		System.out.println(".....................................");
//		System.out.println(al);
//		
//		Collections.sort(al, Comparator.comparing(Employee::getAge));
//		System.out.println(".....................................");
//		System.out.println(al);
//		
//		Collections.sort(al, Comparator.comparing(Employee::getEmpno));
//		System.out.println(".....................................");
//		System.out.println(al);

//		for (Employee st : al) {
//			System.out.println(st.getEmpno() + " " + st.getName() + " " + st.getAge());
//		}
		
		
//	    
//		System.out.println(".....reversed..");
//		
//	    Collections.sort(al, Comparator.comparing(Employee::getName).reversed());
//	    System.out.println(".....................................");
//		System.out.println(al);
//		
//		System.out.println(".....................................");
		
		System.out.println(al);
		
		Collections.sort(al, Comparator.comparing(Employee::getAge));
		
		System.out.println("after Sorting.......Age basis");
		System.out.println(al);
	    
		System.out.println("Reversed sorting age....");
		Collections.sort(al, Comparator.comparing(Employee::getAge).reversed());
		
		System.out.println(al);
		
	
	    
	}
	
	
}
