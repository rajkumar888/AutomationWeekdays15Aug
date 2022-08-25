package com.interfacedemo;

public class ChildOfinterfaceDemo implements InterfaceDemo,InterfaceDemoA,InterfaceDemoB{
	

	@Override
	public void display() {
		System.out.println("inside display...");
		
	}

	@Override
	public void show() {
		System.out.println("inside show...");
	}

	
	
	@Override
	public void defaultdemo() {
		// TODO Auto-generated method stub
		InterfaceDemo.super.defaultdemo();
	}

	public static void main(String[] args) {
		
		System.out.println(InterfaceDemo.x);
		
		ChildOfinterfaceDemo obj = new ChildOfinterfaceDemo();
		
		
		obj.show();
		
		obj.display();
		
		obj.defaultdemo();
		
		InterfaceDemo.statictest();
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		
	}

	
}
