package com.day4;

public class ConstructorChain {

	// default constructor
	public ConstructorChain() {
		this("Javatpoint");
		System.out.println("Default constructor called.");
	}

	// parameterized constructor
	public ConstructorChain(String str) {
		System.out.println("Parameterized constructor called");
	}

	// main method
	public static void main(String args[]) {
		// initializes the instance of example class
		ConstructorChain cc = new ConstructorChain();
	}

}
