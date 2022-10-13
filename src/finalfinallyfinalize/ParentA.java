package finalfinallyfinalize;

public class ParentA {

	int x = 100;

	
	
	public final void display() {

		System.out.println("Value of x " + x);
	}

	
	public final void display(int x) {

		System.out.println("Value of x " + x);
	}

	
	public final void display(char abc) {

		System.out.println("Value of x " + x);
	}

	public final void show() {

		System.out.println("show method of parent class " );
	}

	
		public static void test(){
			System.out.println("inside test method");
		}
}
