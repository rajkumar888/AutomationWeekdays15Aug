package labExercise;

public class LargestNumberExample {
	public static void main(String args[]) {
		int x = 6988;
		int y = 89777;
		int z = 799;
		
		
		int largestNumber = (x > y) ? (x > z ? x : z) : (y > z ? y : z);
		System.out.println("The largest numbers is:  " + largestNumber);
	}
}