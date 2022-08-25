package com.day3;

public class InstanceAndStaticVariableDemo {
	
	int x=100;
	int y=200;
	static int z=999;
	
		

	public static void main(String[] args) {
	
		int z=777;
		
//		System.out.println("Value of z "+z);
		
//		System.out.println("Value of x "+x);
		
//		InstanceAndStaticVariableDemo obj = new InstanceAndStaticVariableDemo();
		
		
		InstanceAndStaticVariableDemo obj2 = new InstanceAndStaticVariableDemo();
		
		
		System.out.println("value of z "+z);
		System.out.println("value of z "+obj2.z);
		System.out.println("value of z "+InstanceAndStaticVariableDemo.z);
		
		
		System.out.println("Value of x "+obj2.x);
		
		obj2.x=900;
		
		System.out.println("Value of x "+obj2.x);
		
		System.out.println("Value of y "+obj2.y);
		
		obj2.y=800;
		
		System.out.println("Value of y "+obj2.y);
		
		obj2.z=987;
		System.out.println("value of z "+obj2.z);
		
		
		InstanceAndStaticVariableDemo obj3 = new InstanceAndStaticVariableDemo();
		
		System.out.println("...........................");
		System.out.println("Value of x "+obj3.x);
		System.out.println("Value of y "+obj3.y);
		System.out.println("value of z "+obj3.z);
		
		obj3.x=400;
		obj3.y=500;
		obj3.z=888;
		
		System.out.println("Value of x "+obj3.x);
		System.out.println("Value of y "+obj3.y);
		System.out.println("...........................");
		System.out.println("Value of x "+obj2.x);
		System.out.println("Value of y "+obj2.y);
		System.out.println("...........................");
		System.out.println("value of z "+obj3.z);
		System.out.println("value of z "+obj2.z);
		System.out.println("value of z "+z);
		System.out.println("value of z "+InstanceAndStaticVariableDemo.z);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
