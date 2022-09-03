package abstractDemo;

public class DemoChildAbstract extends ChildAbstractClassDemo{

	@Override
	public void testabstractmethod() {
			System.out.println("Demo test abstract method");
	}

	@Override
	public void show() {
		
		System.out.println("Demo test show method");
	}
	
	public DemoChildAbstract(){
		
	System.out.println("default constructor from demochildabstract classed called");
	}
	
	public DemoChildAbstract(int x){
		super( x);	
		}
	

}
