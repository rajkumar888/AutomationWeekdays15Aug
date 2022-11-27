package javaday1;

public class DemoInstanceVariable {

	public int var1 = 500; // instance variables

	public String name = "Hello"; // instance variables
	
	public static int var2=5000;
	
	
	
	
	
	
	

	public static void main(String[] args) {

		DemoInstanceVariable obj = new DemoInstanceVariable();

		// instantiation

		System.out.println(obj.var1);

		System.out.println(obj.name);
		
		
//		System.out.println(obj.var2);
//		System.out.println(var2);
		System.out.println(DemoInstanceVariable.var2);
		
		System.out.println(".........................");
		
		DemoInstanceVariable obj1 = new DemoInstanceVariable();
		var2=6000;
		System.out.println(obj1.var1);

		System.out.println(obj1.name);
		System.out.println(DemoInstanceVariable.var2);
		System.out.println(obj1.var2);
		
		obj.var1=1000;
		
		obj1.var1=2000;
		System.out.println(".........................");
		
		System.out.println(obj.var1);
		System.out.println(obj1.var1);
		
		DemoInstanceVariable obj2 = new DemoInstanceVariable();
		System.out.println(".........................");
		System.out.println(obj2.var1);

		System.out.println(obj2.name);
		
		
		System.out.println(".........................");
		System.out.println(new DemoInstanceVariable().var1);
		
		// anonymous object
		
	}

}
