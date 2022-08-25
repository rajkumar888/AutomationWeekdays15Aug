package com.pack.day11;

public class FinalizeDemo {
	
	
	public FinalizeDemo(){
		System.out.println("FinalizeDemo Consturctor is invoked....");
	}
	
	protected void finalize() throws Throwable { 
		System.out.println("finalize method from  FinalizeDemo class is invoked....");
	}
	

	public static void main(String[] args) {
	

		FinalizeDemo obj = new FinalizeDemo();
		
		FinalizeDemo obj1 = new FinalizeDemo();
		
		new FinalizeDemo(); 
		
		new FinalizeDemo();
		
		new FinalizeDemo();
		new FinalizeDemo();
		System.out.println(".........................");
		
//		System.gc();
		
		 Runtime.getRuntime().gc();
		
		
	}

}
