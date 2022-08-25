package com.pack.day7;

public class PrimeNumberDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=11;
		
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

	}

}
