package constructorsdemo2;

public class ConstructorAndMethodSameNameDemo {

	// default constructor
	public ConstructorAndMethodSameNameDemo() {
		System.out.println("Default constructor called.");
	}
	
	
	
	
	// parameterized constructor
	public ConstructorAndMethodSameNameDemo(String str) {
		System.out.println("Parameterized constructor called "+str);
	}

	// parameterized constructor
		public ConstructorAndMethodSameNameDemo(int x) {
			System.out.println("integer Parameterized constructor called "+x);
		}
		
		
		public void ConstructorAndMethodSameNameDemo(){
			System.out.println("method is called ");
		}
	
	
	// main method
	public static void main(String args[]) {
		// initializes the instance of example class
		ConstructorAndMethodSameNameDemo cc = new ConstructorAndMethodSameNameDemo();
		cc.ConstructorAndMethodSameNameDemo();
		cc.ConstructorAndMethodSameNameDemo();
		cc.ConstructorAndMethodSameNameDemo();
		cc.ConstructorAndMethodSameNameDemo();
		cc.ConstructorAndMethodSameNameDemo();
		cc.ConstructorAndMethodSameNameDemo();
		cc.ConstructorAndMethodSameNameDemo();
		
	}

}
