package com.pack.day7;

public class BankOfAmerica implements BankInterface{
	
	final float roi=10.5f;
	
	
	@Override
	public float getInterest() {
		// TODO Auto-generated method stub
		
		System.out.println("inside of BankOfAmerica");
		
		return roi;
	}

}
