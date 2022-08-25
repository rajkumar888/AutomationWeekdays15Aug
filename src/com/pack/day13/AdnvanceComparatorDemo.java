package com.pack.day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AdnvanceComparatorDemo {

	public static void main(String[] args) {

		
		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("mkyong", 8000, 33));
		result.add(new Developer("alvin", 9000, 20));
		result.add(new Developer("jason", 1000, 10));
		result.add(new Developer("iris", 5000, 55));
		
		System.out.println("Before Sort");
		
		for (Developer developer : result) {
			 System.out.println(developer.getName() + " " + developer.getSalary()+ " " + developer.getAge());
		}
		
		Collections.sort(result, new Comparator<Developer>() {
			public int compare(Developer o1, Developer o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		
		System.out.println("After Sort.........................................age");
		
		for (Developer developer : result) {
			 System.out.println(developer.getName() + " " + developer.getSalary()+ " " + developer.getAge());
		}
		
		
		Collections.sort(result, new Comparator<Developer>() {
			public int compare(Developer o1, Developer o2) {
				return o1.getSalary() - o2.getSalary();
			}
		});
		
		System.out.println("After Sort.........................................salary");
		
		for (Developer developer : result) {
			 System.out.println(developer.getName() + " " + developer.getSalary()+ " " + developer.getAge());
		}
	
	
		Collections.sort(result, new Comparator<Developer>() {
			public int compare(Developer o1, Developer o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		
		System.out.println("After Sort.........................................name");
		
		for (Developer developer : result) {
			 System.out.println(developer.getName() + " " + developer.getSalary()+ " " + developer.getAge());
		}
		
		
	}
	

}
