package com.day4;

public class ProductClassImpl {

	
	
	public static void main(String[] args) {
		
		ProductClassDemo obj = new ProductClassDemo();
		
		
		System.out.println(obj.getItemno());
		System.out.println(obj.getItemname());
		System.out.println(obj.getPrice());
		
		System.out.println("...............................");
		ProductClassDemo obj1 = new ProductClassDemo("item_5001", "Computer",5000);
		ProductClassDemo obj2 = new ProductClassDemo(5000,"item_5001", "Computer");


		System.out.println(obj1.getItemno());
		System.out.println(obj1.getItemname());
		System.out.println(obj1.getPrice());
		System.out.println("...............................");
		
		obj1.setPrice(11000);
		obj1.setItemno("item_4555");
		obj1.setItemname("Laptop");
		
		System.out.println(obj1.getItemno());
		System.out.println(obj1.getItemname());
		System.out.println(obj1.getPrice());
		System.out.println("...............................");
		
		
	}

}
