package methodOverloading;

public class MethodOverLoadingDemo {

	int x;

	public void show() {
		System.out.println(" no parameter method");
	}

	public void show(int x) {
		System.out.println(" Value of integer x " + x);
	}

	private char show(char x) {
		System.out.println(" Value of char ch " + x);
		return x;
	}

	
}
