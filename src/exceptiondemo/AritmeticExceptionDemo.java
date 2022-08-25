package exceptiondemo;

import java.util.Date;

public class AritmeticExceptionDemo {

	public static void main(String[] args) {
		
		System.out.println("Started at "+new Date());
		
		int x=100;
		int y=0;
		
		try {
			System.out.println(x/y);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		// array index out of bounds exception
		
		
		int[] arr={10,50, 12, 15};
		
		System.out.println(arr[0]);
		
		
		try {
			System.out.println(arr[5]);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally{
			System.out.println("inside the finally block ");
		}
		
		
		System.out.println("Ended at "+new Date());
		
	}

}
