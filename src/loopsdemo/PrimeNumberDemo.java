package loopsdemo;

public class PrimeNumberDemo {

	public static void main(String[] args) {
		
		int x=97;
		
		boolean prime=true;
		
		
		for(int i=2; i<=(x/2); i++){
			if((x%i)==0){
				prime=false;
				break;
			}
		}
		
		if(prime){
			System.out.println("Number is Prime "+x);
		}else{
			System.out.println("Number is not Prime "+x);
		}

		
//		 int x1=200;
//		
//		System.out.println(x1);
//		
//		x1=99;
		
	}

}
