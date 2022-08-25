package interfacedemo;

public class Cir implements Shape{
	
	
	int value=0;

	public void setVal(int speed) {
		// TODO Auto-generated method stub
		
		value=speed;
		System.out.println("Value is set in circle calss");
		
	}

	public int getVal() {
		// TODO Auto-generated method stub
		System.out.println("returning the value in  circle calss");
		return value;
	}

	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
}
