package com.objectcreationdemo;

public class CustomMethodImpl {

	
	
	
	public static void main(String[] args) {
	
		CustomMethodsDemo obj = new CustomMethodsDemo();
		
		obj.displayAll();
		
		obj.writeEmp_number("E1001");
		obj.writeEmpName("World");
		
		System.out.println("Employee Number is "+obj.readEmp_number());
		System.out.println("Employee Name is "+obj.readEmpName());
		
		obj.displayAll();
	}

}
