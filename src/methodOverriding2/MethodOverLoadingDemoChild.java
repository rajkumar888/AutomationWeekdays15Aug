package methodOverriding2;

public class MethodOverLoadingDemoChild extends MethodOverLoadingDemo{

	int x;

	void show(boolean x) {
		System.out.println(" Value of boolean val " + x);
	}

	static protected void show(float x) {
		System.out.println(" Value of float f1 " + x);
	}

	static public void show(String x) {
		System.out.println(" Value of String name " + x);
	}

	final public void show(double x) {
		System.out.println(" Value of double d1 " + x);
	}

	final public void show(double x, int y) {
		System.out.println(" Value of double d1 " + x + " " + y);
	}

	public void show(MethodOverLoadingDemoChild obj) {

		System.out.println(" Value of MethodOverLoadingDemo obj " + obj.x);
	}
}
