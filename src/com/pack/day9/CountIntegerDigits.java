package com.pack.day9;

public class CountIntegerDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int x=100;
		
		String str=x+"";
		
//		String str1=String.valueOf(x);
		
		int count=0;
		
		for (int i = str.length() - 1; i >= 0; i--) {

//			System.out.print(str.charAt(i));
			
			if(str.charAt(i)=='0'){
				count++;
			}
		}
		
		System.out.println("Count of 0 is "+count);
		
		
		int z= Integer.parseInt(str);
		
		z=z+100;
		
		System.out.println(z);
		
		
		

	}

}
