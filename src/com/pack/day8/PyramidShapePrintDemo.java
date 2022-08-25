package com.pack.day8;

public class PyramidShapePrintDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch='A';
		
			for(int row=1; row<=20; row++){
				
				int max=20-row;
				
				for(int space=max; space>0; space--){
					System.out.print(" ");
				}
				
				for(int col=1; col<=row; col++){
					System.out.print(ch+" ");
				}
				System.out.println();
			}
		
		
		
		
		

	}

}
