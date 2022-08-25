package com.pack.day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Simple {
	public static void main(String args[]) {

		ArrayList<Employee> al = new ArrayList<Employee>();

		al.add(new Employee(101, "Vijay", 23));
		al.add(new Employee(106, "Ajay", 27));
		al.add(new Employee(105, "Jai", 21));
		al.add(new Employee(100, "Rai", 24));

		System.out.println("Sorting by .......");

		// Collections.sort(al, new NameComparator());

		Collections.sort(al, Comparator.comparing(Employee::getName));

		for (Employee st : al) {
			System.out.println(st.empno + " " + st.name + " " + st.age);
		}
		
		System.out.println("........");
		
		Collections.sort(al, Comparator.comparing(Employee::getAge));

		for (Employee st : al) {
			System.out.println(st.empno + " " + st.name + " " + st.age);
		}
		
		System.out.println("........");
		
		Collections.sort(al, Comparator.comparing(Employee::getEmpno));

		for (Employee st : al) {
			System.out.println(st.empno + " " + st.name + " " + st.age);
		}
		
		
		
		
	}
}