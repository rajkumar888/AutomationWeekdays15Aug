package com.demoofimport;

import com.day2.ExampleInstanceVariable;

public class ExampleInstanceVariableMainMethodDemo {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExampleInstanceVariable obj= new ExampleInstanceVariable();
		
		// control + shift + O - organized import

		ExampleInstanceVariable obj1 = new ExampleInstanceVariable();

		ExampleInstanceVariable obj2 = new ExampleInstanceVariable();

		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.z);  

		obj.a = 500;
		obj.b = 600;
		obj.z = 1000;

		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.z);

		System.out.println("---------------------");
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		System.out.println(obj1.z);
		System.out.println("---------------------");

		System.out.println(obj2.a);
		System.out.println(obj2.b);
		System.out.println(obj2.z);
		obj2.z = 2000;
		System.out.println("---------------------");
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.z);
		
		
		System.out.println("---------------------");
		
		System.out.println(ExampleInstanceVariable.z);  // STATNDARD WAY OF USING STATIC MEMBERS
	}
	

}
