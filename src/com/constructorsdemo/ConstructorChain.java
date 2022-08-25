package com.constructorsdemo;

public class ConstructorChain {

	// default constructor
	public ConstructorChain() {
//		this("Javatpoint...............");
		this(10);
		System.out.println("Default constructor called.");
	}

	// parameterized constructor
	public ConstructorChain(String str) {
		System.out.println("Parameterized constructor called "+str);
	}

	// parameterized constructor
		public ConstructorChain(int x) {
			System.out.println("integer Parameterized constructor called "+x);
		}
	
	
	// main method
	public static void main(String args[]) {
		// initializes the instance of example class
		ConstructorChain cc = new ConstructorChain();
	}

}
