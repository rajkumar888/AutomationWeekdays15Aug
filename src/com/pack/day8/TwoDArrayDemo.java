package com.pack.day8;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[][] arr = { 
				{"test1",	"hello1",	"excel1",	"data1",	"mobile1"},
				{"test2",	"hello2",	"excel2",	"data2",	"mobile2"},
				{"test3",	"hello3",	"excel3",	"data3",	"mobile3"},
				{"test4",	"hello4",	"excel4",	"data4",	"mobile4"},
				{"test5",	"hello5"},
				{"test6",	"hello6",	"excel6"},
		};
		
		
			for(int row=0; row<arr.length ; row++ ){

				for(int col=0 ; col< arr[row].length ; col++){
					
					System.out.print(arr[row][col]+" ");
					
				}
				System.out.println();
				
			}
			
			
			
	}

}
