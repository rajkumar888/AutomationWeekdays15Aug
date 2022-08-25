package com.pack.day9;




public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//		String str = "Hello world";		// string literals  - will be created in String Constant Pool 
//		String str1 = new String("Test");		// this is normal way of creating object
//												// two objects will be created
//												// one in SCP
//												// one in heap memory
//		
//		String str2 = new String("Test");				// -this will not create a new object in scp
//														// this will create a new oject in heap memory
//		
//		
//		System.out.println(str2.toLowerCase());
//		
//		System.out.println(str2);
//		
//		
//		System.out.println(str1 == str2);
//		
//		System.out.println(str1.equals(str2));
//		
//		System.out.println(str1.equalsIgnoreCase(str2));
//		
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
//		
//		System.out.println(str2);
//		
//		
//		
//		char[] ch = { 'H','e','l','l','o' };
//		
//		System.out.println(ch);
//		
//		String str777 = new String(ch);
//		System.out.println(str777);
		
//		StringDemo obj1 = new StringDemo();
//		
//		System.out.println(obj1);
//		System.out.println(obj1.toString());
		
		
		
		
		
	
//		
		
//		int x=10;
//		int y=10;
//		System.out.println(x==y);
		
		
		String str555 = "Hello";
		String str666 = "Hello";
		
		System.out.println(str555 == str666);
		
//		System.out.println(str555.hashCode());
//		System.out.println(str666.hashCode());
		System.out.println("...................");
		
		String str888 = new String("World");
		String str999 = new String("World");
		
		System.out.println(str888 == str999);
		
		System.out.println(str888.intern() == str999.intern());
		
		
		System.out.println(str888.equals(str999));
		

	}

}
