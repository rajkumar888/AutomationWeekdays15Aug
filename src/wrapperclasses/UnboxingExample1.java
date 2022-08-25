package wrapperclasses;

public class UnboxingExample1 {
	
	public static void myMethod(int num) {
		System.out.println(num);
	}

	public static void main(String args[]) {

		Integer i = new Integer(50);
		int a = (Integer) i;

		System.out.println(a);

		Integer intObject = new Integer(100);
		
		
		myMethod(intObject);
	}

}