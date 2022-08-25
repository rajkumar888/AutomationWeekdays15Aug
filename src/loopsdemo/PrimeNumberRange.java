package loopsdemo;

public class PrimeNumberRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//		int end=99;
		
		for(int start=2; start<=100; start++ ){
			
			boolean prime=true;
			
			for(int i=2; i<=(start/2) ; i++){
				
				if((start%i)==0){
					prime=false;
					break;
				}
			}// inner for loop
			
			if(prime){
				System.out.print(start+" ");
			}
			
		} // outer for loop
		

	}

}
