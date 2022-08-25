package com.day2;

import com.day3.MethodParmerization;

public class ParmetrizationMethodImple {

	public static void main(String[] args) {
		
		MethodParmerization obj = new MethodParmerization();
		obj.show();
		obj.initialize(100, 200);
		obj.show();
		obj.init(1000, 2200);
		obj.show();
		System.out.println(obj.sum());
		
		obj.show();
		System.out.println("value of add "+obj.add(50, 20));
		obj.show();
		
		System.out.println("value of diff "+obj.diff(200, 50));
		obj.show();
		
		System.out.println("value of product "+obj.product(100, 31));
		obj.show();
		
		System.out.println("value of div "+obj.div(100, 15));
		obj.show();
		
		System.out.println("value of mod "+obj.mod(99, 15));
		obj.show();

	}

}
