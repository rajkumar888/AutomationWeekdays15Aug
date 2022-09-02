package abstractclassDemo;

import interfacedemo.Rectangle;

public class RectangleImpl {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(100,50);
		
			System.out.println("Area "+rect.getArea());
			System.out.println("Perimeter "+rect.getPerimeter());
	}

}
