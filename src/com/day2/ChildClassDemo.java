package com.day2;

public class ChildClassDemo extends ParentDemo{
	
	private int x;
	private int y;
	
	static{
		System.out.println("init static block1 is invoked.......child class");
	}
	
	
	//init block in java 
	{
		System.out.println("init block1 is invoked.......child class");
	}
	
	
	// default constructor
	public ChildClassDemo() {
		x=100;
		y=20;
		System.out.println("Constructor is invoked......child class");
	}
	
	

	public void show(){
		System.out.println("child class Value of x "+x);
		System.out.println("child class Value of y "+y);
	}
	
}
