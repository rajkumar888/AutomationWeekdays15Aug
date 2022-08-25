package com.day2;

public class DataMembersAndCustomMethod {

	int x;
	
	
	public void displayX(){
		System.out.println("Value of x "+x);
	}
	
	public void initX(int localX){
		this.x = localX;
	}

	

	public static void main(String[] args) {

		
		
		DataMembersAndCustomMethod obj = new DataMembersAndCustomMethod();
		
		obj.displayX();
		
		obj.initX(100);
		
		obj.displayX();
		
	}

}
