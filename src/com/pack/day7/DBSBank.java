package com.pack.day7;

public class DBSBank implements BankInterface{

	final float roi=9.5f;
	
	@Override
	public float getInterest() {
		// TODO Auto-generated method stub
		
		System.out.println("inside of DBSBank");
		
		return roi;
		
	}

}
