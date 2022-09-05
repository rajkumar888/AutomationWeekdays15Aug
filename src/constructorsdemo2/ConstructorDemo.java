package constructorsdemo2;

public class ConstructorDemo {

	int x;
	int y;

//	// this() or super() - for current class constructor or parent class
//	// constructor
//
	// parameterized constructor
	public ConstructorDemo(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("inside parameterized constructor");
	}

	 public ConstructorDemo(int y) {
//	 this.x = 500;
	 this.y = y;
	 System.out.println("inside single parameterized constructor");
	 }

	// default constructor
	public ConstructorDemo() {
		this.x = 100;
		this.y = 110;
		System.out.println("inside default constructor");
	}

	public void show() {
		System.out.println(".....................");
		System.out.println("Value of x " + x);
		System.out.println("Value of y " + y);
		System.out.println(".....................");
	}

	static {
		System.out.println("...static block.................");
	}

	{
		x=1000;
		System.out.println("...non static block.................");
	}

	public static void main(String[] args) {

		ConstructorDemo obj = new ConstructorDemo();

		obj.show();
		


		 ConstructorDemo obj1 = new ConstructorDemo();
		
		 obj1.show();
		//
		ConstructorDemo obj2 = new ConstructorDemo(200, 300);
		//
		obj2.show();
//
//		//
		 ConstructorDemo obj3 = new ConstructorDemo(3000);
		
		 obj3.show();

	}

}
