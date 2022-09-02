package abstractclassDemo;

public class Circle extends ShapeClass{

	private int radius;
	
	public Circle(int radius){
		super(100);
//		super("Demo of Parameter");				// this() or super()
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
