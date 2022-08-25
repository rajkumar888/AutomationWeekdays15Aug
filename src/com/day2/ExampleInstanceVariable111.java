package com.day2;

public class ExampleInstanceVariable111 {

	int a = 100; // instance variable

	int b = 200; // instance variable

	static int z = 400;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExampleInstanceVariable111 obj = new ExampleInstanceVariable111();

		// object creation
		// instantiation in java

		ExampleInstanceVariable111 obj1 = new ExampleInstanceVariable111();

		ExampleInstanceVariable111 obj2 = new ExampleInstanceVariable111();

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
		System.out.println(z);
		System.out.println(ExampleInstanceVariable111.z);  // STATNDARD WAY OF USING STATIC MEMBERS
	}

}
