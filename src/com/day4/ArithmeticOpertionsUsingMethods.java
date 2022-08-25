package com.day4;

import java.util.Date;

public class ArithmeticOpertionsUsingMethods {
	
	int x;
	int y;
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public void setValueOfX(int x){
		this.x=x;
	}
	
	public void setValueOfY(int y){
		this.y=y;
	}

	
	public int sum(){
		return x+y;
	}
	
	public int diff(){
		return x-y;
	}
	
	
	public int product(){
		return x*y;
	}
	
	public int div(){
		return x/y;
	}
	
	public int moddiv(){
		return x%y;
	}
	

	public static void main(String[] args) {
		
		ArithmeticOpertionsUsingMethods obj = new ArithmeticOpertionsUsingMethods();
		
		

		System.out.println(obj.getX());
		
		obj.setValueOfX(100);
		
		System.out.println(obj.getX());
		
		System.out.println(".................");
		System.out.println(obj.getY());
		
		obj.setValueOfY(7);
		
		System.out.println(obj.getY());
		
		
		System.out.println(obj.sum());
		System.out.println(obj.diff());
		System.out.println(obj.product());
		System.out.println(obj.div());
		System.out.println(obj.moddiv());
		
		
		
		
		System.out.println("End of program....."+new Date());

	}

}
