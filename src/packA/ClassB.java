package packA;



public class ClassB extends ClassA{
	
	private int privateB;
	
	int defaultB;
	
	protected int protectedB;
	
	public int publicB;
	
	
	public void test(){
		
		System.out.println("inside method of ClassB");
	}

	
	public void demoAccess(){
//		System.out.println(privateA);
		
		System.out.println(defaultA);
		System.out.println(protectedA);
		System.out.println(publicA);
		
	}
	

	
	public static void main(String[] args) {
		
		ClassB obj = new ClassB();
		
		
	}
	
	

}
