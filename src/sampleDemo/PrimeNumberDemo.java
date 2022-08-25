package sampleDemo;

public class PrimeNumberDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int test = 17;

		boolean prime = true;

		int start = 2;
		int end = test / 2;

		while (start++ <= end) {
			if ((test % start) == 0) {
				prime = false;
				break;
			}
			
//			start=start+1; 		// start++
		}

		if (prime == true) {
			System.out.println("Prime Number " + test);
		} else {
			System.out.println("Not a Prime Number " + test);
		}

	}

}
