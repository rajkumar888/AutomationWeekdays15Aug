package methodOverriding2;

public class MethodOverridingImpl {
	
	public static void main(String[] args) {
		
//		ChildtClassB obj = new ChildtClassB();
	
//		obj.commonMethod();
		
//		ParenntClassA obj1 = new ParenntClassA();
//		obj1.commonMethod();
		
//		System.out.println("........................");
		ParenntClassA obj1 = new ChildtClassB();
//		
		obj1.commonMethod();
//
//		System.out.println("........................");
//		((ChildtClassB)obj1).childclassmethod();
//		((ChildtClassB)obj1).method3();
		
//		System.out.println(obj1.getClass().getSimpleName());
//		System.out.println(obj1.getClass().getSuperclass().getSimpleName());
		System.out.println("........................");
		
		
		try {
			obj1.getClass()
			.getSuperclass()
			.getMethod("commonMethod", new Class[]{})
			.invoke(obj1.getClass().getSuperclass().newInstance(), new Object[]{});
			} catch (Exception e) {
			e.printStackTrace();
		} 
//		
//		System.out.println("........................");
		
//		((ChildtClassB)obj1).covariantReturnType();
//		System.out.println("........................");
//		
//		
//		
		

	}

}
