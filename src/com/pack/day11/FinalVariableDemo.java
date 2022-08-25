package com.pack.day11;

public class FinalVariableDemo {
	
	final int x=100;
	final int y;
	final int z;
	static final int i;
	
	
	
	public FinalVariableDemo(){
		y=200;
		System.out.println(" constructor is called ");
	}
	
	// initializer block in java
	{
		z=500;
		System.out.println(" initializer block in called ");
		
	}
	
	
	static{
		System.out.println(" static block in called ");
		i=555;
	}
	

	public static void main(String[] args) {
		
		System.out.println(" main method in called ");
		
		FinalVariableDemo obj = new FinalVariableDemo();

	}

}
