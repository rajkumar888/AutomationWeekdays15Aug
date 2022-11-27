package javaday1;

public class LoopPrinting {

	
	
	
	public static void main(String[] args) {
		
		
		int innerend=4;
		
		int number=1;
		for(int i=1;i<=4; i++){
			
			for(int j=1; j<=innerend;j++){
				
				System.out.print((number++)+" ");
				
			}
			innerend--;
			System.out.println("");
		}

	}

}
