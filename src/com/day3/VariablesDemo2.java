package com.day3;




public class VariablesDemo2 {

	int x = 100;
	
	
	
	{

		System.out.println("inside non static block1 or initializer block");

	}
	

	

	public static void main(String[] args) {
		

		
		
		VariablesDemo2 obj = new VariablesDemo2();
		
		VariablesDemo2 obj2 = new VariablesDemo2();
		
		;  // anonymous object in java
		 
		 
		System.out.println(obj.x);
		System.out.println(obj2.x);
		System.out.println( new VariablesDemo2().x);
		
		System.out.println( new VariablesDemo2().x);

	}
	
	
	
}
