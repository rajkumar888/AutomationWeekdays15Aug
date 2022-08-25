package methodOverriding;

public class ParenntClassA {

	public void method1() {

		System.out.println("method1 from ParenntClassA");
	}

	// for over riding demo
	public void commonMethod() {
		System.out.println("commonMethod from ParenntClassA");
	}
	
	public void method3(int x) {
		System.out.println("method3 form ParenntClassA");
	}
	
	
	public ParenntClassA covariantReturnType() {
		System.out.println("covariantReturnType form ParenntClassA");
		return new ParenntClassA();
	}
	

}
