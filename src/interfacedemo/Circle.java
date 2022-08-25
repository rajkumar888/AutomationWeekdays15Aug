package interfacedemo;

public class Circle implements Shape{

	private int radius;
	
	public Circle(int radius){
		this.radius=radius;
	}
	
	@Override
	public int getArea() {
		return  (int) (3.141592653589793238*radius*radius);
	}

	@Override
	public int getPerimeter() {
		
		return (int) (2*3.141592653589793238*radius);
	}

}
