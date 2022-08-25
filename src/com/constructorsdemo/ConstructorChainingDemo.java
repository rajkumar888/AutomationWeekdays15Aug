
package com.constructorsdemo;

public class ConstructorChainingDemo {

	int x;
	int y;

	 public ConstructorChainingDemo() {
		x = 100;
		y = 200;
		System.out.println("Default cosntructor");
		
	}

	 public ConstructorChainingDemo(int x, int y) {
		// hi test
		 this();
//		 super();
		 this.x = x;
		this.y = y;
		System.out.println("two parmeter cosntructor");
	}

	// copy constructor
	public ConstructorChainingDemo(ConstructorChainingDemo obj) {
		this.x = obj.x;
		this.y = obj.y;	
		System.out.println("copy cosntructor");
	}

	public void show(){
		System.out.println("........................");
		System.out.println("Value of x "+x);
		System.out.println("Value of y "+y);
	}
	
	public static void main(String[] args) {

//		ConstructorChainingDemo obj1 = new ConstructorChainingDemo();
//		
//		obj1.show();
//		
		ConstructorChainingDemo obj2 = new ConstructorChainingDemo(50,70);
//		obj2.show();
		
		
//		ConstructorChainingDemo obj3 = new ConstructorChainingDemo(obj1);
//		
//		obj3.show();
		
		
		
		
	}

}
