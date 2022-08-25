package arraysdemo;

import java.util.Arrays;

public class SumAndAverageofArray {

	public static void main(String[] args) {

		double[] arr = { 33333.0, 20.0, 12.0, 13.0, 14.0, 18.0, 1.5 };

		double sum = 0.0;

		double min = arr[0];
		double max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			// sum=sum+arr[i];
			sum += arr[i];

			if (arr[i] > max) {
				max = arr[i];
			}

			if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println("Value of sum " + sum);
		System.out.println("Total no of values " + arr.length);
		System.out.println("Value of Average " + (sum / arr.length));
		System.out.println("minimum value " + min);
		System.out.println("maximum value " + max);

		// Arrays.sort(arr);
		//
		// System.out.println("Minmum value "+arr[0]);
		// System.out.println("Maximum value "+arr[arr.length-1]);
		//
		// for( double a:arr){
		// System.out.print(a+" ");
		// }
	}

}
