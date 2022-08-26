
package com.constructorsdemo;

public class ConstructorChainingDemo {

	int x;
	int y;

	public ConstructorChainingDemo() {
		this(100, 200);
		x = 100;
		y = 200;
		System.out.println("Default cosntructor");

	}

	public ConstructorChainingDemo(int x, int y) {
		this(100);
		this.x = x;
		this.y = y;
		System.out.println("two parmeter cosntructor");
	}

	public ConstructorChainingDemo(int x) {
		this.x = x;
		System.out.println("one parmeter cosntructor");
	}

	// copy constructor
	public ConstructorChainingDemo(ConstructorChainingDemo obj) {
		this.x = obj.x;
		this.y = obj.y;
		System.out.println("copy cosntructor");
	}

	public void show() {
		System.out.println("........................");
		System.out.println("Value of x " + x);
		System.out.println("Value of y " + y);
	}

	public static void main(String[] args) {

		new ConstructorChainingDemo();

	}
	
	

}
