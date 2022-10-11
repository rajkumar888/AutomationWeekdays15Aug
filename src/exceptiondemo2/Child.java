package exceptiondemo2;


import java.io.EOFException;
import java.io.IOException;

public class Child extends Parent{
	
		public void m1() throws ArithmeticException,NullPointerException{
		
		System.out.println("inside parent m1");
	}
}
