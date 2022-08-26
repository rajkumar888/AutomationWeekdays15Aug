package packA;

public class ClassA {

	private int privateA;
	int defaultA;
	protected int protectedA;
	public int publicA;
	public int test;

	public void test() {
		System.out.println("inside method of ClassA");
	}

	private void setprivateA() {
		System.out.println("setprivateA... called");
	}

	void defaultA() {
		System.out.println("default method is ... called");
	}

	public void publicA() {
		System.out.println("public method is ... called");
	}

	protected void protectedA() {
		System.out.println("protected method is ... called");
	}
	
	
	public static void main(String[] args) {
		ClassA obj = new ClassA();
		
		obj.setprivateA();
		
		System.out.println(obj.privateA);
	}
}
