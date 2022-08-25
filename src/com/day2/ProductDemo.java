package com.day2;

public class ProductDemo {
	
	private int x;
	private int y;
	
	
	// default constructor
	public ProductDemo() {
		x=100;
		y=20;
		System.out.println("Constructor is invoked......");
	}
	
	// parameterized constructor
	public ProductDemo(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("parameterized Constructor is invoked......");
	}
	
	public ProductDemo(ProductDemo localObj) {
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
	
	
	public static void main(String[] args) {
		ProductDemo obj = new ProductDemo();
		
		obj.show();
		
		obj.sum();
		
		obj.diff();
		
		obj.product();
		
		obj.div();
		
		System.out.println("End of program.......");
	}
	

}
