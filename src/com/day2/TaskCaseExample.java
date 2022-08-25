package com.day2;

public class TaskCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String itemA = "Item A";
		String itemB = "Item B";
		String itemC = "Item C";
		
		int PriceA = 200;
		int PriceB = 80;
		int PriceC = 150;
		
		int qA=3;
		int qB=5;
		int qC=2;
		
		double discount = 0.15;
		double servicetax = 0.02;
		
		double bill = (PriceA*qA) +(PriceB*qB) + (PriceC*qC);
		
		double finalAmount = bill -(bill*discount)+(bill*servicetax) ;
		
		System.out.println("Final Amount "+ finalAmount);
		
		
		

	}

}
