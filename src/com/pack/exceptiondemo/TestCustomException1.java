package com.pack.exceptiondemo;

public class TestCustomException1 {
	
	public static void main(String args[]) {
	
		int age = 14;

		try {
			if (age < 18) {

//				throw new InvalidAgeException("age is not valid to vote");
				
//				throw new InvalidAgeException();
				
				throw new InvalidAgeException(age);

			} else {
				System.out.println("eligible to vote");
			}
			
		} catch (InvalidAgeException ex) {
			System.out.println("Caught the exception");
			System.out.println("Exception occured: " + ex);
		}

		System.out.println("end of program...");
	}
}