package loopsdemo;

public class Print1To100 {

	public static void main(String[] args) {

		// for(int i=1; i<=100 ; i++){
		//
		// System.out.print((101-i)+" ");
		// }

		for (int i = 1; i <= 10; i++) {

//			if(i==5){
//				continue;
//			}
			
//			if(i==7){
//				break;
//			}
			for (int j = 1; j <= 10; j++) {
				
				System.out.print((i * j) + " ");
				if(j==6){
					break;
				}
			} // inner for loop

			System.out.println();
		} // outer for loop

	}

}
