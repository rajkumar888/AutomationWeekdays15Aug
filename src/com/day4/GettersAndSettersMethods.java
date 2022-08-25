package com.day4;

public class GettersAndSettersMethods {

	int x;

	double d;

	String s;

	char ch;
	
	
	
	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public double getD() {
		return d;
	}

	public void setD(double d) {
		this.d = d;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public char getCh() {
		return ch;
	}

	public void setCh(char ch) {
		this.ch = ch;
	}

	public static void main(String[] args) {

		GettersAndSettersMethods obj = new GettersAndSettersMethods();

		System.out.println(obj.getX());

		obj.setX(100);

		System.out.println(obj.getX());

		System.out.println("==================");

		System.out.println(obj.getD());

		obj.setD(25.25);

		System.out.println(obj.getD());

		System.out.println("==================");

		System.out.println(obj.getS());

		obj.setS("Hello world");

		System.out.println(obj.getS());

		System.out.println("==================");

		System.out.println(obj.getCh());

		obj.setCh('A');

		System.out.println(obj.getCh());
	}

}
