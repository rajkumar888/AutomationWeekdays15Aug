package interfacedemo;

import java.util.Date;

public interface Shape {
	
	int x=500;
	
	public abstract int getArea();

	public abstract int getPerimeter();
	
	
	public default void showDate(){
		System.out.println("default method from Shape interface is called....");
		System.out.println("Today's date and time is "+ new Date());
	}
	
	public static void testStaticDemo(){
		System.out.println("static method from Shape interface is called....");
	}

}
