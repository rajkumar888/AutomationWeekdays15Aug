package arraysdemo;

import java.util.Scanner;

public class FactorialWhileLoop {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter integer number for factorial : ");
		int x = in.nextInt();

		int factorial = 1;

		int i = x;

		while (i >= 1) {
			factorial *= i--;
		}

		System.out.println("Factorial of the given number " + x + " is " + factorial);
	}

}
