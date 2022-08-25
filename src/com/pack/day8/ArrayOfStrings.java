package com.pack.day8;

import java.util.Arrays;

public class ArrayOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String[] arr = { "auto","method","static","todo","arrayOfStrings"};
		
		
		
		for(String    s : arr){
			System.out.print(s+" ");
		}
		
		System.out.println(".......................");
		
		for(int i=0; i<arr.length ; i++){
			System.out.print(arr[i]+" ");
		}
		
		System.out.println(".......................");
		
		for(int i=arr.length-1 ; i>=0 ; i--){
			System.out.print(arr[i]+" ");
		}

		Arrays.sort(arr);
		System.out.println(".......................");
		
		for(int i=0; i<arr.length ; i++){
			System.out.print(arr[i]+" ");
		}
		
	}

}
