package com.objectcreationdemo;

public class CustomMethodsDemo {

	private String empname = "";
	private String emp_number = "";

	
	public String readEmpName(){
		return empname;
	}
	

	public String readEmp_number(){
		return emp_number;
	}
	
	
	public void writeEmpName(String name){
		empname=name;
	}
	
	public void writeEmp_number(String emp_num){
		emp_number=emp_num;
	}

	public void displayAll(){
		System.out.println("Employee Number "+emp_number);
		System.out.println("Employee Name "+empname);
	}
	

}
