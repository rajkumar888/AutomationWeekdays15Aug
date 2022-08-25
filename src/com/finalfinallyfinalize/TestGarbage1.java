package com.finalfinallyfinalize;

public class TestGarbage1 {
	
	
	TestGarbage1(){
		System.out.println("OBJECT IS CREATED.........");
	}
	
	public void finalize() {
		System.out.println("object is garbage collected");
	}

	public static void main(String args[]) {
		
		TestGarbage1 s1 = new TestGarbage1();
		TestGarbage1 s2 = new TestGarbage1();
		
		s2 = null;
		
		System.gc();
	}
}