package com.pack.day11;

public class InvalidDataException extends Exception {
	
	
	public InvalidDataException(String str) {
		super(str);
	}

	public InvalidDataException() {
		System.out.println("Default constructor invoked for InvalidDataException class");
	}
}