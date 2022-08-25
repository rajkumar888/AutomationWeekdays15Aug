package com.comparabledemo;

public class Employee {
	int empno;
	String name;
	int age;
	
	public int getEmpno() {
		return empno;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	

	public Employee(int empno, String name, int age) {
		this.empno = empno;
		this.name = name;
		this.age = age;
	}

	public Employee() {

	}
}

//class AgeComparator implements Comparator<Employee> {
//
//	public int compare(Employee e1, Employee e2) {
//		if (e1.age == e2.age)
//			return 0;
//		else if (e1.age > e2.age)
//			return 1;
//		else
//			return -1;
//	}
//}
//
//
//class NameComparator implements Comparator<Employee> {
//
//	public int compare(Employee e1, Employee e2) {
//		return e1.name.compareTo(e2.name);
//	}
//}