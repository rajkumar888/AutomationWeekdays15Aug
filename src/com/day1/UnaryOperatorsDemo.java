package com.day1;

public class UnaryOperatorsDemo {
	
	
	
	public static void main(String[] args) {
		
		
		int x=11;
		
		System.out.println("value of x "+x);
		
		
//		System.out.println(++x);
		
//		System.out.println(x++);
//		
//		System.out.println("value of x "+x);
		
//		int value = x + (++x) + (++x) + x;
//		
//		System.out.println(value);
		
//		int postfixdemo = x + (x++) + (x++) + x;
//		
//		System.out.println(postfixdemo);
		
		
//		int minusprefix = x + (--x) + (--x) + x;
		
//		System.out.println("value of minusprefix "+minusprefix);
		
		
			int minuspostfix = x + (x--) + (x--) + x;
		
		System.out.println("value of minuspostfix "+minuspostfix);
		
		boolean flag = true;
		
		System.out.println(!flag);
		
	}

}
