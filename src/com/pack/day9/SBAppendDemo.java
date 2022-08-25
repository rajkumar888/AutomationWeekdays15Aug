package com.pack.day9;

public class SBAppendDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StringBuffer sb = new StringBuffer("Testing");
		
		System.out.println(sb);
		
		sb.append(" World");
		
		System.out.println(sb);
		
		System.out.println("....................");
		
		StringBuilder sblder = new StringBuilder("Testing sblder");
		
		System.out.println(sblder);
		
		sblder.append(" World 123");
		
		System.out.println(sblder);
		
	}

}
