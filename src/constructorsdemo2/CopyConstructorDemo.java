package constructorsdemo2;

public class CopyConstructorDemo {

	int x;
	int y;

	 public CopyConstructorDemo() {
		x = 100;
		y = 200;
		System.out.println("Default cosntructor");
	}
	 
//	 // method same name as class allowed but not a good practice
//	 public void CopyConstructorDemo(){
//		 System.out.println("same name method as constructor");
//	 }

	 public CopyConstructorDemo(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("two parmeter cosntructor");
	}

	// copy constructor
	public CopyConstructorDemo(CopyConstructorDemo obj) {
		this.x = obj.x;
		this.y = obj.y;	
		System.out.println("copy cosntructor");
	}

	public void show(){
		System.out.println("........................");
		System.out.println("Value of x "+x);
		System.out.println("Value of y "+y);
	}
	
	public static void main(String[] args) {

		CopyConstructorDemo obj1 = new CopyConstructorDemo();
		CopyConstructorDemo obj2 = new CopyConstructorDemo(20,30);
		CopyConstructorDemo obj3 = new CopyConstructorDemo(obj1);
		CopyConstructorDemo obj4 = new CopyConstructorDemo(obj2);
		
		obj1.show();
		obj2.show();
		obj3.show();
		obj4.show();
		
		
//		// one object with multiple references
//		
//		CopyConstructorDemo obj5 = new CopyConstructorDemo();
//		
//		obj5.show();
//		
//		CopyConstructorDemo obj6 = obj5;
//		
//		obj6.show();
//		
//		CopyConstructorDemo obj7 = obj5;
//		obj7.show();
//		
//		
//		obj7.x=7777;
//		obj5.show();
//		obj6.show();
//		obj7.show();
//		
//		
//		System.out.println(obj1==obj2);
//		System.out.println(obj3==obj2);
//		System.out.println(obj3==obj1);
//		System.out.println(obj2==obj4);
//		System.out.println(obj5==obj4);
//		
//		System.out.println("..................");
//		
//		System.out.println(obj5==obj6);
//		System.out.println(obj5==obj7);
//		System.out.println(obj7==obj6);
	}

}
