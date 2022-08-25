package interfacedemo;

public class CircleleImp {

	
	
	
	public static void main(String[] args) {

		Circle cir = new Circle(10);
		
		
		System.out.println("Area of Circle is "+ cir.getArea());
		
		System.out.println("PM of Circle is "+ cir.getPerimeter());
		
		
		cir.showDate();
		
		
		Shape.testStaticDemo();
		
		System.out.println(Shape.x);
		
	
	}

}
