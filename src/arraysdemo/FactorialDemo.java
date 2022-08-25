package arraysdemo;

public class FactorialDemo {

	public static void main(String[] args) {

		int x = 5;

		// 120

		int factorial = 1;

		for (int i = 1; i <= x; i++) {

			factorial *= i;
		}

		System.out.println("Factorial of the given number " + x + " is " + factorial);
	}

}
