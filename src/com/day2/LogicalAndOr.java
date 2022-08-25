package com.day2;

public class LogicalAndOr {

	public static void main(String[] args) {
//
//		System.out.println(true && true);
//		System.out.println(false && false);
//		System.out.println(true && false);
//		System.out.println(false && true);
////
//		System.out.println(".............................");
//		System.out.println(true || true);
//		System.out.println(false || false);
//		System.out.println(true || false);
//		System.out.println(false || true);

		System.out.println(".............................");

		System.out.println((10 > 5) && (10 > 5));
		System.out.println((10 < 5) && (10 < 5));
		System.out.println((10 > 5) && (10 < 5));
		System.out.println((10 < 5) && (10 > 5));

		System.out.println(".............................");

		System.out.println((10 > 5) || (10 > 5));
		System.out.println((10 < 5) || (10 < 5));
		System.out.println((10 > 5) || (10 < 5));
		System.out.println((10 < 5) || (10 > 5));
	}

}
