package com.day2;

public class StaticInitBlocks {

	
	int x;
	static int y;
	
	
	static {
		y=200;
		System.out.println("static block1 in called"+y);
	}
	
	{
		y=300;
		System.out.println("non static or init block1 is called "+y);
	}
	
	{
		System.out.println("non static or init block2 is called "+x);
	}
	
	public StaticInitBlocks(){
		System.out.println("inside consturctor......");
	}

	
	
	public static void main(String[] args) {
			System.out.println("inside main method");
			
			StaticInitBlocks obj = new StaticInitBlocks();
			
			obj.hashCode();
			
	}

	static {
		System.out.println("static block2 in called");
		
	}
	
	
	
}
