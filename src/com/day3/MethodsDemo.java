package com.day3;

public class MethodsDemo {

	int x = 100;

	int y = 200;

	static int z = 500;

	public void display() {

		System.out.println("value of x " + x);
		System.out.println("value of y " + y);

		System.out.println("value of z " + z);

	}

	public static void show() {

		System.out.println("value of z " + z);

	}

	{
		System.out.println("value of x " + x);
		System.out.println("value of y " + y);

		System.out.println("value of z " + z);
	}

	static {

		System.out.println("value of z " + z);
	}

}
