package com.comparabledemo;

public class Student implements Comparable<Student> {
	
	
	int rollno;
	String name;
	int age;
	float marks;

	public Student(int rollno, String name, int age,float marks) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	
	public Student(){
		
	}
	
//	public int compareTo(Student st) {
////		return this.age - st.age;
////		return st.age - this.age;
//		
////		return this.rollno - st.rollno;
//		
//		return st.rollno - this.rollno;
//	}
	
	
	

//	public int compareTo(Student st) {
//		return this.name.compareTo(st.name);
//		return st.name.compareTo(this.name);
//	}
	
	
//	public int compareTo(Student st) {
//		if (this.marks == st.marks)
//			return 0;
//		else if (this.marks > st.marks)
//			return 1;
//		else
//			return -1;
//	}
	
	public int compareTo(Student st) {
		if (this.marks == st.marks)
			return 0;
		else if (this.marks > st.marks)
			return 1;
		else
			return -1;
	}
}