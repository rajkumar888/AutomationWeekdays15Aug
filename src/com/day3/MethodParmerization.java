package com.day3;

public class MethodParmerization {
	
	int x;
	int y;
	
	
	public void initialize(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void init(int a, int b){
		this.x = a;
		this.y = b;
	}
	
	
	public void show(){
		System.out.println(".................");
		System.out.println("Value of x "+x);
		System.out.println("Value of y "+y);
		System.out.println(".................");
	}
	
	public int sum(){
		return (x+y);
	}
	
	
	public int add(int a, int b){
		this.x = a;
		this.y = b;
		return (this.x+this.y);
	}
	
	
	public int diff(int x, int y){
		this.x = x;
		this.y = y;
		return (this.x - this.y);
	}
	
	public int product(int x, int y){
		this.x = x;
		this.y = y;
		return (this.x * this.y);
	}
	
	public int div(int x, int y){
		this.x = x;
		this.y = y;
		return (this.x / this.y);
	}
	
	public int mod(int x, int y){
		this.x = x;
		this.y = y;
		return (this.x % this.y);
	}

}
