package loopsdemo;

public class TableOf1upto10 {

	public static void main(String[] args) {

		for (int range = 2; range <= 5; range++) {

			for (int i = 1; i <= 10; i++) {
				System.out.println(range + " X " + i + " = " + (range * i));
			}
			
			System.out.println("...............................");
		}

	}

}
