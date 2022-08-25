package com.day2;

public class DataMembersAndMethods {

	int x;
	int y;
	int result;

	public int getX() {
		return x;
	}

	public void setX(int localx) {
		this.x = localx;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public static void main(String[] args) {

		
		DataMembersAndMethods obj = new DataMembersAndMethods();
		
		
		System.out.println(obj.getX());
		System.out.println(obj.getY());
		System.out.println(obj.getResult());
		
		obj.setX(100);
		obj.setY(200);
		obj.setResult(obj.getX()+obj.getY());
//		obj.setResult(obj.x+obj.y);
		
		System.out.println(obj.getX());
		System.out.println(obj.getY());
		System.out.println(obj.getResult());
		
	}

}
