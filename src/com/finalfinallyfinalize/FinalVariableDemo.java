package com.finalfinallyfinalize;

public class FinalVariableDemo {
	
	final int x=100;
	final int y;
	final int z;
	static final int i;
	int pqr=200;
	
	
	
	public FinalVariableDemo(){
		y=200;
		System.out.println(" constructor is called "+y);
	}
	
	// initializer block in java
	{
		z=500;
		System.out.println(" initializer block in called "+z);
	}
	
	
	static{
		i=555;
		System.out.println(" static block in called "+i);
	}
	

	public static void main(String[] args) {
		
		System.out.println(" main method in called ");
		
		final FinalVariableDemo obj = new FinalVariableDemo();
		
		System.out.println("value of x "+obj.i);
		
//		obj.x=500; // not allowed
		
//		obj = new FinalVariableDemo();
		System.out.println("value of x "+obj.pqr);
		obj.pqr=1000;
		System.out.println("value of x "+obj.pqr);
		
	}

}
