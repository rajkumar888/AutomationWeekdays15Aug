package exceptiondemo;

import packA.ClassA;

public class NullPointerDemo {

	static ClassA obj2;
	
	
	public static void main(String[] args) {
		
		
		ClassA obj = new ClassA();
		System.out.println(obj.publicA);
		
		
		try {
			System.out.println(obj2.publicA);
		} 
		
		catch (Exception e) {
			e.printStackTrace();
//			System.out.println("exception has occured......");
		}
		
		System.out.println("End of the program........");
	}

}
