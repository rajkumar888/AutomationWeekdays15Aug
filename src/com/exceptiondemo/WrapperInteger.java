package com.exceptiondemo;

public class WrapperInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Integer xyz = new Integer(200);
		
		Integer pqr = xyz;
		
		
		Integer obj = new Integer(300);
		
		System.out.println(obj);
		System.out.println(xyz);
		
		pqr=obj;
		obj=xyz;
		xyz=pqr;
		
		System.out.println(obj);
		System.out.println(xyz);
		
		Exception e = new Exception();
		
		
		
		
		
	}

}
