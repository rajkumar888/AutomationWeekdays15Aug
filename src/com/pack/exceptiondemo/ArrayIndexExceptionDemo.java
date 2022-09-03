package com.pack.exceptiondemo;

import java.io.FileNotFoundException;

public class ArrayIndexExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = new int[5];
		
		arr[0]=100;
		arr[1]=10;
		arr[2]=50;
		arr[3]=80;
		arr[4]=70;
		
		try{
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
//		System.exit(0);
//		System.out.println(arr[5]);
		}
		catch(ArithmeticException e){
			System.out.println(e);
			System.out.println("catch block is executed ");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
			System.out.println("catch block is executed ");
		}
		catch(IndexOutOfBoundsException e){
			System.out.println(e);
			System.out.println("catch block is executed ");
		}
		
		catch(Exception e){
			System.out.println(e);
			System.out.println("catch block is executed ");
		}
		
		
		finally {
			System.out.println("Finally block is executed ");
		}

		
		System.out.println("End of program......");

	}

}
