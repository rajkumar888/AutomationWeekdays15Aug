package ifelsedemo;

import java.util.Scanner;

public class DemoIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
		
		// Create a Scanner object
	    System.out.println("Enter your age ");

	     int age = scan.nextInt();
		
		
//		int age = 10;

		if (age >= 18) {
			System.out.println("You can vote");
		} else {
			System.out.println("You can't vote");
		}

	}

}
