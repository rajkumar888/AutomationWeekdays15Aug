package com.pack.exceptiondemo;

public class StackOverFlowErrorDemo {
	
	public void m1(){
		System.out.println("inide m1.....");
		m2();		//	calling of method m2
	}
	
	public void m2(){
		System.out.println("inide m2.....");
		m1(); //	calling of method m2
	} 
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		StackOverFlowErrorDemo obj = new StackOverFlowErrorDemo();
		
		obj.m1();
		
		
	}

}
