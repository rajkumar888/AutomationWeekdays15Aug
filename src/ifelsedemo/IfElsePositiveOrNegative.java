package ifelsedemo;

import java.util.Scanner;

public class IfElsePositiveOrNegative {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter any number \n");

		int number = scan.nextInt();

		if (number >= 0) {
			System.out.println("Positive................");
		} else {
			System.out.println("Negative..................");
		}

		System.out.println("End of the program.....");
	}

}
