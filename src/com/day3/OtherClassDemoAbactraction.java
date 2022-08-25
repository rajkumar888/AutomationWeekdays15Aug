package com.day3;

public class OtherClassDemoAbactraction extends AbstractClassDemoParent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void abstractmethod1() {
		
		System.out.println("abstractmethod1 is called....");
	}

	@Override
	public void abstractmethod2() {
		System.out.println("abstractmethod2 is called....");
		
	}
	
	
	public void testcurrentclassmethod(){
		System.out.println("testcurrentclassmethod is called....");
	}

	@Override
	public void abstractmethod3() {
		System.out.println("abstractmethod2 is called....");
		
	}

	@Override
	protected void test(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
