package day2.rangedemo;

public class RelationalOperatorsDemo {
	
	
	
	public static void main(String[] args) {
		
		
		int x=15;
		
		int y=15;
		
		
		System.out.println("value of x "+x);
		System.out.println("value of y "+y);
		
		
		System.out.println(x<y);
		System.out.println(x>y);
//		
//		
		System.out.println(x <= y);
		System.out.println(x >= y);
////		
		System.out.println(20 >= 21);
////		
		System.out.println(10==10);
		System.out.println(10==11);
		System.out.println("Hello"=="Hello");
////		
		RelationalOperatorsDemo obj1 = new RelationalOperatorsDemo();
		RelationalOperatorsDemo obj2 = new RelationalOperatorsDemo();
////		
		System.out.println(obj1==obj2);
////		
		RelationalOperatorsDemo obj3 = obj1;
////		
		System.out.println(obj1==obj1);
		System.out.println(obj1==obj3);
////		
		System.out.println(10!=11);
		System.out.println(10!=10);
////		
		System.out.println(!(obj1==obj3));
	}

}
