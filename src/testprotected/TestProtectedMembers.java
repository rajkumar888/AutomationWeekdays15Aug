package testprotected;

import packA.ClassA;

public class TestProtectedMembers extends ClassA {

	public void display() {

		System.out.println(protectedA);

	}

	public static void main(String[] args) {

		// ClassA obj = new ClassA();

		TestProtectedMembers abc = new TestProtectedMembers();

		abc.protectedA = 100;

		System.out.println(abc.protectedA);

	}

}
