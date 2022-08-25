package com.pack.day7;

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int[] arr = {10,55,33,22,66};
		
		
//		System.out.println(arr[2]);
		
		
		for(int  abc :arr){
			System.out.println(abc);
		}
		System.out.println("....................");
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}

		System.out.println("....................");
		
		for(int i=arr.length - 1; i>=0 ; i--){
			System.out.println(arr[i]);
		}
	}

}
