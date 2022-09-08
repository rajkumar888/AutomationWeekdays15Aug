package methodOverriding2;

public class ChildtClassB extends ParenntClassA{

	// method overloading demo
	public void method3() {
		System.out.println("method3 form ChildtClassB");
	}

	// for over riding demo
	public void commonMethod() {
//		super.commonMethod();
		System.out.println("commonMethod form ChildtClassB");
	}
	
	// for over riding demo
	public ChildtClassB covariantReturnType() {
		System.out.println("covariantReturnType form ChildtClassB");
		return new ChildtClassB();
	}
	
	
	public void childclassmethod(){
		System.out.println("childclassmethod form ChildtClassB");
	}
	
	public static void teststatic(){
		System.out.println("static method overridign test Class B");
	}

}
