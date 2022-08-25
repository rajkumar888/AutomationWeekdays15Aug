package com.day1;

public class HelloWorld2 {

	
	int x=20;
	
	void display(){
		
		System.out.println("value of x "+x);
	}
	
	
	static int a=100;
	
	
	 public static void main(String[] args ) {
		 
		 
		 
		 System.out.println(a);
		 
//		 System.out.println("Hello world testing "+ new Date() );
		

		 HelloWorld2 obj  =  new HelloWorld2();
		 
		 obj.display();
		 
		 System.out.println(obj.x);
		 System.out.println();
		 
		 
		 
		 int xyz=2000;
		 
		 int pqr=5000;
		 
		 System.out.println("value of xyz "+xyz);
		 
		 System.out.println("value of pqr "+pqr);
		 
		 System.out.println("sum of xyz "+(xyz+pqr));
		 
		 System.out.println("diff of xyz "+(xyz-pqr));
		 
		 System.out.println("product of xyz "+(xyz*pqr));
		 
		 System.out.println("div of xyz "+(xyz/pqr));
		 
		 System.out.println("mod of xyz "+(pqr%xyz));
		 
		 
		 
	}
	
	
	

}
