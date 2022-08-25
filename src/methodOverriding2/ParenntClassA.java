package methodOverriding2;

public class ParenntClassA {

	public void method1() {

		System.out.println("metho1 form ParenntClassA");
	}

	// for over riding demo
	public void commonMethod() {
		System.out.println("commonMethod form ParenntClassA");
	}
	
	public void method3(int x) {
		System.out.println("method3 form ParenntClassA");
	}
	
	// for over riding demo
	public ParenntClassA covariantReturnType() {
		System.out.println("covariantReturnType form ParenntClassA");
		return new ParenntClassA();
	}
	

}
