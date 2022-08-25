package com.pack.day7;

public class DemoIfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int marks=83;
		
		// marks >=90 - GRADE A
		// marks >=80 - GRADE B
		// marks >=70 - GRADE C
		// marks >=60 - GRADE D
		// Grade Fail
		
//		if(marks>=90){
//			System.out.println("Grade A");
//		}else if(marks>=80){
//			System.out.println("Grade B");
//		}else if(marks>=70){
//			System.out.println("Grade C");
//		}else if(marks>=60){
//			System.out.println("Grade D");
//		}else{
//			System.out.println("Grade Fail");
//		}
		
		if(marks>=90 && marks<=100){
			System.out.println("Grade A");
		} else if(marks>=80 && marks<90){
			System.out.println("Grade B");
		} else if(marks>=70 && marks<80){
			System.out.println("Grade C");
		} else if(marks>=60 && marks<70){
			System.out.println("Grade D");
		} else{
			System.out.println("Grade Fail");
		}
		
 
	}

}
