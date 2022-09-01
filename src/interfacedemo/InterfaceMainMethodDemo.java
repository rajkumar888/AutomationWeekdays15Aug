package interfacedemo;

public class InterfaceMainMethodDemo {
	
	
public static void main(String[] args) {
		
		
		
		System.out.println(DemoInterface111.x);
		System.out.println(DemoInterface111.str);
		DemoInterface111.method3();
		
		
		
		IntefaceDemoImpl obj = new IntefaceDemoImpl();
		obj.method1();
		obj.method2();
		
		
		IntefaceImpl obj1 = new IntefaceImpl();
		
		obj1.method1();
		obj1.method2();
		

	}

}
