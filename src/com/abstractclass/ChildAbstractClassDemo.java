package com.abstractclass;

public abstract class ChildAbstractClassDemo extends AbstractClassDemo{
	
	
	public abstract void testabstractmethod();
	
	
	public ChildAbstractClassDemo(){
		System.out.println("default constructor from ChildAbstractClassDemo class");
	}
	
	public ChildAbstractClassDemo(int x){
		super(x);
	}
}
