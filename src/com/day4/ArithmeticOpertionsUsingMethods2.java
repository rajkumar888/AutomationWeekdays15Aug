package com.day4;

import java.util.Date;

public class ArithmeticOpertionsUsingMethods2 {
	
	{
		System.out.println("demo non static block");
	}
	
	public int getsum(int x, int y){
		return x+y;
	}
	
	public int getdiff(int x, int y){
		return x-y;
	}
	
	
	public int getproduct(int x, int y){
		return x*y;
	}
	
	public int getdiv(int x, int y){
		return x/y;
	}
	
	public int getmoddiv(int x, int y){
		return x%y;
	}
	
	
	public static void demo(){
		System.out.println("demo static method");
	}

	
	static {
		System.out.println("demo static block");
	}
	
	
	
	public static void main(String[] args) {
		
		ArithmeticOpertionsUsingMethods2 obj = new ArithmeticOpertionsUsingMethods2();
		
		
	
		
		
		System.out.println(obj.getsum(150,70));
		System.out.println(obj.getdiff(200,100));
		System.out.println(obj.getproduct(20,5));
		System.out.println(obj.getdiv(100,5));
		System.out.println(obj.getmoddiv(100,7));
		ArithmeticOpertionsUsingMethods2.demo();
		
		
		System.out.println("End of program....."+new Date());

	}

}
