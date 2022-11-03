package com.comparabledemo;

import java.util.ArrayList;
import java.util.Collections;

public class StudentDemoImp {
	
	public static void main(String args[]) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		Student s1 = new Student(101, "Vijay", 23,66.7f);
		Student s2 = new Student(106, "Ajay", 27,78.4f);
		Student s3 = new Student(105, "Jai", 11,74.9f);
		Student s4 = new Student(104, "Rai", 40,99.5f);
		Student s5 = new Student(108, "Qai", 29,89.5f);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
//		al.add(new Student(101, "Vijay", 23));
//		al.add(new Student(106, "Ajay", 27));
//		al.add(new Student(105, "Jai", 11));
//		al.add(new Student(104, "Rai", 40));
//		al.add(new Student(108, "Yai", 29));

		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age+" "+st.marks);
		}
		System.out.println("==================================");
		Collections.sort(al);
		
		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age+" "+st.marks);
		}
	}
}