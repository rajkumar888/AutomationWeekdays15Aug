package day2.rangedemo;

public class RectangleProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write a program to calculate the area and
		// perimeter of a rectangle.

		int length = 30;

		int breadth = 15;

		int area = length * breadth;
		
		int pm = 2 * (length + breadth);

		System.out.println("Lenght of Rect " + length);
		System.out.println("Breadth of Rect " + breadth);
		System.out.println("Area of Rectangle " + area + " Square meters");

		System.out.println("Perimeter of Rectangle " + pm + " meters");
	}

}
