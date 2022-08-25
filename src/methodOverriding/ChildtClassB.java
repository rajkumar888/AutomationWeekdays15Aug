package methodOverriding;

public class ChildtClassB extends ParenntClassA{

	public void method3() {
		System.out.println("method3 from ChildtClassB");
	}

	// for over riding demo
	public void commonMethod() {
//		super.commonMethod();
		System.out.println("commonMethod from ChildtClassB");
	}
	
	
	public ChildtClassB covariantReturnType() {
		System.out.println("covariantReturnType form ChildtClassB");
		return new ChildtClassB();
	}
	

}
