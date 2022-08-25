package com.day2;

public class ConstructorsDemo {
	
	private int x;
	private int y;
	
	static{
		System.out.println("init static block1 is invoked.......");
	}
	
	
	//init block in java 
	{
		System.out.println("init block1 is invoked.......");
	}
	
	{
		System.out.println("init block2 is invoked.......");
	}
	{
		System.out.println("init block3 is invoked.......");
	}
	{
		System.out.println("init block4 is invoked.......");
	}
	
	
	
	// default constructor
	public ConstructorsDemo() {
		x=100;
		y=20;
		System.out.println("Constructor is invoked......");
	}
	
	// parameterized constructor
	public ConstructorsDemo(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("parameterized Constructor is invoked......");
	}
	
	public ConstructorsDemo(ConstructorsDemo localObj) {
		this.x = localObj.x;
		this.y = localObj.y;
		System.out.println("cloning Constructor is invoked......");
	}
	
	

	public void show(){
		System.out.println("Value of x "+x);
		System.out.println("Value of y "+y);
	}
	
	public void sum(){
		System.out.println("Value of sum "+(x+y));
	}
	
	
	public void diff(){
		System.out.println("Value of diff "+(x-y));
	}
	
	
	public void product(){
		System.out.println("Value of Product "+(x*y));
	}
	
	public void div(){
		System.out.println("Value of div "+(x/y));
	}
	
	public void mod(){
		System.out.println("Value of mod "+(x%y));
	}

}
