package methodOverriding2;

import methodOverriding2.ConstructorOverLoadingDemo;

public class ConsOverImple {

	public static void main(String[] args) {

		
		ConstructorOverLoadingDemo obj1 = new ConstructorOverLoadingDemo();
		
		ConstructorOverLoadingDemo obj2 = new ConstructorOverLoadingDemo('A');
		
		ConstructorOverLoadingDemo obj3 = new ConstructorOverLoadingDemo(10);
		
		ConstructorOverLoadingDemo obj4 = new ConstructorOverLoadingDemo(10,'A');
		
		ConstructorOverLoadingDemo obj5 = new ConstructorOverLoadingDemo('B',10);
		
		ConstructorOverLoadingDemo obj6 = new ConstructorOverLoadingDemo(10,'C',"Test");
		
		ConstructorOverLoadingDemo obj7 = new ConstructorOverLoadingDemo(obj2);
		
		
		
	}

}
