package arraysdemo;

public class ThreeDimArrayDemo {

	public static void main(String[] args) {

		int[][][] arr = { 
							{
								{1, 2,6,4444,12,34}, 
								{3, 4,8,6,55}
							},
				
						{
								{5, 555666,8,8}, 
								{7, 8,9,9,78}
						},
						
						{
							{44, 34,84,345}, 
							{11, 82,29,49,748}
					}
						};   
		
//		System.out.println(arr[0][1][4]);
//		System.out.println(arr[1][0][1]);
//		System.out.println(arr[2][1][4]);
		
//		System.out.println(arr[0][0][2]);
//		System.out.println(arr[1][1][0]);
	
		for(int t=0; t<arr.length; t++){
			
			for(int r=0; r<arr[t].length; r++){
				
				for(int c=0; c<arr[t][r].length;c++){
					
					System.out.print(arr[t][r][c]+" ");
				}
				System.out.println();
			}
			System.out.println(".....................");
		}
		
		
	}

}
