package com.day2;

public class ParentDemo {
	
	private int x;
	private int y;
	
	static{
		System.out.println("init static block1 is invoked.......parent class");
	}
	
	
	//init block in java 
	{
		System.out.println("init block1 is invoked.......parent class");
	}
	
	
	// default constructor
	public ParentDemo() {
		x=100;
		y=20;
		System.out.println("Constructor is invoked......parent class");
	}
	
	

	public void show(){
		System.out.println("parent class Value of x "+x);
		System.out.println("parent class Value of y "+y);
	}
	
}
