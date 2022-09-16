package loopsdemo;

public class Print1To100 {

	public static void main(String[] args) {

//		 for(int i=1; i<=100 ; i++){
//		
////		 System.out.print((101-i)+" ");
//			 
//			 System.out.print(i+" ");
//		 }

		for (int i = 1; i <= 11; i++) {

			for (int j = 1; j <= 8; j++) {
				
				System.out.print((i * j) + " ");
				
			} // inner for loop

			System.out.println();
		} // outer for loop

	}

}

	
//	if(i==5){
//		continue;
//	}
	
//	if(i==7){
//		break;
//	}

//if(j==6){
//	break;
//}