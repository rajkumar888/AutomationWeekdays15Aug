package day2.rangedemo;

import java.util.Scanner;

public class RectangleProblem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write a program to calculate the area and
		// perimeter of a rectangle.

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the lenght ");
		int length = in.nextInt();

		System.out.println("Enter the breadth ");
		int breadth = in.nextInt();

		int area = length * breadth;
		
		int pm = 2 * (length + breadth);

		System.out.println("Lenght of Rect " + length);
		System.out.println("Breadth of Rect " + breadth);
		System.out.println("Area of Rectangle " + area + " Square meters");

		System.out.println("Perimeter of Rectangle " + pm + " meters");
	}

}
