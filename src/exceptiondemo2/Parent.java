package exceptiondemo2;

import java.io.IOException;

public class Parent {
	
	
	public void m1() throws IOException{
		
		System.out.println("inside parent m1");
		
		throw new RuntimeException();
	}
	
//public void m1() {
//		
//		System.out.println("inside parent m1");
//	}

}
