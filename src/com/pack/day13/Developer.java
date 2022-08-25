package com.pack.day13;


public class Developer {
	
	String name;
	int Salary;
	int age;
	
	public int getSalary() {
		return Salary;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Developer(String name,int Salary,  int age) {
		this.Salary = Salary;
		this.name = name;
		this.age = age;
	}

	public Developer() {

	}
}
