package interfacedemo;

import java.util.Date;

public interface DemoInterface111 {
	
	public final static int x=500;
	static public final  String str="interfacedemo";
	
	// abstract methods
	public abstract void method1();
	public abstract void method2();
	
	
	
	public static void method3(){
		System.out.println("inside static interface method");
	}
	
	public default void showDate(){
		System.out.println("default method from Shape interface is called....");
		System.out.println("Today's date and time is "+ new Date());
	}
	
	
	
}
