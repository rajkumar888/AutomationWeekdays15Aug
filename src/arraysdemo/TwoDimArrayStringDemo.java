package arraysdemo;

import java.util.Arrays;

public class TwoDimArrayStringDemo {

	public static void main(String[] args) {

		String[][] table = { 
							{ "r1c1", "r1c2", "r1c3", "r1c4" }, 
							{ "r2c1", "r2c2", "r2c3", "r2c4" }, 
							{ "r3c1", "r3c2", "r3c3", "r3c4" } 
						};

		
		String[][] table1 = { 
				{ "r1c1", "r1c2", "r1c3", "r1c4" }, 
				{ "r2c1", "r2c2", "r2c3", "r2c4" }, 
				{ "r3c1", "r3c2", "r3c3", "r3c4" } 
			};
		
		
		System.out.println(Arrays.equals(table, table1));
		System.out.println(Arrays.deepEquals(table, table1));
		
		
//		for (int row = 0; row < table.length; row++) {
//
//			for (int col = 0; col < table[row].length; col++) {
//
//				System.out.print(table[row][col] + " ");
//			}
//			System.out.println();
//		}
	}

}
