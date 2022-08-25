package com.pack.day11;



public class PalindromeDemo {

	public static void main(String[] args) {
		
		
		String str = "3333";
		
		boolean palindrome=true;
		
		
		
		
//		for(int left=0,right=str.length()-1 ; left<str.length()/2 ; left++,right--){
//			
//			if( str.charAt(left)!= str.charAt(right)){
//				palindrome=false;
//				break;
//			}
//			
//		}
		
		
		
		
		
		for(int start=0, end=str.length()-1; start<end ; start++,end--){
			
			if( str.charAt(start)!=str.charAt(end)){
				palindrome=false;
				break;
			}
		}
		
		
		
		if(palindrome){
			System.out.println("Given string is a palindrome "+str);
		}else{
			System.out.println("Given string is a not a palindrome "+str);
		}

			
			
	}

}
