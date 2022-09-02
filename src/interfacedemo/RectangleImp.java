package interfacedemo;

public class RectangleImp {

	public static void main(String[] args) {

		Rectangle rect = new Rectangle(50,30);
		
		
		System.out.println("Area of rectangle is "+ rect.getArea());
		
		System.out.println("PM of rectangle is "+ rect.getPerimeter());
		
		rect.showDate();
		
		Shape shape = new Rectangle(50,30);
		
		Shape.testStaticDemo();
		
	}

}
