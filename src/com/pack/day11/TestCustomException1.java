package com.pack.day11;

public class TestCustomException1 {

	public static void main(String[] args) {

		int age = 40;

		if (age > 80) {

			try {
				// throw new InvalidDataException();

				throw new InvalidDataException("check your age if it is valid.." + age);

			} catch (InvalidDataException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("you are eligible for insurance");
		}

		System.out.println("end of proram....");

	}

}
