package protectedDemo;

import packA.ClassA;

public class ChilldOfClassA extends ClassA{
	
	
	void display(){
//		System.out.println(privateA);
//		System.out.println(defaultA);
		System.out.println(protectedA);
		System.out.println(publicA);
	}
	
	
	
	public static void main(String[] args) {
		ChilldOfClassA obj = new ChilldOfClassA();
		
		
	}

}
