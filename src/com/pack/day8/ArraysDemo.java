package com.pack.day8;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
//		int[] arr = new int[5];		// creation of array
//		arr[0]=90;
//		arr[1]=100;
//		arr[2]=80;
//		arr[3]=177;
//		arr[4]=89;
		
		int[] arr1 = {44,55,22,88,56,89,76};
		
		for(int i=0; i<arr1.length ; i++){
			
			System.out.print(arr1[i]+" ");
		}
		
		Arrays.sort(arr1);
		System.out.println("....................");
		
		for(int i=0; i<arr1.length ; i++){
			
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println("....................");
		
		for(int i=arr1.length-1; i>=0 ; i--){
			System.out.print(arr1[i]+" ");
		}
		
		int sum=0;
		
		
		for(int i=0; i<arr1.length ; i++){
			sum+=arr1[i];		// sum= sum+arr1[i];
		}
		System.out.println("....................");
		float average =((float) sum/arr1.length);
		System.out.println(sum);
		System.out.println(average);
		
	}

}
