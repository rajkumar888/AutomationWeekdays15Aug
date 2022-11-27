package comparatordemo;

import java.util.Comparator;

public class Employee {
	
	private int empno;
	private String name;
	private int age;
	

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

	@Override
	public String toString() {
		return "Employee....> [empno= " + empno + ", name= " + name + ", age= " + age + "]";
	}
	
	
	
} // end of class Employee

