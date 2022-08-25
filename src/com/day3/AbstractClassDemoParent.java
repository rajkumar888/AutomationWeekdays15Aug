package com.day3;

public abstract class AbstractClassDemoParent {
	
	
	private int x=100;
	
	public AbstractClassDemoParent(){
		System.out.println("constructor is called..... from AbstractClassDemo");
	}
	

//	public abstract static void main(String[] args);
	
	protected abstract void test(String[] args);
	
	public abstract void abstractmethod1();
	
	public abstract void abstractmethod2();
	
	public abstract void abstractmethod3();
	
	
	public void temp(){
		System.out.println("temp method is called");
	}
	
	
	public void showX(){
		System.out.println("Value of x "+x);
	}
	
	
//	public static void main(String[] args) {
//		
//		
//		System.out.println("hello world");
//
//	}

}
