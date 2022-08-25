package arraysdemo;

public class TwoDimArrayIntDemo {

	public static void main(String[] args) {

		int[][] table = { 	
							{ 10, 50, 65, 32,11,22,33,44 }, 
							{ 20, 33, 76 }, 
							{ 40, 44, 45, 89 } , 
							{ 33, 455, 11, 84,66,89 } 
						};
		
		
//		table[2][2]=6666;

//		 System.out.println(table.length);
//		 System.out.println(table[3].length);

		for (int row = 0; row < table.length; row++) {

			for (int col = 0; col < table[row].length; col++) {

				System.out.print(table[row][col] + " ");
			}
			System.out.println();

		}
	}

}
