package arraysdemo;

public class ThreeDimensionalArray {
    public static void main(String[] args) {

        // create a 3d array
        int[][][] test = {
        		{
        			{1, -2, 3}, 
        			{2, 3, 4}
        			}, 
            { 
        				{-4, -5, 6, 9}, 
        				{1}, 
        				{2, 3}} 
        };

        // for..each loop to iterate through elements of 3d array
        
        for (int[][] row: test) {
            
        	for (int[] col: row) {
               
        		for(int item: col) {
                    System.out.print(item+" ");
                }
        		System.out.println();
            }
        	System.out.println(".....................");
        }
    }
}