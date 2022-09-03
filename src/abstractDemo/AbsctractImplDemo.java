package abstractDemo;

public class AbsctractImplDemo extends AbstractClassDemoParent{

	
	public AbsctractImplDemo(){
		System.out.println("constructor is called..... from AbsctractImplDemo");
	}
	
	
	
	
	public static void main(String[] args) {
	
		
		AbsctractImplDemo obj = new AbsctractImplDemo();
		
		obj.showX();
		

	}

	@Override
	public void abstractmethod1() {
	
		System.out.println("Demo we are in Abstract Implmentation Class.....111");
		
	}




	@Override
	public void abstractmethod2() {
		System.out.println("Demo we are in Abstract Implmentation Class.....2222");
		
	}




	@Override
	public void abstractmethod3() {
		// TODO Auto-generated method stub
		
		System.out.println("Demo we are in Abstract Implmentation Class.....333");
		
	}




	@Override
	protected void test(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
