package day2.rangedemo;

public class RectangleProblem {

	public static void main(String[] args) {

		// Write a program to calculate the area and
		// Perimeter of a rectangle.

		int length = 20;

		int breadth = 10;

		int area = length * breadth;

		int pm = 2 * (length + breadth);

		System.out.println("Lenght of Rectangle " + length + " meters");
		System.out.println("Breadth of Rectangle " + breadth + " meters");
		System.out.println("Area of Rectangle " + area + " Square meters");
		System.out.println("Perimeter of Rectangle " + pm + " meters");
	}

}
