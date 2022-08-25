package com.abstractclass;

public abstract class AbstractClassDemo {
	
	int x;

	public  AbstractClassDemo(int x) {
		
		this.x = x;
		System.out.println("parameterized constructor from abstract class with "+this.x);
	}
	
	
	
	public AbstractClassDemo(){
		x=500;
		System.out.println("default constructor from abstract class");
	}
	
	
	public abstract void show();
	
	public void display(){
		System.out.println("inside display");
	}
	
	
}
