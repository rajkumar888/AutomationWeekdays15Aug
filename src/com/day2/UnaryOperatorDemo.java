package com.day2;

public class UnaryOperatorDemo {

	public static void main(String[] args) {

		int x = 10;
		int y = 5;

		int sum = 0;
		int diff = 0;

		// System.out.println(++x);
		// System.out.println(x++);
		// System.out.println(x);
		// sum= (++x) + (++x) + (++x) + x + (x++);
		// System.out.println(sum);
		// System.out.println(x);
		// sum= (x++) +(x++) + (x++) + x;
		// System.out.println(sum);
		// System.out.println(x);

		diff = (x) + (x) + (--x) - (--x) + (x++);

		System.out.println(diff);
		System.out.println(x);
	}
}
