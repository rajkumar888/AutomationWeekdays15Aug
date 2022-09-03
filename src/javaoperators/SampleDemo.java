package javaoperators;

public class SampleDemo {

	int y=200;		//	instance variable
	
	static int z=500;  // static variable
	
	public static void main(String[] args) {
		
		int x=100;			// local variable
		
		System.out.println("local variable "+x);
		
		
//		System.out.println("instance variable "+y);
		
		
		System.out.println("Value of static variable "+SampleDemo.z);
		
		SampleDemo obj = new SampleDemo();		// instantiation 
		
		System.out.println("instance variable "+obj.y);
		
		obj.y=888;
		System.out.println("instance variable "+obj.y);
		
		System.out.println(" instance variable with anonymous object "+ new SampleDemo().y);
		
		
		SampleDemo obj1 = new SampleDemo();
		
		System.out.println("instance variable "+obj1.y);
		
		System.out.println(obj.z);
		System.out.println(obj1.z);
		
		obj.z=1000;
		
		System.out.println(obj.z);
		System.out.println(obj1.z);
		
	}

}
