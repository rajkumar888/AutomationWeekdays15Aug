package arraysdemo;

import java.util.Arrays;

public class ArrayDemoImp2 {

	public static void main(String[] args) {

		int[] values = new int[5];

		for (int v : values) {
			System.out.println(v);
		}

		values[0] = 15;
		values[1] = 25;
		values[2] = 16;
		values[3] = 18;
		values[4] = 66;
//		values[5] = 55;  // invalid
		System.out.println("........................");
		
		for (int v : values) {
			System.out.println(v);
		}
		System.out.println("........................");
		Arrays.sort(values);
		
		for (int v : values) {
			System.out.println(v);
		}
		
		System.out.println("end of program....");
	}

}
