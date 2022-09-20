package loopsdemo;

public class PrimeNumberRange {

	public static void main(String[] args) {
		
		int st=2;
		int end=50;

		for (int start = st; start <= end; start++) {

			boolean prime = true;

			for (int i = 2; i <= (start / 2); i++) {

				if ((start % i) == 0) {
					prime = false;
					break;
				}
			} // inner for loop

			if (prime) {
				System.out.print(start + " ");
			}

		} // outer for loop

	}

}
